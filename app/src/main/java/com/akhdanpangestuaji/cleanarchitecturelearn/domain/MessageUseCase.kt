package com.akhdanpangestuaji.cleanarchitecturelearn.domain

interface MessageUseCase {
    fun getMessage(name: String) : MessageEntity
}