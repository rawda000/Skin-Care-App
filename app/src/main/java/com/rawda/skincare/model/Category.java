package com.rawda.skincare.model;

import java.util.Arrays;

public class Category {
    private String title;
    private int image;
    private Article articles[];
    private boolean isFavourite = false;

    public Category(String title) {
        this.title = title;
    }

    public Category(String title, Article[] articles) {
        this.title = title;
        this.articles = articles;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public Article[] getArticles() {
        return articles;
    }

    public void setArticles(Article[] articles) {
        this.articles = articles;
    }

    public boolean isFavourite() {
        return isFavourite;
    }

    public void setFavourite(boolean favourite) {
        isFavourite = favourite;
    }

    @Override
    public String toString() {
        return "Category{" +
                "title='" + title + '\'' +
                ", image=" + image +
                ", articles=" + Arrays.toString(articles) +
                ", isFavourite=" + isFavourite +
                '}';
    }
}
