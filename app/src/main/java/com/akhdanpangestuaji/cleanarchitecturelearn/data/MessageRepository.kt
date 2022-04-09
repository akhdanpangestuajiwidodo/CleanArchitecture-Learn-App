package com.akhdanpangestuaji.cleanarchitecturelearn.data

import com.akhdanpangestuaji.cleanarchitecturelearn.domain.IMessageRepository
import com.akhdanpangestuaji.cleanarchitecturelearn.domain.MessageEntity

class MessageRepository(private  val messageDataSource: IMessageDataSource): IMessageRepository {
    override fun getWelcomeMessage(name: String): MessageEntity = messageDataSource.getMessageFromSource(name)

}