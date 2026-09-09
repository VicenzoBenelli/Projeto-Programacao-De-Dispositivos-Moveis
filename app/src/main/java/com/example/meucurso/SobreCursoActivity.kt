package com.example.meucurso

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button

class SobreCursoActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sobre_curso)

        val buttonVoltar = findViewById<Button>(R.id.buttonVoltar)
        val buttonDisciplinas = findViewById<Button>(R.id.buttonDisciplinas)

        buttonVoltar.setOnClickListener {
            finish()
        }

        buttonDisciplinas.setOnClickListener {
            val intent = Intent(this, DisciplinasActivity::class.java)
            startActivity(intent)
        }
    }
}

