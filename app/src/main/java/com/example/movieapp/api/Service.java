package com.example.movieapp.api;

import com.example.movieapp.model.MoviesResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Service {

    @GET("movie/popular")
    Call<MoviesResponse> getPopularMovies(@Query("api_key") String apiKey);

//    @GET("movie/top_rated")
//    Call<MoviesResponse> getTopRatedMovies(@Query("d4b59e98512c87b67c559a21d9c6c2a3") String apiKey);

}
