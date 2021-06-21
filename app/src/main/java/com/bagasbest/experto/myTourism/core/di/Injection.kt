package com.bagasbest.experto.myTourism.core.di

import android.content.Context
import com.bagasbest.experto.myTourism.core.data.TourismRepository
import com.bagasbest.experto.myTourism.core.data.source.local.LocalDataSource
import com.bagasbest.experto.myTourism.core.data.source.local.room.TourismDatabase
import com.bagasbest.experto.myTourism.core.data.source.remote.RemoteDataSource
import com.bagasbest.experto.myTourism.core.domain.repository.ITourismRepository
import com.bagasbest.experto.myTourism.core.domain.usecase.TourismInteractor
import com.bagasbest.experto.myTourism.core.domain.usecase.TourismUseCase
import com.bagasbest.experto.myTourism.core.utils.AppExecutors
import com.bagasbest.experto.myTourism.core.utils.JsonHelper

object Injection {
    fun provideRepository(context: Context): ITourismRepository {
        val database = TourismDatabase.getInstance(context)

        val remoteDataSource = RemoteDataSource.getInstance(JsonHelper(context))
        val localDataSource = LocalDataSource.getInstance(database.tourismDao())
        val appExecutors = AppExecutors()

        return TourismRepository.getInstance(remoteDataSource, localDataSource, appExecutors)
    }

    fun provideTourUseCase(context: Context): TourismUseCase {
        val repository = provideRepository(context)
        return TourismInteractor(repository)
    }
}