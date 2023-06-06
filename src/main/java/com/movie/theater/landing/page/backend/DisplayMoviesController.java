package com.movie.theater.landing.page.backend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class DisplayMoviesController {
    private DisplayMovieService service;

    public DisplayMoviesController(DisplayMovieService service) {
        this.service = service;
    }

    @GetMapping(value = "/moviesLanding")
    public List<Movies> getOpportunity() {
        return service.getMovie();
    }
}
