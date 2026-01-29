package com.algorithmvisualizer.model;

public class Algorithm {
    private String id;
    private String name;
    private String category;
    private String description;
    private String timeComplexity;
    private String spaceComplexity;
    private String preview;

    public Algorithm() {
    }

    public Algorithm(String id, String name, String category, String description, 
                    String timeComplexity, String spaceComplexity, String preview) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.description = description;
        this.timeComplexity = timeComplexity;
        this.spaceComplexity = spaceComplexity;
        this.preview = preview;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTimeComplexity() {
        return timeComplexity;
    }

    public void setTimeComplexity(String timeComplexity) {
        this.timeComplexity = timeComplexity;
    }

    public String getSpaceComplexity() {
        return spaceComplexity;
    }

    public void setSpaceComplexity(String spaceComplexity) {
        this.spaceComplexity = spaceComplexity;
    }

    public String getPreview() {
        return preview;
    }

    public void setPreview(String preview) {
        this.preview = preview;
    }
}
