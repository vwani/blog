package com.example.blog

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.blog.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var blogViewModel : BlogViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        blogViewModel = ViewModelProvider(this).get(BlogViewModel::class.java)

        binding.newBlogButton.setOnClickListener(){
            Intent(this, BuildActivity::class.java).also{
                startActivity(it)
            }
        }

        setRecyclerView()

    }

    override fun onStart() {
        super.onStart()
        setRecyclerView()
    }

    private fun setRecyclerView() {
        val mainActivity = this
        blogViewModel.blogItems.observe(this){
            binding.blogRecyclerView.apply {
                layoutManager = LinearLayoutManager(applicationContext)
                adapter = BlogItemAdapter(it)

            }
        }
    }
}