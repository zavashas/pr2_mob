package com.example.helpik2;



public class Item {
    private String text;
    private int imageResId;
    private String description;

    public Item(String text, int imageResId, String description) {
        this.text = text;
        this.imageResId = imageResId;
        this.description = description;
    }

    public String getText() {
        return text;
    }

    public int getImageResId() {
        return imageResId;
    }

    public String getDescription() {
        return description;
    }
}