package com.simba.movie_kompose.data.api

import com.simba.movie_kompose.domain.model.MovieList
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieApi {
    @GET("movie/popular")
    suspend fun getPopularMovies(
        @Query(
            "api_key"
        ) apiKey: String,
        @Query("page") page: Int = 1,
    ): Response<MovieList>
}