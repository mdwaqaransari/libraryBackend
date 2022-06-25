package com.nagarro.library.services;

import com.nagarro.library.models.Author;
import com.nagarro.library.models.Book;
import com.nagarro.library.repositories.AuthorRepository;
import com.nagarro.library.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LibraryService {

    @Autowired
    BookRepository bookRepository;

    @Autowired
    AuthorRepository authorRepository;

    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }

    public Book getBookById(String id){
        return bookRepository.findByCode(id);
    }

    public boolean addBook(Book book){
        try{
            // persisting book to the database
            bookRepository.save(book);
            return true;
        }catch (Exception e){
            // exception handling
            e.printStackTrace();
            return false;
        }
    }

    public boolean removeBook(String code) {
        System.out.println(code+" aa rhi");
        try{
            Book book = bookRepository.findByCode(code);
            bookRepository.deleteById(book.getId());
            return true;
        }catch(Exception e){
            return false;
        }
    }

    public boolean updateBook(Book book) {
        try{
            bookRepository.save(book);
            return true;
        }catch(Exception e){
            return false;
        }
    }
}
