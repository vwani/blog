package com.example.blog

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class BlogViewModel : ViewModel() {
    var blogItems = MutableLiveData<MutableList<BlogItem>>()

    init{
        blogItems.value = mutableListOf()
    }

    fun addBlogItem(newBlog : BlogItem){
        val list = blogItems.value
        list!!.add(newBlog)
        blogItems.postValue(list)
    }

}