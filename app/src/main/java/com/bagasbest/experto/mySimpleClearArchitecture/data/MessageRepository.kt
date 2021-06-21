package com.bagasbest.experto.mySimpleClearArchitecture.data

import com.bagasbest.experto.mySimpleClearArchitecture.domain.IMessageRepository
import com.bagasbest.experto.mySimpleClearArchitecture.domain.MessageEntity

class MessageRepository(private val messageDataSource: IMessageDataSource) : IMessageRepository {

    override fun getWelcomeMessage(name: String) = messageDataSource.getMessageFromSource(name)
}