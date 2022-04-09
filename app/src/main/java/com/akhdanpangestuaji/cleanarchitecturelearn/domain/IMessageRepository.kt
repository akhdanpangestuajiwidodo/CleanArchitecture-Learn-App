package com.akhdanpangestuaji.cleanarchitecturelearn.domain

interface IMessageRepository {
    fun getWelcomeMessage(name: String): MessageEntity
}