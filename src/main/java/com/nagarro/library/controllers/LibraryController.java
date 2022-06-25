package com.nagarro.library.controllers;

import com.nagarro.library.models.Book;
import com.nagarro.library.payloads.BookPayload;
import com.nagarro.library.services.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.List;

@RestController
public class LibraryController {

    @Autowired
    LibraryService libraryService;

    @GetMapping("/getAllBooks")
    public List<Book> getAllBooks(){
        return libraryService.getAllBooks();
    }

    @GetMapping("/book/{id}")
    public Book getBook(@PathVariable String id){
        return libraryService.getBookById(id);
    }

    @PostMapping("/book/add")
    public ResponseEntity<Book> addBook(@RequestBody BookPayload bookPayload){
        System.out.println(bookPayload.toString());
        Date date = new Date(System.currentTimeMillis());
        Book book = new Book();
        book.setCode(bookPayload.getCode());
        book.setAuthor(bookPayload.getAuthor());
        book.setName(bookPayload.getName());
        book.setDateAdded(date);
        if(libraryService.addBook(book)){
            return new ResponseEntity<>(book, HttpStatus.OK);
        }else{
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    @PostMapping("/book/delete")
    public ResponseEntity<Book> deleteBook(@RequestBody Book book){
        System.out.println(book.toString());
        if(libraryService.removeBook(book.getCode())){
            return new ResponseEntity(HttpStatus.OK);
        }else{
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/book/update")
    public ResponseEntity<Book> updateBook(@RequestBody Book book){
        Date date = new Date(System.currentTimeMillis());
        book.setDateAdded(date);
        if(libraryService.updateBook(book)){
            return new ResponseEntity<>(book, HttpStatus.ACCEPTED);
        }else{
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/book/edit/{id}")
    public Book editBook(@PathVariable String id){
        return libraryService.getBookById(id);
    }

}
