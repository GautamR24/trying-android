package com.example.birthdaygreetapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // first way in which we use the id
        // second is to use the button in xml file
//        createBirthdayApp.setOnClickListener({ }) //we can use lambda if there is only one function
    }
    // this way we are using the id
    fun createBirthDay(view: View) {
        val  name = nameInput.editableText.toString()
//        Toast.makeText(this, "name is $name", Toast.LENGTH_LONG).show()
        val intent = Intent(this, BirthdayGreetingActivity::class.java)
        intent.putExtra(BirthdayGreetingActivity.NAME_EXTRA,name)
        startActivity(intent)// we use intent to pass data to other activity
    }

}