package com.example.pervoe.data.repositories

import com.example.pervoe.domain.models.UserRepository
import com.example.pervoe.domain.models.models.User
import com.example.pervoe.data.models.UserDto

class UserRepositoryImpl: UserRepository{

    override fun getUsers(): List<User> {
        val userDtos = listOf(
            UserDto(1, "Harry", "Potter", 13),
            UserDto(2, "Harry", "Potter", 13)
        )
        return userDtos.map{ dto ->
            User(
                name = dto.name,
                surname = dto.surname,
                age = dto.age,
            )
        }
    }

}