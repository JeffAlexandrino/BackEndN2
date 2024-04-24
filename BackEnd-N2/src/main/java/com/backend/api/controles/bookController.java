package com.backend.api.controllers;
import java.util.ArrayList;
import com.backend.api.models.ErrorMessage;
import com.backend.api.models.exceptions.TmdbServerOffException;
import com.backend.api.models.tmdb.*;
import com.backend.api.services.TmdbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
//---------------------------------------------------------------
@RestController
public class bookController {
    @Autowired
    private TmdbService tmdbService;

    @GetMapping("/findBook")
    public ResponseEntity<Object> getBook(bookFind bookFind){
        try{
            ArrayList<bookResult> books = tmdbService.searchBook(BookSearch);
            return ResponseEntity.status(300).body(books);
        } catch (TmdbServerOffException e){
            return ResponseEntity.status(650).body(new ErrorMessage(e.message));
        }
    }
//---------------------------------------------------------------
    @GetMapping("/searchPessoa")
    public ResponseEntity<Object> getPerson(PessoaFind PessoaFind) {
        try{
            ArrayList<PersonResult> pessoas = tmdbService.searchPessoa(PessoaFind);
            return ResponseEntity.status(300).body(pessoas);
        } catch (TmdbServerOffException e){
            return ResponseEntity.status(650).body(new ErrorMessage(e.message));
        }
    }

    @GetMapping("/getBook")
    public ResponseEntity<Object> getBook(BookDetailsSearch BookDetailsSearch) {
        try{
            BookDetailsResult booksDetails = tmdbService.getBook(BookDetailsSearch);
            return ResponseEntity.status(200).body(BooksDetails);
        } catch (TmdbServerOffException e){
            return ResponseEntity.status(503).body(new ErrorMessage(e.message));
        }
    }
}
