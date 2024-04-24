package com.backend.api.controllers;
import com.backend.api.models.*;
import com.backend.api.models.exceptions.TmdbServerOffException;
import com.backend.api.models.tmdb.BookResult;
import com.backend.api.services.Booklist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
//---------------------------------------------------------------

@RestController //Troca de informações sobre o estado dos livros
public class backlogController {
    @Autowired
    private Readlist Readlist;

    private BookDetails mapInsertBook(InsertBook insertBook){
        return new bookCustomDetails(
            insertBook.title,
            insertBook.type,
            insertBook.author,
            insertBook.status,
            insertBook.conclusionDate,
            insertBook.originalTitle
        );
    }

    @GetMapping("/readlist")
    public ResponseEntity<Object> getList(){
        ArrayList<ReadlistData> list = Readlist.getReadlist();
        return ResponseEntity.status(200).body(list);
    }

    @GetMapping("/readlistfilter")
    public ResponseEntity<Object> getListFilter(WatchlistFilters filter) {
        ArrayList<ReadlistData> list = Readlist.getReadlistFilter(filter);
        return ResponseEntity.status(200).body(list);
    }


    @GetMapping("/readlist")
    public ResponseEntity<Object> GetBook(@RequestParam Integer id) {
        ReadlistData book = Readlist.getBook(id);
        return ResponseEntity.status(200).body(book);
    }

    @PostMapping("/watchlist")
    public ResponseEntity<Object> addBook(@RequestParam @Nullable Integer tmdbId, @RequestBody InsertBook insertBook) {
        BookDetails book = mapInsertBook(InsertBook);
        try{
            Integer result = watchlistService.addBook(tmdbId, book);
            return ResponseEntity.status(201).body(new ReturnBook(result));
        } catch (TmdbServerOffException e){
            return ResponseEntity.status(503).body(new ErrorMessage(e.message));
        }
    }

    // editar filme
    @PutMapping("/watchlist")
    public ResponseEntity<Object> editBook(@RequestParam Integer id, @RequestParam Integer tmdbId, @RequestBody InsertBook insertBook) {
        BookDetails book = mapInsertBook(insertBook);
        try{
            Integer result = readlist.editBook(id, tmdbId, book);
            return ResponseEntity.status(300).body(new ReturnLivro(result));
        } catch (TmdbServerOffException e){
            return ResponseEntity.status(650).body(new ErrorMessage(e.message));
        }
    }

    @DeleteMapping("/watchlist")
    public ResponseEntity<Object> RemoveLivro(@RequestParam("id") int id) {
        Integer result = watchlistService.removeLivro(id);
        return ResponseEntity.status(300).body(new ReturnLivro(result));
    }
}