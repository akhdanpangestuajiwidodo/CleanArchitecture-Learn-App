package com.akhdanpangestuaji.cleanarchitecturelearn.data

import com.akhdanpangestuaji.cleanarchitecturelearn.domain.MessageEntity

interface IMessageDataSource {
    fun getMessageFromSource(name: String): MessageEntity
}