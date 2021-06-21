package com.bagasbest.experto.domain

import com.bagasbest.experto.mySimpleClearArchitecture.domain.IMessageRepository
import com.bagasbest.experto.mySimpleClearArchitecture.domain.MessageEntity
import com.bagasbest.experto.mySimpleClearArchitecture.domain.MessageInteractor
import com.bagasbest.experto.mySimpleClearArchitecture.domain.MessageUseCase
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito.*
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class MessageUseCaseTest {

    private lateinit var messageUseCase: MessageUseCase

    @Mock
    private lateinit var messageRepository: IMessageRepository

    @Before
    fun setUp() {
        messageUseCase = MessageInteractor(messageRepository)
        val dummyMessage = MessageEntity("Hello $NAME Welcome to Clean Architecture")
        `when`(messageRepository.getWelcomeMessage(NAME)).thenReturn(dummyMessage)
    }

    @Test
    fun `should get data from repository`() {
        val message = messageUseCase.getMessage(NAME)
        verify(messageRepository).getWelcomeMessage(NAME)
        verifyNoMoreInteractions(messageRepository)
        assertEquals("Hello $NAME Welcome to Clean Architecture", message.welcomeMessage)
    }

    companion object {
        const val NAME = "Bagas Pangestu"
    }
}