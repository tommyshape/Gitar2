package com.example.gitar2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        print("fifth commit")
        println("local change")
        println("local change2")
        println("local change 3")
        print("Experimental branch")

    }
}