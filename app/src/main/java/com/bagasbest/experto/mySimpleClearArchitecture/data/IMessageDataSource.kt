package com.bagasbest.experto.mySimpleClearArchitecture.data

import com.bagasbest.experto.mySimpleClearArchitecture.domain.MessageEntity

interface IMessageDataSource {
    fun getMessageFromSource(name: String): MessageEntity
}