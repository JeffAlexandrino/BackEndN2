package com.backend.api.models.exceptions;

public class TmdbServerOffException extends Exception{
    public String message = "A API está Offline. Por favor Tente novamente mais tarde.";
    public TmdbServerOffException(String message){
        super(message);
    }
}