package com.bagasbest.experto.mySimpleClearArchitecture.domain

interface IMessageRepository {
    fun getWelcomeMessage(name: String): MessageEntity
}