package com.example.alvarez22102058ep202401.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.alvarez22102058ep202401.R
import com.example.alvarez22102058ep202401.model.StadiumsModel

class StadiumAdapter(private var lstStadium: List<StadiumsModel>): RecyclerView.Adapter<StadiumAdapter.ViewHolder>() {
    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)
        val ivImagen: ImageView = itemView.findViewById(R.id.ivImagen)
        val tvNombre: TextView = itemView.findViewById(R.id.tvNombre)
        val tvUbicacion: TextView = itemView.findViewById(R.id.tvUbicacion)
        val tvCapacidad: TextView = itemView.findViewById(R.id.tvCapacidad)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StadiumAdapter.ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ViewHolder(layoutInflater.inflate(R.layout.item_contacto, parent, false))
    }

    override fun getItemCount(): Int {
        return lstStadium.size
    }

    override fun onBindViewHolder(holder: StadiumAdapter.ViewHolder, position: Int) {
        val itemStadium = lstStadium[position]
        holder.ivImagen.setImageResource(itemStadium.image)
        holder.tvNombre.text = itemStadium.stadiumName
        holder.tvUbicacion.text = itemStadium.stadiumUbicacion
        holder.tvCapacidad.text  = itemStadium.stadiumCapacidad

    }

}