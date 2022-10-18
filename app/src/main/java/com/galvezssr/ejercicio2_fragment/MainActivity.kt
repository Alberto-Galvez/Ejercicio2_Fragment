package com.galvezssr.ejercicio2_fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.galvezssr.ejercicio2_fragment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}