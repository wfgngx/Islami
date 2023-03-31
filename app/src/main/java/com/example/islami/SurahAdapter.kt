package com.example.islami

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SurahAdapter(private val items:List<String>):RecyclerView.Adapter<SurahAdapter.ViewHolder> (){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.surahtems,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val surahName = items[position]
        holder.name.text = surahName
    }

    override fun getItemCount(): Int  = items.size

    class ViewHolder(itemView :View):RecyclerView.ViewHolder(itemView){
        val name :TextView = itemView.findViewById(R.id.surah_nm)
    }
}