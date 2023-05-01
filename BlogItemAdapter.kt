package com.example.blog

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.blog.databinding.BlogcardBinding

class BlogItemAdapter(
    private val blogItems: List<BlogItem>
): RecyclerView.Adapter<BlogItemViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BlogItemViewHolder {
        val from = LayoutInflater.from(parent.context)
        val binding = BlogcardBinding.inflate(from, parent, false)
        return BlogItemViewHolder(parent.context, binding)
    }

    override fun onBindViewHolder(holder: BlogItemViewHolder, position: Int) {
        holder.bindBlogItem(blogItems[position])
    }

    override fun getItemCount(): Int {
        return blogItems.size
    }
}