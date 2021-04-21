package com.example.colaboradores

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.colaboradores_info.view.*

class AdaptadorObjeto(private val lista : ArrayList<Objecto>, var contexto : Context) : RecyclerView.Adapter<AdaptadorObjeto.ViewHolder>(){
    class ViewHolder(var vista : View, var contexto : Context) : RecyclerView.ViewHolder(vista){
        fun data(objecto : Objecto) {
            vista.txtNombre.text = objecto.nombre
            vista.txtContacto.text = objecto.contacto

            vista.setOnClickListener(){
                contexto.startActivity(Intent(contexto,Location:: class.java))
            }
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       return  ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.colaboradores_info,parent,false),contexto)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.data(lista[position])
    }

    override fun getItemCount(): Int {
        return lista.size
    }
}