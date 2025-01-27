package com.example.pervoe.domain.models.usecases

import com.example.pervoe.domain.models.UserDelete
import com.example.pervoe.domain.models.UserRepository
import com.example.pervoe.domain.models.models.User

class GetUsersUseCase(private val userRepository: UserRepository) {
    fun execute(): List<User>{
        return userRepository.getUsers()
    }
}
class DeleteUsers(private val userDelete: UserDelete){
    fun delete(): List<User>{
        return userDelete.deleteUsers()
    }
}