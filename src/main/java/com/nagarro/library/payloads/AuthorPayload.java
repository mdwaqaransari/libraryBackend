package com.nagarro.library.payloads;

public class AuthorPayload {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "AuthorPayload{" +
                "name='" + name + '\'' +
                '}';
    }
}
