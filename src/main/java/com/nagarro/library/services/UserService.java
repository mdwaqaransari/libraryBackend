package com.nagarro.library.services;

import com.nagarro.library.models.Librarian;
import com.nagarro.library.repositories.LibrarianRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    LibrarianRepository librarianRepository;

    public Librarian getUserByUsername(String username){
        return librarianRepository.findByUsername(username);
    }

    public Optional<Librarian> getUserById(int id){
        return librarianRepository.findById(id);
    }
}
