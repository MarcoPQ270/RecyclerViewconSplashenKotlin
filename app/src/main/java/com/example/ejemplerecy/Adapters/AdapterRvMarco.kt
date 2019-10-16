package com.example.ejemplerecy.Adapters

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.example.ejemplerecy.Nuevo
import com.example.ejemplerecy.R
import com.example.ejemplerecy.dataclasses.Viajes
import kotlinx.android.synthetic.main.recycler_item.view.*

class AdapterRvMarco internal constructor(context: Context) :
    RecyclerView.Adapter<AdapterRvMarco.MarcoViewHolder>() {

    private val inflater: LayoutInflater = LayoutInflater.from(context)
    private  var ListaViajes = emptyList<Viajes>()

    fun setDataToList(lista: List<Viajes>){
        this.ListaViajes = lista
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MarcoViewHolder {
        val itemView = inflater.inflate(R.layout.recycler_item,parent,false)
        return MarcoViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return ListaViajes.size
    }

    override fun onBindViewHolder(holder: MarcoViewHolder, position: Int) {
        holder.titulo.text = ListaViajes.get(position).lugar
        var intent = Intent(inflater.context, Nuevo::class.java)

        holder.card.setOnClickListener {
            val context =  inflater.context as Activity
            context.startActivity(intent)
        }

    }


    inner class MarcoViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val card = itemView.findViewById<ConstraintLayout>(R.id.itemCard)
        val titulo = itemView.findViewById<TextView>(R.id.item_Title)




    }
}