package com.ita.u1.firstSpringProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DbMovieRepository implements MovieRepository{
    @Override
    public List<Movie> findAll(){
        List<Movie> movies  = new ArrayList<>();
        Collections.addAll(movies, new Movie("Spider-man", "Adventure"),
                new Movie("Leon", "Action movie"));
        return movies;
    }
}
