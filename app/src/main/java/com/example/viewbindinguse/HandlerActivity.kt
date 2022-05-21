package com.example.viewbindinguse

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.viewbindinguse.databinding.ActivityHandlerBinding

class HandlerActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHandlerBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHandlerBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onStart() {
        super.onStart()

        binding.buttonHandlerInActivity.setOnClickListener {
            goToUsingViewBindingInActivity()
        }
    }

    private fun goToUsingViewBindingInActivity() {
        val intent = Intent(this, ViewBindingActivity::class.java)
        initActivity(intent)
    }

    private fun initActivity(intent: Intent) {
        startActivity(intent)
    }
}