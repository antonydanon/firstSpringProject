package com.ita.u1.firstSpringProject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigApp {
    @Bean
    public MovieRepository dbMovieRepository() {
        return new DbMovieRepository();
    }
}
