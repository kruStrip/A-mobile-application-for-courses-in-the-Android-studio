package com.example.myapplication.domain.usecases

import com.example.pervoe.domain.models.UserRepository
import com.example.pervoe.domain.models.models.User

class GetUsersUseCase(private val userRepository: UserRepository){

    suspend operator fun invoke(): List<User>{
        return  userRepository.getUsers()
    }
}
