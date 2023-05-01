package com.example.blog

import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import com.example.blog.databinding.BlogcardBinding

class BlogItemViewHolder (
    private val context: Context,
    private val binding: BlogcardBinding
): RecyclerView.ViewHolder(binding.root){
    fun bindBlogItem(blogItem: BlogItem){
        binding.tvHeading.text = blogItem.heading
        binding.tvContent.text = blogItem.content
    }
}