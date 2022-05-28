package com.simba.movie_kompose.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.simba.movie_kompose.data.dao.MovieDao
import com.simba.movie_kompose.data.dao.MovieRemoteKeysDao
import com.simba.movie_kompose.domain.model.Movie
import com.simba.movie_kompose.domain.model.MovieRemoteKeys

@Database(
    entities = [Movie::class, MovieRemoteKeys::class],
    version = 1,
    exportSchema = false
)
abstract class MovieDb : RoomDatabase() {
    abstract fun movieDao(): MovieDao
    abstract fun movieRemoteKeysDao(): MovieRemoteKeysDao
}