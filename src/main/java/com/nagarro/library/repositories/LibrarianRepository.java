package com.nagarro.library.repositories;

import com.nagarro.library.models.Librarian;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibrarianRepository extends JpaRepository<Librarian, Integer> {

    public Librarian findByUsername(String username);
}
