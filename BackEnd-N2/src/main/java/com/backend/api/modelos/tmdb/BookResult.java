package com.backend.api.models.tmdb;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

public class BookResult {
    @JsonProperty("id")
    public int id;
    
    @JsonProperty("original_title")
    public String originalTitle;
    
    @JsonProperty("adult")
    public boolean adult;

    @JsonProperty("backdrop_path")
    public String backdropPath;

    @JsonProperty("genre_ids")
    public ArrayList<Integer> genreIds;

    @JsonProperty("original_language")
    public String originalLanguage;

    @JsonProperty("overview")
    public String overview;

    @JsonProperty("popularity")
    public double popularity;

    @JsonProperty("release_date")
    public String releaseDate;

    @JsonProperty("title")
    public String title;
}