package com.nagarro.library.payloads;

public class BookPayload {
    private String name;
    private String author;
    private String code;

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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "BookPayload{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}
