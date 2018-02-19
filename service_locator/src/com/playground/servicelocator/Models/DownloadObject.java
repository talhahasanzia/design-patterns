package com.playground.servicelocator.Models;

import java.io.Serializable;

public class DownloadObject implements Serializable {

    private String path;
    private String description;
    private String name;

    public DownloadObject(String path, String description, String name) {
        this.path = path;
        this.description = description;
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }
}
