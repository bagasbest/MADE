package com.bagasbest.experto.mySimpleClearArchitecture.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.bagasbest.experto.databinding.ActivityMySimpleClearArchBinding

class MySimpleClearArchActivity : AppCompatActivity() {

    private var _binding: ActivityMySimpleClearArchBinding? = null
    private val binding get() = _binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMySimpleClearArchBinding.inflate(layoutInflater)
        setContentView(_binding?.root)


        val factory = MySimpleClearArchitectureViewModelFactory.getInstance()
        val viewModel = ViewModelProvider(this, factory)[MySimpleClearArchitectureViewModel::class.java]

        viewModel.setName("Bagas Pangestu")
        viewModel.message.observe(this, {
            binding?.tvWelcome?.text = it.welcomeMessage
        })
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}