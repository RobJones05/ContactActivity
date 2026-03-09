package com.example.contactactivity

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.security.KeyStore
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val firstName: String = "Bobby"
        val lastName: String = "Bob"
        val address: String = "155 Maple Rd"
        val isMale: Boolean = true
        val dayOfBirth: Int = 9
        val monthOfBirth: Int = 5
        val yearOfBirth: Int = 2005

        val age = 20
        val yearsTo100 = 100 - age
        val ageInMonths = age * 12
        val ageInDays = age * 365
        val remainder = age % 5

        Log.d("MainActivity",
            " Hello, your name is Name: $firstName $lastName" +
                    ",Your address Address: $address, Male: $isMale," +
                    "You were born on DOB: $dayOfBirth/$monthOfBirth/$yearOfBirth"
        )
        Log.d("MainActivity",
            "Years until 100: $yearsTo100",
            "Age in months: $ageInMonths",
            "age in days: $ageInDays",
            "Reaminder when age is divided by 5: $remainder"
        )

        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}