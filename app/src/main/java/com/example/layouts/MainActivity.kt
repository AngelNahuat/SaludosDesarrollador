package com.example.layouts

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val saludar=findViewById<RelativeLayout>(R.id.btnComprobar)
        val nombre=findViewById<EditText>(R.id.etNombre)
        val cb=findViewById<CheckBox>(R.id.cbSoy)
        saludar.setOnClickListener(View.OnClickListener {
            if(Validar()){
                if(cb.isChecked){
                    Toast.makeText(this,"hola"+nombre.text+"desarrollador",Toast.LENGTH_LONG).show()
                }else

                Toast.makeText(this,"hola"+nombre.text,Toast.LENGTH_LONG).show()
            }
        else{
            Toast.makeText(this,"escribe tu nombre",Toast.LENGTH_LONG).show()
            }
        })
    }
    fun Validar():Boolean{
        val etNombre=findViewById<EditText>(R.id.etNombre)
        val NombreUsu=etNombre.text
        if(NombreUsu.isNullOrEmpty()){
            return false
        }

        return true
    }
}