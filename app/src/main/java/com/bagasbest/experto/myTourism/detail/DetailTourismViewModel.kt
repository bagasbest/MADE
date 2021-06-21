package com.bagasbest.experto.myTourism.detail

import androidx.lifecycle.ViewModel
import com.bagasbest.experto.myTourism.core.domain.model.Tourism
import com.bagasbest.experto.myTourism.core.domain.usecase.TourismUseCase

class DetailTourismViewModel(private val useCase: TourismUseCase) : ViewModel() {
    fun setFavoriteTourism(tourism: Tourism, newStatus: Boolean) =
        useCase.setFavoriteTourism(tourism, newStatus)
}