package com.example.portalberitarisa.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.portalberitarisa.data.Komentar
import com.example.portalberitariskaa.R

class KomentarAdapter(private val List:ArrayList<Komentar>)
    : RecyclerView.Adapter<KomentarAdapter.KomentarViewHolder>(){



    class KomentarViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        private val username = itemView.findViewById<TextView>(R.id.txtUsername)
        private val komentar = itemView.findViewById<TextView>(R.id.txtKomentar)

        fun bind(get: Komentar){
            username.text = get.username
            komentar.text = get.komentar
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): KomentarViewHolder {
        return KomentarViewHolder(LayoutInflater.from(parent.context)
            .inflate(R.layout.list_komentar, parent, false))
    }

    override fun getItemCount(): Int {
        return List.size
    }

    override fun onBindViewHolder(holder: KomentarViewHolder, position: Int) {
        holder.bind(List[position])
    }
}