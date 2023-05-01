package com.example.blog

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.blog.databinding.ActivityBuildBinding

class BuildActivity : AppCompatActivity() {

    private lateinit var binding: ActivityBuildBinding
    private lateinit var blogViewModel : BlogViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityBuildBinding.inflate(layoutInflater)
        setContentView(binding.root)

        blogViewModel = ViewModelProvider(this).get(BlogViewModel::class.java)

        binding.btnDiscard.setOnClickListener(){
            binding.etHeading.setText("")
            binding.etContent.setText("")
            finish()
        }

        binding.btnSave.setOnClickListener(){
            val blogItem = BlogItem(binding.etHeading.text.toString(), binding.etContent.text.toString())
            blogItem.heading = binding.etHeading.text.toString()
            blogItem.content = binding.etContent.text.toString()
            blogViewModel.addBlogItem(blogItem)
            binding.etHeading.setText("")
            binding.etContent.setText("")
            finish()
        }

    }
}