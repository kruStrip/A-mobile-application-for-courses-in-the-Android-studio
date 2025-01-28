package com.example.pervoe.presentation.viewmodelfactories

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.myapplication.domain.usecases.GetUsersUseCase
import com.example.pervoe.presentation.viewmodel.UserViewModel

@Suppress("UNCHECKED_CAST")
class UserViewModelFactory(private val getUsersUseCase: GetUsersUseCase): ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return UserViewModel(getUsersUseCase) as T
    }

}