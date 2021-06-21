package com.bagasbest.experto.myTourism.favorite

import androidx.lifecycle.ViewModel
import com.bagasbest.experto.myTourism.core.data.TourismRepository
import com.bagasbest.experto.myTourism.core.domain.usecase.TourismUseCase

class FavoriteViewModel(tourismUseCase: TourismUseCase) : ViewModel() {

    val favoriteTourism = tourismUseCase.getFavoriteTourism()

}