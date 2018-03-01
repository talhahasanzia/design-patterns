package com.playground.servicelocator.Models;

import java.io.Serializable;

// Dummy Authentication response
public class User implements Serializable {

    private String name;
    private String id;

    public User(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }
}
