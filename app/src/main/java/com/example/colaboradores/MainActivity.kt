package com.example.colaboradores

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        colaboradores()
        agregar()
    }

    private fun colaboradores() {
        btnColaboradores.setOnClickListener(){
            var col : Intent = Intent(this, MisColaboradores::class.java)
            startActivity(col)
        }
    }

    private fun agregar() {
        btnAgregar.setOnClickListener(){
            var agregar : Intent =Intent (this,AgregarColaborador::class.java)
            startActivity(agregar)
        }
    }
}