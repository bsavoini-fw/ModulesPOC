package com.bsavoini.usecases.converter

import com.bsavoini.repository.models.FavoriteEntity
import com.bsavoini.repository.models.MediaTypeEntity
import com.bsavoini.usecases.domainobjects.FavoriteDO
import com.bsavoini.usecases.domainobjects.MediaTypeDO

fun FavoriteDO.toFavoriteEntity() = FavoriteEntity(
    id = this.id,
    mediaType = MediaTypeEntity.valueOf(this.mediaType.name)
)

fun FavoriteEntity.toFavoriteDO() = FavoriteDO(
    id = this.id,
    mediaType = MediaTypeDO.valueOf(this.mediaType.name)
)
