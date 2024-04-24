package com.backend.api.models;
import java.util.ArrayList;
import java.util.Date;
//----------------------------------------
public class BookCustomDetails {
    public String title;
    public ArrayList<Integer> type;
    public String author;
    public Short status;
    public Date conclusionDate;
    public String originalTitle;
    public BookCustomDetails(
            String title,
            ArrayList<Integer> type,
            String author,
            Short status,
            String originalTitle
    ) 
    {
        this.title = title;
        this.type = type;
        this.author = author;
        this.status = status;
        this.originalTitle = originalTitle;
    }
}
