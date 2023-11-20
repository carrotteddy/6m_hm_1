package com.example.youtube_api_hm_6mounth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.youtube_api_hm_6mounth.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy(LazyThreadSafetyMode.NONE) {
        ActivityMainBinding.inflate(layoutInflater)
    }

    private val viewModel by lazy {
        ViewModelProvider(this)[MainViewModel::class.java]
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.apply {
            btnInc.setOnClickListener {
                viewModel.inc()
            }

            btnDec.setOnClickListener {
                viewModel.dec()
            }

        }

        viewModel.counterLV.observe(this) {
            binding.tvResult.text = it.toString()
        }

    }
}