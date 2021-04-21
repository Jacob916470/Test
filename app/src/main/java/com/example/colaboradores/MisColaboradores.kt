package com.example.colaboradores

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.colaboradores.Objecto
import com.example.colaboradores.R
import kotlinx.android.synthetic.main.activity_mis_colaboradores.*

class MisColaboradores : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mis_colaboradores)

        listaColaboradores.layoutManager = LinearLayoutManager(this)
        listaColaboradores.adapter = AdaptadorObjeto(getData(),this)
    }
    fun getData() : ArrayList<Objecto>{
        var lista = ArrayList<Objecto>()
        lista.add(Objecto("Jose","Carlos"))
        lista.add(Objecto("Jacob","Jesus"))

        return lista
    }
}
