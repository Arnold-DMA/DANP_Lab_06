package com.danp.danp_lab_06

import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class DataViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    val tvNumero = view.findViewById<TextView>(R.id.tvNumero) as TextView
    val tvNombre= view.findViewById<TextView>(R.id.tvNombre) as TextView
    val ivImagen = view.findViewById<ImageView>(R.id.ivImagen) as ImageView
    val tvPrincipal = view.findViewById<TextView>(R.id.tvPrincipal) as TextView
    val tvSecundario = view.findViewById<TextView>(R.id.tvSecundario) as TextView
    val tvRegion = view.findViewById<TextView>(R.id.tvRegion) as TextView

    fun bind(item: Pokemons.Pokemon) {
        with(item){
            tvNumero.text = numero
            tvNombre.text = nombre
            tvPrincipal.text = tipo_principal
            tvSecundario.text = tipo_secundario
            tvRegion.text = region
            Picasso.get().load(imagen).into(ivImagen)
            Log.d("MainActivity", nombre)
        }
    }
}