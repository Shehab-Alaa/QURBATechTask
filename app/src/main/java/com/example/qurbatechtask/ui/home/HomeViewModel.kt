package com.example.qurbatechtask.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.qurbatechtask.data.model.Post
import com.example.qurbatechtask.data.remote.ApiRepository

class HomeViewModel() : ViewModel(){

    private val apiRepository = ApiRepository()
    private val _postsList : MutableLiveData<List<Post>> = MutableLiveData(listOf())
    val postsList: LiveData<List<Post>> = _postsList

    init {
        getPostItems()
    }

    private fun getPostItems(){
        _postsList.value = apiRepository.getPostItems()
    }

}