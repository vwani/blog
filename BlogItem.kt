package com.example.blog

import java.util.UUID
//import java.io.Serializable

data class BlogItem (
    var heading : String,
    var content : String,
    var id : UUID = UUID.randomUUID()
)