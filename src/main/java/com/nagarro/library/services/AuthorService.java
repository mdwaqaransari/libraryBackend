package com.nagarro.library.services;

import com.nagarro.library.models.Author;
import com.nagarro.library.repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuthorService {

    @Autowired
    AuthorRepository authorRepository;

    public Optional<Author> getAuthorById(int id){
        return authorRepository.findById(id);
    }

    public Author getAuthorByName(String name) {
        return authorRepository.findByName(name);
    }

    public Author addAuthor(Author author) {
        return authorRepository.save(author);
    }

    public List<Author> getAllAuthors() {
        return authorRepository.findAll();
    }
}
