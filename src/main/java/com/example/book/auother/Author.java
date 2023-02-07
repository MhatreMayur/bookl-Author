package com.example.book.auother;

public class Author {
    private String name;
    private  int  pages;
    private  String gender;
    private double rating;

    public Author(String name, int pages, String gender, double rating) {
        this.name = name;
        this.pages = pages;
        this.gender = gender;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
