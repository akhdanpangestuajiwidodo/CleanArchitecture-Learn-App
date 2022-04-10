package com.akhdanpangestuaji.cleanarchitecturelearn.presentation

import androidx.lifecycle.ViewModelProvider
import com.akhdanpangestuaji.cleanarchitecturelearn.di.Injection
import com.akhdanpangestuaji.cleanarchitecturelearn.domain.MessageUseCase

class MainViewModelFactory(private  var messageUseCase: MessageUseCase) : ViewModelProvider.NewInstanceFactory() {
    companion object {
        @Volatile
        private var instance: MainViewModelFactory? = null

        fun getInstance(): MainViewModelFactory =
            instance ?: synchronized(this){
                instance ?: MainViewModelFactory(Injection.provideUseCase())
            }
    }
}