package com.example.button

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.example.button.databinding.ActivityKittenBinding
import kotlinx.android.synthetic.main.activity_kitten.*
import kotlinx.android.synthetic.main.activity_main.*

class KittenActivity : AppCompatActivity() {
    var binding: ActivityKittenBinding?=null
    val correctApp = true
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityKittenBinding.inflate(layoutInflater)
        setContentView(binding?.root)
    }
    fun onClear(view: View){
        tvInput.text = ""
    }
    fun onDigit(view: View){
        var selButton = (view as Button).text
        when (selButton) {
            "R" -> {
                tvInput.append("A")
            }
            "Y" -> {
                tvInput.append("C")

            }
            "T" -> {
                tvInput.append("L")
            }
            "M" -> {
                tvInput.append("O")
            }
            "C" -> {
                var tvText = tvInput.text.toString()
                if( tvText.equals("christmass", ignoreCase = true)) {
                    if (correctApp){
                        tvInput.append("Y")

                    }else{
                        tvInput.append("C")
                        Toast.makeText(this, "And you are sure this is the right app?", Toast.LENGTH_SHORT).show()}

                }else{
                        tvInput.append("Y")
                        }



                }
            "S" -> {
                tvInput.append("H")
            }
            "B" -> {
                tvInput.append("I")
            }
            "N" -> {
                tvInput.append("W")
            }
            "H" -> {
                tvInput.append("S")
            }
            "O" -> {
                tvInput.append("M")
            }
            "P" -> {
                tvInput.append("V")
            }
            "A" -> {
                tvInput.append("R")            }
            "I" -> {
                tvInput.append("B")
            }
            "V" -> {
                tvInput.append("P")
            }
            "L" -> {
                tvInput.append("T")
            }
        }

    }
    fun onEnter(view: View) {
        var tvText = tvInput.text.toString()
        if (tvText.equals("christmassy", ignoreCase = true)) {
            val intent = Intent(this, EndingActivity::class.java)
            startActivity(intent)
        } else {
            Toast.makeText(this, "And you are sure this is the right app?", Toast.LENGTH_LONG)
                .show()
        }
    }







}