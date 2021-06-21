package com.bagasbest.experto.mySimpleClearArchitecture.domain

class MessageInteractor(private val messageRepository: IMessageRepository)
    : MessageUseCase {
    override fun getMessage(name: String): MessageEntity {
        return messageRepository.getWelcomeMessage(name)
    }
}