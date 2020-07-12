package com.androidtutz.ahmedkhozam.moviesapp.service;

import com.androidtutz.ahmedkhozam.moviesapp.model.MovieDBResponse;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;


public interface MoviesDataService {


    @GET("movie/popular")
    Observable<MovieDBResponse> getPopularMoviesWithRx(@Query("api_key") String apiKey);


}
