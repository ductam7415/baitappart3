package com.tam.myapplication.overview

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.tam.myapplication.network.Post
import com.tam.myapplication.network.PostService
import com.tam.myapplication.network.service
import kotlinx.coroutines.launch

class overviewViewModel: ViewModel() {
    private val _status = MutableLiveData<PostService>()
    val status: LiveData<PostService> = _status

    private val _photos = MutableLiveData<List<Post>>()
    val photos: LiveData<List<Post>> = _photos

    init {
        getPost()
        creatPost()
    }
    private fun getPost() {
        viewModelScope.launch {
            val post = service.retrofitService.getPost()
            Log.d("PostViewModel", "PostGH")
            Log.d("PostViewModel", post.toString())
        }
    }
    private fun creatPost(){
        viewModelScope.launch {
            service.retrofitService.createPost(Post("1","tam","nguoi","T_T","I don't know"))
        }
    }
}