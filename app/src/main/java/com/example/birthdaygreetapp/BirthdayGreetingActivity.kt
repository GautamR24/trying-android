package com.example.birthdaygreetapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class BirthdayGreetingActivity : AppCompatActivity() {
    companion object{
        const val NAME_EXTRA = "name_extra"
    }// we can create all static variables in it
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greeting)

        val name = intent.getStringExtra(NAME_EXTRA)
        createBirthdayApp.text = "Happy Birthday\n $name!"
    }
}