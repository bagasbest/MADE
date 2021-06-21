package com.bagasbest.experto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bagasbest.experto.databinding.ActivityMainBinding
import com.bagasbest.experto.mySimpleClearArchitecture.presentation.MySimpleClearArchActivity
import com.bagasbest.experto.myTourism.MyTourismMainActivity

class MainActivity : AppCompatActivity() {

    private var _activityMainBinding: ActivityMainBinding? =  null
    private val binding get() = _activityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(_activityMainBinding?.root)

        binding?.clearArch?.setOnClickListener {
            startActivity(Intent(this, MySimpleClearArchActivity::class.java ))
        }

        binding?.tourism?.setOnClickListener {
            startActivity(Intent(this, MyTourismMainActivity::class.java))
        }

    }

    override fun onDestroy() {
        super.onDestroy()
        _activityMainBinding = null
    }
}