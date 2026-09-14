package com.example.meucurso

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class DisciplinasActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_disciplinas)

        val buttonVoltar = findViewById<Button>(R.id.buttonVoltar)
        buttonVoltar.setOnClickListener {
            finish()
        }

        findViewById<TextView>(R.id.cardProgramacao).setOnClickListener {
            abrirDetalhes(getString(R.string.programacao))
        }

        findViewById<TextView>(R.id.cardBancoDados).setOnClickListener {
            abrirDetalhes(getString(R.string.banco_dados))
        }

        findViewById<TextView>(R.id.cardEngenhariaSoftware).setOnClickListener {
            abrirDetalhes(getString(R.string.engenharia_software))
        }

        findViewById<TextView>(R.id.cardDesenvolvimentoWeb).setOnClickListener {
            abrirDetalhes(getString(R.string.desenvolvimento_web))
        }

        findViewById<TextView>(R.id.cardDesenvolvimentoMobile).setOnClickListener {
            abrirDetalhes(getString(R.string.desenvolvimento_mobile))
        }

        findViewById<TextView>(R.id.cardInteligenciaArtificial).setOnClickListener {
            abrirDetalhes(getString(R.string.inteligencia_artificial))
        }
    }

    private fun abrirDetalhes(nomeDisciplina: String) {
        val intent = Intent(this, DetalhesDisciplinaActivity::class.java)
        intent.putExtra(DetalhesDisciplinaActivity.EXTRA_NOME_DISCIPLINA, nomeDisciplina)
        startActivity(intent)
    }
}
