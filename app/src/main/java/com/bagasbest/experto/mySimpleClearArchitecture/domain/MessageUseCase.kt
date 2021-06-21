package com.bagasbest.experto.mySimpleClearArchitecture.domain

interface MessageUseCase {
    fun getMessage(name: String): MessageEntity
}