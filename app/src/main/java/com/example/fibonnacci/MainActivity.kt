package com.example.fibonnacci

import android.app.Activity
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import com.example.fibonnacci.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val num = fiboNum(100)
            binding.tvNumbers.layoutManager= GridLayoutManager(this,2)
        val adapter=FibonacciNumbers(num)

        binding.tvNumbers.adapter=adapter
    }

    fun fiboNum(number: Int): List<Int>{
        val num= mutableListOf(0,1)
        while (num.size<number){
            num.add(num[num.lastIndex]+num[num.lastIndex-1])

        }
        return  num
    }
}