package com.example.hello

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import com.example.hello.R.id.iText
import kotlin.random.Random as Random1

class Lab1Task1 : AppCompatActivity() {
    lateinit var inText : TextView
    lateinit var editText :EditText

    var numToGuess: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lab1_task1)

        editText = findViewById(R.id.textShow)
        inText = findViewById(R.id.iText)

        val random = Random1
        print(random.nextInt(1000))
        numToGuess=random.nextInt(1000)
    }

    fun checkHigherLower(view : View){

        val number: Int = try {
            editText.text.toString().toInt()
        } catch (e: NumberFormatException) {
            inText.text = "Invalid input"
            editText.text.clear()
            return
        }

        when {
            number > numToGuess -> inText.text = "Your guess is Too High"
            number < numToGuess -> inText.text = "Your guess is Too Low"
            else -> inText.text = "Hoorah!! ... You guessed it correctly"
        }

        editText.text.clear()
    }
}
