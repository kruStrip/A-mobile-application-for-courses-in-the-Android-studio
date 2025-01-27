package com.example.pervoe

import com.example.pervoe.domain.models.models.User

interface UserDelete{
    fun deleteUsers(): List<User>
}