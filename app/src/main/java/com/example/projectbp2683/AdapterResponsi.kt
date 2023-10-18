package com.example.projectbp2683

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdapterResponsi(private val listKunj:List<KunjPerp>) :
RecyclerView.Adapter<AdapterResponsi.ViewHolder>() {

    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val image: ImageView = itemView.findViewById(R.id.imageViewresp)
        val title: TextView = itemView.findViewById(R.id.textView6)
        val desc: TextView = itemView.findViewById(R.id.textView14)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterResponsi.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(
            R.layout.card_responsi,parent,false)
        return AdapterResponsi.ViewHolder(view)
    }

    override fun onBindViewHolder(holder: AdapterResponsi.ViewHolder, position: Int) {
        val kunjPerp = listKunj[position]

        holder.image.setImageResource(kunjPerp.image)
        holder.title.text = kunjPerp.title
        holder.desc.text = kunjPerp.desc
    }

    override fun getItemCount(): Int {
        return listKunj.size
    }
}