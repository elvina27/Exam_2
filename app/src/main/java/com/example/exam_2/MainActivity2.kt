package com.example.exam_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        Activity02 = findViewById(R.id.btnActivity02)
    }
    lateinit var Activity02: Button

    fun btnActivity02Click(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivityForResult(intent, 1)
    }
}
