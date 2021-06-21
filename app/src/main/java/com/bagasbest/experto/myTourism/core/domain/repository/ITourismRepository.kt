package com.bagasbest.experto.myTourism.core.domain.repository

import androidx.lifecycle.LiveData
import com.bagasbest.experto.myTourism.core.data.Resource
import com.bagasbest.experto.myTourism.core.domain.model.Tourism

interface ITourismRepository {

    fun getAllTourism() : LiveData<Resource<List<Tourism>>>

    fun getFavoriteTourism() : LiveData<List<Tourism>>

    fun setFavoriteTourism(tourism: Tourism, state: Boolean)

}