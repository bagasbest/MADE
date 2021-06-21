package com.bagasbest.experto.myTourism.home

import androidx.lifecycle.ViewModel
import com.bagasbest.experto.myTourism.core.domain.usecase.TourismUseCase

class HomeViewModel(tourismUseCase: TourismUseCase) : ViewModel() {

    val tourism = tourismUseCase.getAllTourism()

}