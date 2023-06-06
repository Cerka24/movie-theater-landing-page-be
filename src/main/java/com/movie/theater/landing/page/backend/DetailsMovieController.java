package com.movie.theater.landing.page.backend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DetailsMovieController {
    private DetailsMovieService detailsMovieService;

    public DetailsMovieController(DetailsMovieService detailsMovieService) {
        this.detailsMovieService = detailsMovieService;
    }
    @GetMapping(value = "/{id}")
    public Movies getOpportunityId(@PathVariable Long id) {
        return detailsMovieService.getMovieId(id);
    }
}
