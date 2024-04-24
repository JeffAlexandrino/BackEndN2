package com.backend.api.models.tmdb;

public class MovieDetailsSearch {
    public Integer bookId;
    public String language = "en-US";

    public BookDetailsSearch(Integer bookId) {
        this.movieId = bookId;
    }
    //-------------------------------------
    public Integer getBookId(){
        return this.movieId;
    }
    public String getLanguage(){
        return this.language;
    }
    //-------------------------------------
    public void setBookId(Integer bookid){
        this.movieId = bookid;
    }
    public void setLanguage(String language){
        this.language = language;
    }
}