package com.example.exam_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Activity01 = findViewById(R.id.btnActivity01)
    }
    lateinit var Activity01: Button

    fun btnActivity01Click(view: View) {
        val intent = Intent(this, MainActivity2::class.java)
        startActivityForResult(intent, 1)
    }
}