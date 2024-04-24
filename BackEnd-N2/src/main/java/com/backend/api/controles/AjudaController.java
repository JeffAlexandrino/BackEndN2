package com.backend.api.controllers;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
//---------------------------------------------------------------
class estudante {
    public final String estudante = "Jefferson Alexandrino";
    public final String projeto = "Books Backlog";
}
//---------------------------------------------------------------
@RestController
public class helpController {

    @GetMapping("/teste")
    public ResponseEntity<Object> teste(){
        return ResponseEntity.status(200).body(new Object());
    }
    
    @GetMapping("/ajuda")
    public ResponseEntity<estudante> ajuda(){
        return ResponseEntity.status(200).body(new estudante());
    }
}