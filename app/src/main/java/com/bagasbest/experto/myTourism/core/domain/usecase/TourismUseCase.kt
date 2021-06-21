package com.bagasbest.experto.myTourism.core.domain.usecase

import androidx.lifecycle.LiveData
import com.bagasbest.experto.myTourism.core.data.Resource
import com.bagasbest.experto.myTourism.core.domain.model.Tourism

interface TourismUseCase {
    fun getAllTourism(): LiveData<Resource<List<Tourism>>>
    fun getFavoriteTourism(): LiveData<List<Tourism>>
    fun setFavoriteTourism(tourism: Tourism, state: Boolean)
}