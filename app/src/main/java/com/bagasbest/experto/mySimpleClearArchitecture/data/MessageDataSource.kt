package com.bagasbest.experto.mySimpleClearArchitecture.data

import com.bagasbest.experto.mySimpleClearArchitecture.domain.MessageEntity

class MessageDataSource : IMessageDataSource {
    override fun getMessageFromSource(name: String) = MessageEntity("Hello $name! Welcome to Clean Architecture")
}