package com.codeGodfather.giflib.Model;

/**
 * Created by godfather on 2017-08-23.
 */
import java.time.LocalDate;
public class Gif {
    private String name;
    private int categoryId;
    private LocalDate date;
    private String username;
    private boolean favorite;

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public Gif(String name, int categoryId, LocalDate date, String username, boolean favorite) {
        this.name = name;
        this.categoryId=categoryId;
        this.date = date;
        this.username = username;
        this.favorite = favorite;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }
}