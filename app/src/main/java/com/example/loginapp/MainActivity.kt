package com.example.loginapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var tilEmail: EditText
    lateinit var tilPass: EditText
    lateinit var btnLogin:Button
    lateinit var btnNext: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        castViews()
        onClickListener()

    }

    fun castViews() {
        tilEmail = findViewById(R.id.editEmail)
        tilPass = findViewById(R.id.editPassword)
        btnLogin=findViewById(R.id.btnLogin)
        btnNext = findViewById(R.id.btnNext)

    }

    fun onClickListener() {
        if (tilEmail.text.toString().isEmpty() || (tilPass.text.toString().isEmpty())) {
            tilEmail.error = "Enter Email"
            tilPass.error = "Enter Password"
        }

            btnNext.setOnClickListener {
                var intent = Intent(baseContext,MainActivity2::class.java)
                    startActivity(intent)
            }



        }
    }
