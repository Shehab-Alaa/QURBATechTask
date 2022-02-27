package com.example.qurbatechtask.data.remote

import com.example.qurbatechtask.data.model.Post

class ApiRepository {

    fun getPostItems() = Post.getDummyPosts()
}