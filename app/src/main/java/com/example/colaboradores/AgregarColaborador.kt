package com.example.colaboradores

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.android.synthetic.main.activity_agregar_colaborador.*
import kotlinx.android.synthetic.main.colaboradores_info.*

class AgregarColaborador : AppCompatActivity() {

    //Referencia a nuestra base de datos
    private val db = FirebaseFirestore.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_agregar_colaborador)
        guardar()
    }

    private fun guardar() {
        title = "Agregar Contacto"
        btnGuardar.setOnClickListener(){
            db.collection("users").document().set(hashMapOf(
                "nombre" to txtNombreAgregar.text.toString(),
                "contacto" to txtContactoAgregar.text.toString()))
            Toast.makeText(this, "Guardado", Toast.LENGTH_SHORT).show()
        }
    }
}