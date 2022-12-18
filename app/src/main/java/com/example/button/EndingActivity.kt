package com.example.button

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.button.databinding.ActivityEndingBinding

class EndingActivity : AppCompatActivity() {
    var binding: ActivityEndingBinding?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEndingBinding.inflate(layoutInflater)
        setContentView(binding?.root)
    }
}