package com.example.valuta2

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var number: String? = editTextNumber.getText().toString()

        button_counter.setOnClickListener(){
            if (number == null) return@setOnClickListener
            textViewer.text = (((editTextNumber.text).toString()).toFloat() / 74).toString()
        }
        button.setOnClickListener(){
            if (number == null) return@setOnClickListener
            textViewer.text = (((editTextNumber.text).toString()).toInt() * 74).toString()
        }
    }
}
