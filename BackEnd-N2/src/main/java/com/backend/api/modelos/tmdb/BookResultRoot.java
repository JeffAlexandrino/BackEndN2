package com.backend.api.models.tmdb;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;

public class BookResultRoot {
    @JsonProperty("page")
    public Integer page;

    @JsonProperty("total_pages")
    public int totalPages;

    @JsonProperty("total_results")
    public int totalResults;
}

