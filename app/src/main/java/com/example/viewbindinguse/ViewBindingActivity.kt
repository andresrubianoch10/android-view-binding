package com.example.viewbindinguse

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.viewbindinguse.databinding.ActivityMainBinding

class ViewBindingActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onStart() {
        super.onStart()
        binding.textViewInitViewLabel.text = "Changed text to test view binding lib"
    }
}