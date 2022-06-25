package com.nagarro.library.models;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(unique = true)
    private String code;
    private String name;
    private String author;
    private Date dateAdded;

    public Book() {
    }

    public Book(String code, String name, String author, Date dateCreated) {
        this.code = code;
        this.name = name;
        this.author = author;
        this.dateAdded = dateCreated;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Date dateCreated) {
        this.dateAdded = dateCreated;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", dateCreated=" + dateAdded +
                '}';
    }
}
