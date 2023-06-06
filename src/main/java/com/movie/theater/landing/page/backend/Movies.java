package com.movie.theater.landing.page.backend;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Movies {
    private Long id;
    private String title;
    private String year;
    private String plot;
    private String poster;
}
