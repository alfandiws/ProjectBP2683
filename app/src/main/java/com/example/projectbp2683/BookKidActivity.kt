package com.example.projectbp2683

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.projectbp2683.databinding.ActivityBookKidBinding

class BookKidActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_kid)

        val fairyButton: Button = findViewById(R.id.buttonFairy)
        val fableButton: Button = findViewById(R.id.buttonFable)
        val scienceButton: Button = findViewById(R.id.buttonScience)

        fairyButton.setOnClickListener {
            replaceFragment(FairyFragment())
        }

        fableButton.setOnClickListener {
            replaceFragment(FableFragment())
        }

        scienceButton.setOnClickListener {
            replaceFragment(ScienceFragment())
        }
    }

    fun replaceFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragmentKidBook, fragment)
        fragmentTransaction.commit()
    }
}
