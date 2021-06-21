package com.bagasbest.experto.mySimpleClearArchitecture.di

import com.bagasbest.experto.mySimpleClearArchitecture.data.IMessageDataSource
import com.bagasbest.experto.mySimpleClearArchitecture.data.MessageDataSource
import com.bagasbest.experto.mySimpleClearArchitecture.data.MessageRepository
import com.bagasbest.experto.mySimpleClearArchitecture.domain.IMessageRepository
import com.bagasbest.experto.mySimpleClearArchitecture.domain.MessageInteractor
import com.bagasbest.experto.mySimpleClearArchitecture.domain.MessageUseCase

object Injection {
    fun provideUseCase(): MessageUseCase {
        val messageRepository = provideRepository()
        return MessageInteractor(messageRepository)
    }

    private fun provideRepository() : IMessageRepository {
        val messageDataSource = provideDataSource()
        return MessageRepository(messageDataSource)
    }

    private fun provideDataSource(): IMessageDataSource {
        return MessageDataSource()
    }
}