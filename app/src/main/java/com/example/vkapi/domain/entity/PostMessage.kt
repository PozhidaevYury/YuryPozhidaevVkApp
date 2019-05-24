package com.example.vkapi.domain.entity

data class PostMessage(
    val id: Int,
    val profileName: String,
    val message: String,
    val image: String,
    val video: String,
    val musicName: String,
    val musicAuthor: String,
    val date: String,
    val likes: Int
)