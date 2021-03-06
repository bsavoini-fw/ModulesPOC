package com.bsavoini.repository

import com.bsavoini.repository.models.MovieEntity
import com.bsavoini.repository.models.TvShowEntity

interface MediaRepository {

    suspend fun getMovies(): List<MovieEntity>

    suspend fun getMovie(id: Int): MovieEntity

    suspend fun getTvShows(): List<TvShowEntity>

    suspend fun getTvShow(id: Int): TvShowEntity
}