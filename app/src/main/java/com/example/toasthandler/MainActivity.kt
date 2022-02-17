package com.example.toasthandler

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("ShowToast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.button_ok)
        button.setOnClickListener {
            val textButton = "Кнопка ОК"
            val duration = Toast.LENGTH_LONG //время по умолчанию 2сек(2000)

            Toast.makeText(applicationContext, textButton, duration).show()
        }
    }
}