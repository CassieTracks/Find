package com.example.button

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var secretWord = "button"
    var wrongCount = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun onProceed(view: View){

        var tvValue = etPrimary.text.toString()

        when {
            tvValue.equals(secretWord, ignoreCase = true) -> {
                val intent = Intent(this, KittenActivity::class.java)
                startActivity(intent)
            }
            wrongCount == 5 -> {
                Toast.makeText(this, "So close... no not really", Toast.LENGTH_SHORT).show()
            }
            wrongCount == 10 -> {
                Toast.makeText(this, "Are you just guessing now?", Toast.LENGTH_SHORT).show()
            }
            wrongCount == 20 -> {
                Toast.makeText(this, "We still believe in you!", Toast.LENGTH_SHORT).show()
            }
            wrongCount == 30 -> {
                Toast.makeText(this, "Want a clue?", Toast.LENGTH_SHORT).show()
            }
            else ->

                etPrimary.text?.clear()
        }
            wrongCount ++
    }
}