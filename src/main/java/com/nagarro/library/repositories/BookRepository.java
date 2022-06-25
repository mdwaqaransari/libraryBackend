package com.nagarro.library.repositories;

import com.nagarro.library.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
    Book findByCode(String code);

    void removeByCode(String code);

    void deleteByCode(String code);
}
