package com.nagarro.library.controllers;

import com.nagarro.library.models.Author;
import com.nagarro.library.payloads.AuthorPayload;
import com.nagarro.library.services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AuthorController {

    @Autowired
    AuthorService authorService;

    @GetMapping("/author/getById/{id}")
    public Optional<Author> getAuthor(@PathVariable int id){
        return authorService.getAuthorById(id);
    }

    @GetMapping("/author/getByName/{name}")
    public Author getAuthor(@PathVariable String name){
        return authorService.getAuthorByName(name);
    }

    @PostMapping("/author/add")
    public Author addAuthor(@RequestBody AuthorPayload authorPayload){
        Author author = new Author();
        author.setName(authorPayload.getName());
        return authorService.addAuthor(author);
    }

    @GetMapping("/getAllAuthors")
    public List<Author> getAuthors(){
        return authorService.getAllAuthors();
    }
}
