package com.simba.movie_kompose.data.dao

import androidx.paging.PagingSource
import androidx.room.*
import com.simba.movie_kompose.domain.model.Movie
import kotlinx.coroutines.flow.Flow

@Dao
interface MovieDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addMovies(movies: List<Movie>)

    @Query("SELECT * FROM movies")
    fun getAllMovies(): PagingSource<Int, Movie>

    @Query("SELECT * FROM movies WHERE movieId = :movieId")
    fun getMovieById(movieId: Int): Flow<Movie>

    @Delete
    suspend fun deleteAllMovies()
}