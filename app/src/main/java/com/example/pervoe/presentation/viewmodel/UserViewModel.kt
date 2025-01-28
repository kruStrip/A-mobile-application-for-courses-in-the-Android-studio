package com.example.pervoe.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myapplication.domain.usecases.GetUsersUseCase
import com.example.pervoe.domain.models.models.User
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class UserViewModel(private val getUsersUseCase: GetUsersUseCase) : ViewModel() {
    private val _users = MutableStateFlow<List<User>>(emptyList())
    val users: StateFlow<List<User>> = _users

    fun fetchUsers() = viewModelScope.launch(IO){
            val result = getUsersUseCase()
            _users.value= result
        }
    }