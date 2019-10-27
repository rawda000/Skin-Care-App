package com.rawda.skincare.model;

public class Article {
    private String title;
    private int image;
    private String filePath;
    private boolean isFavourite;


    public Article() {
        isFavourite = false;
    }

    public Article(String title, String filePath) {
        this.title = title;
        this.filePath = filePath;
        isFavourite = false;
    }

    public Article(String title) {
        this.title = title;
        isFavourite = false;
    }

    public Article(String title, int image, String filePath) {
        this.title = title;
        this.image = image;
        this.filePath = filePath;
        isFavourite = false;
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

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public boolean isFavourite() {
        return isFavourite;
    }

    public void setFavourite(boolean favourite) {
        isFavourite = favourite;
    }

    @Override
    public String toString() {
        return "Article{" +
                "title='" + title + '\'' +
                ", image=" + image +
                ", filePath='" + filePath + '\'' +
                ", isFavourite=" + isFavourite +
                '}';
    }
}
