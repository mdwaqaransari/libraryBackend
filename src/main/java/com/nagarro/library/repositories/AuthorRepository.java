package com.nagarro.library.repositories;

import com.nagarro.library.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Integer> {

    public Author findByName(String name);
}
