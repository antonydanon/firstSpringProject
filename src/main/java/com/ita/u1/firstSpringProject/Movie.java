package com.ita.u1.firstSpringProject;

public class Movie {
    String name;
    String genre;

    public Movie(String name, String genre) {
        this.name = name;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return name + ": " + genre;
    }
}
