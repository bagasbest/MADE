package com.bagasbest.experto.mySimpleClearArchitecture.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.bagasbest.experto.mySimpleClearArchitecture.di.Injection
import com.bagasbest.experto.mySimpleClearArchitecture.domain.MessageUseCase
import java.lang.IllegalArgumentException

class MySimpleClearArchitectureViewModelFactory(
    private var messageUseCase: MessageUseCase
) : ViewModelProvider.NewInstanceFactory() {
    companion object {
        @Volatile
        private var instance: MySimpleClearArchitectureViewModelFactory? = null

        fun getInstance(): MySimpleClearArchitectureViewModelFactory =
            instance ?: synchronized(this) {
                instance ?: MySimpleClearArchitectureViewModelFactory(Injection.provideUseCase())
            }
    }

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return when  {
            modelClass.isAssignableFrom(MySimpleClearArchitectureViewModel::class.java) -> MySimpleClearArchitectureViewModel(messageUseCase) as T
            else -> throw IllegalArgumentException("Unknown ViewModel class " + modelClass.name)
        }
    }
}