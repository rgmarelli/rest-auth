package com.restauth.entities;

public class Thing {

    private final long id;
    private final String message;

    public Thing(long id, String message) {
        this.id = id;
        this.message = message;
    }

    public long getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }
}