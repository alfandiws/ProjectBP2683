package com.example.projectbp2683

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ResponsiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_responsi)
        val call:TextView = findViewById(R.id.textviewcall)

        call.setOnClickListener {
            val callIntent:Intent = Uri.parse("tel:08888999999").let{
                number->Intent(Intent.ACTION_DIAL,number)
            }
            startActivity(callIntent)
        }
        val rvKunj:RecyclerView = findViewById(R.id.recylerViewResp)
        rvKunj.layoutManager = LinearLayoutManager(this)
        val data = ArrayList<KunjPerp>()
        data.add(KunjPerp(R.drawable.download, "SMA 1", "Ini deskripsi"))
        data.add(KunjPerp(R.drawable.download, "SMA 2", "Ini deskripsi"))
        data.add(KunjPerp(R.drawable.download, "SMA 3", "Ini deskripsi"))
        data.add(KunjPerp(R.drawable.download, "SMA 4", "Ini deskripsi"))
        val adapter = AdapterResponsi(data)
        rvKunj.adapter = adapter
    }

}