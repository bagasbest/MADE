package com.bagasbest.experto.myTourism

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bagasbest.experto.databinding.ActivityMainBinding

class MyTourismMainActivity : AppCompatActivity() {

    private var _binding : ActivityMainBinding? =  null
    private val binding get() = _binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(_binding?.root)


    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}