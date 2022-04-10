package com.akhdanpangestuaji.cleanarchitecturelearn.di

import com.akhdanpangestuaji.cleanarchitecturelearn.domain.MessageUseCase

object Injection {
    fun provideUseCase(): MessageUseCase {
        val messageRepository = provideRepository()
        return  messageRepository(messageRepository)
    }
}