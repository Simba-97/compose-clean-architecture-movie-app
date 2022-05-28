package com.simba.movie_kompose.domain.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable


data class MovieList(
    @Expose
    @SerializedName("page")
    val page: Int = 1,

    @Expose
    @SerializedName("results")
    val movies: List<Movie>,
) : Serializable