package com.example.a09;

public class Restaurant {
    private int imageResource;
    private String name;

    public Restaurant(int imageResource, String name) {
        this.imageResource = imageResource;
        this.name = name;
    }

    public int getImageResource() {
        return imageResource;
    }

    public String getName() {
        return name;
    }
}
