package com.example.pervoe.domain.models

import com.example.pervoe.domain.models.models.User

interface UserRepository {
    fun getUsers(): List<User>
}
