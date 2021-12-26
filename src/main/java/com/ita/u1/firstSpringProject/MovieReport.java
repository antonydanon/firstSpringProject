package com.ita.u1.firstSpringProject;

import java.util.List;

public class MovieReport {
    private MovieRepository movieRepository;

    public MovieReport(MovieRepository movieRepository){
        this.movieRepository = movieRepository;
    }

    void generate(){
        MovieRepository movieRepository = new DbMovieRepository();
        List<Movie> movies = movieRepository.findAll();
        System.out.println(movies);
    }
}
