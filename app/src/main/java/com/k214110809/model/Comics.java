package com.k214110809.model;

public class Comics {
    int ComicThumb;
    String ComicName;
    double ComicPrice;

    public int getComicThumb() {
        return ComicThumb;
    }

    public void setComicThumb(int comicThumb) {
        ComicThumb = comicThumb;
    }

    public String getComicName() {
        return ComicName;
    }

    public void setComicName(String comicName) {
        ComicName = comicName;
    }

    public double getComicPrice() {
        return ComicPrice;
    }

    public void setComicPrice(double comicPrice) {
        ComicPrice = comicPrice;
    }

    public Comics(int comicThumb, String comicName, double comicPrice) {
        ComicThumb = comicThumb;
        ComicName = comicName;
        ComicPrice = comicPrice;
    }
}
