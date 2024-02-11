package com.telran.org.coffee.model;

import java.util.UUID;

public class Tea {

    private String id;
    private String sort;

    public Tea(String sort) {
        this.id = UUID.randomUUID().toString();
        this.sort = sort;
    }

    public Tea() {
        this.id = UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }

    public String getSort() {
        return sort;
    }
}
