package com.movie.theater.landing.page.backend;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class DisplayMovieService {
    private HttpClientService httpClientService;

    public DisplayMovieService(HttpClientService httpClientService) {
        this.httpClientService = httpClientService;
    }

    public List<Movies> getMovie() {
        List<Movies> opportunityList = new ArrayList<>();
        List<Opportunity> opportunities = httpClientService.findAll();
        for (Opportunity opportunity : opportunities) {
            opportunityList.add(new OpportunityDto(opportunity.getId(),opportunity.getTitle(), opportunity.getDescription(), opportunity.getImage()));
        }

        return opportunityList;
    }
}
