package com.movie.theater.landing.page.backend;

@org.springframework.stereotype.Service
public class DetailsMovieService {
    private HttpClientService httpClientService;

    public DisplayMovieService(HttpClientService httpClientService) {
        this.httpClientService = httpClientService;
    }
    public Movies getMovieId(long id) {
        httpClientService.getById(id);
        return new Movies(id, "App Developer", "01/05/2023", "Design and develop the student volunteering app to make it user-friendly and easy to navigate.","https://buildfire.com/wp-content/uploads/2017/10/become-mobile-app-developer.jpg");
    }
}
