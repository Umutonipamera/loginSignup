package com.example.loginapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity2 : AppCompatActivity() {
    lateinit var tilName:EditText
    lateinit var tilEmail:EditText
    lateinit var  tilPassword:EditText
    lateinit var  tilPhone:EditText
    lateinit var spGender:Spinner
    lateinit var  btnSignUp:Button
    lateinit var  btnExist:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        castViews()
        onClickListener()
    }
    fun castViews(){
        tilName=findViewById(R.id.editName)
        tilEmail=findViewById(R.id.editEmail)
        tilPassword=findViewById(R.id.editpassword)
        tilPhone=findViewById(R.id.editPhone)
        spGender=findViewById(R.id.spinner3)
        btnSignUp=findViewById(R.id.btnSignup)
        btnExist=findViewById(R.id.btnPrev)
        var gender= arrayOf("Female","Male","Other")
        var genderAdapter=ArrayAdapter<String>(baseContext,android.R.layout.simple_spinner_item,gender)
        genderAdapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line)
        spGender.adapter=genderAdapter


    }
    fun onClickListener() {
        var gender = spGender.selectedItem.toString()
        if (tilName.text.toString().isEmpty()) {
            tilName.setError("Enter name")
        }
            btnExist.setOnClickListener {
                var message = "Sign up successfully"
                Toast.makeText(baseContext, message, Toast.LENGTH_LONG).show()
                var intent = Intent(baseContext, MainActivity::class.java)
                startActivity(intent)
            }
        }
    }
