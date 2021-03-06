package com.bsavoini.interactor.model

data class FavoriteModel(
    val id: Int,
    val name : String,
    val posterUrl : String,
    val mediaType: MediaType)

enum class MediaType{
    MOVIE , TV_SHOW
}