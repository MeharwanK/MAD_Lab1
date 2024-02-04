package com.example.hello

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class printHelloByEventHandling : AppCompatActivity() {
    lateinit var txt : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_print_hello_by_event_handling)
    }
    fun printHello(view : View){
        txt = findViewById(R.id.hellotxt)
        txt.text = "Hello World"
    }
}