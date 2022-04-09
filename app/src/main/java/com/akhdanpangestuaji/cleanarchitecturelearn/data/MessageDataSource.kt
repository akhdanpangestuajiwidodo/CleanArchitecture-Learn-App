package com.akhdanpangestuaji.cleanarchitecturelearn.data

import com.akhdanpangestuaji.cleanarchitecturelearn.domain.MessageEntity

class MessageDataSource: IMessageDataSource {
    override fun getMessageFromSource(name: String) = MessageEntity("Hello $name! welcome to clean archicture app")
}