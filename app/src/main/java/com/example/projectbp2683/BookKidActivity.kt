package com.example.projectbp2683

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.projectbp2683.databinding.ActivityBookKidBinding

class BookKidActivity : AppCompatActivity() {
    lateinit var binding: ActivityBookKidBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBookKidBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.buttonFairy.setOnClickListener{
            replaceFragment(FairyFragment())
        }
        binding.buttonFable.setOnClickListener{
            replaceFragment(FableFragment())
        }
        binding.buttonScience.setOnClickListener{
            replaceFragment(ScienceFragment())
        }

    }
    fun replaceFragment(frg:Fragment){
        val fragmentManager = supportFragmentManager
        val fragmentTrx = fragmentManager.beginTransaction()
        fragmentTrx.replace(R.id.fragmentKidBook, frg)
        fragmentTrx.commit()
    }
}