package com.example.projectbp2683

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val btnBookKidActivity:Button = findViewById(R.id.buttonMenu1)
        val rvBuku:RecyclerView = findViewById(R.id.recylerViewBuku)
        val btnSpace:Button = findViewById(R.id.buttonMenu3)
        //set layout manager di RecylerView
        rvBuku.layoutManager = LinearLayoutManager(this)
        //list data
        val data = ArrayList<BukuModel>()
        data.add(BukuModel(R.drawable.book1,"AlfandiBook1","Lorem Ipsum Dolor Sit Amet"))
        //set adapter
        val adapter=AdapterHome(data)
        //set adapter ke recyler view
        rvBuku.adapter = adapter

        btnBookKidActivity.setOnClickListener{
            val intentBookkid=Intent(this,BookKidActivity::class.java)
            startActivity(intentBookkid)
        }
        btnSpace.setOnClickListener{
            val intentSpace = Intent (this,ResponsiActivity::class.java)
            startActivity(intentSpace)
        }
    }
}