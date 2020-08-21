package com.example.restservices;

public class Greeting {
    private final long id;
    private final String content;
    private final long number;


    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
        number = 1;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
