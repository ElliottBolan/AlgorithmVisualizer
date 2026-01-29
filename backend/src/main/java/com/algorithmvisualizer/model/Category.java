package com.algorithmvisualizer.model;

import java.util.List;

public class Category {
    private String id;
    private String name;
    private String description;
    private List<Algorithm> algorithms;

    public Category() {
    }

    public Category(String id, String name, String description, List<Algorithm> algorithms) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.algorithms = algorithms;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Algorithm> getAlgorithms() {
        return algorithms;
    }

    public void setAlgorithms(List<Algorithm> algorithms) {
        this.algorithms = algorithms;
    }
}
