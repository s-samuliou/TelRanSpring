package com.telran.org.coffee.model;

import java.util.UUID;

public class Coffee {

    private String id;
    private String name;

    public Coffee() {
        this.id = UUID.randomUUID().toString();
    }

    public Coffee(String name) {
        this.name = name;
        this.id = UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
