package com.akhdanpangestuaji.cleanarchitecturelearn.di

import com.akhdanpangestuaji.cleanarchitecturelearn.data.MessageRepository
import com.akhdanpangestuaji.cleanarchitecturelearn.domain.IMessageRepository
import com.akhdanpangestuaji.cleanarchitecturelearn.domain.MessageInteractor
import com.akhdanpangestuaji.cleanarchitecturelearn.domain.MessageUseCase

object Injection {
    fun provideUseCase(): MessageUseCase {
        val messageRepository = provideRepository()
        return  MessageInteractor(messageRepository)
    }

    private fun provideRepository(): IMessageRepository{
        val messageDataSource = provideDataSource()
        return MessageRepository(messageDataSource)
    }


}