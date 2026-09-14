package com.example.meucurso

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class DetalhesDisciplinaActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhes_disciplina)

        val nomeDisciplina = intent.getStringExtra(EXTRA_NOME_DISCIPLINA)
            ?: getString(R.string.programacao)
        val detalhes = buscarDetalhes(nomeDisciplina)

        findViewById<TextView>(R.id.textNomeDisciplina).text = nomeDisciplina
        findViewById<TextView>(R.id.textCargaHoraria).text = getString(
            R.string.carga_horaria_formato,
            detalhes.cargaHoraria
        )
        findViewById<TextView>(R.id.textModalidade).text = getString(
            R.string.modalidade_disciplina_formato,
            detalhes.modalidade
        )
        findViewById<TextView>(R.id.textNivel).text = getString(
            R.string.nivel_formato,
            detalhes.nivel
        )
        findViewById<TextView>(R.id.textPreRequisito).text = getString(
            R.string.pre_requisito_formato,
            detalhes.preRequisito
        )
        findViewById<TextView>(R.id.textDescricaoDisciplina).text = detalhes.descricao

        findViewById<Button>(R.id.buttonVoltar).setOnClickListener {
            finish()
        }

        findViewById<Button>(R.id.buttonVoltarHome).setOnClickListener {
            val intentHome = Intent(this, MainActivity::class.java).apply {
                flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP
            }
            startActivity(intentHome)
        }
    }

    private fun buscarDetalhes(nomeDisciplina: String): DetalhesDisciplina {
        return when (nomeDisciplina) {
            getString(R.string.banco_dados) -> DetalhesDisciplina(
                descricao = getString(R.string.descricao_banco_dados),
                cargaHoraria = getString(R.string.sessenta_horas),
                modalidade = getString(R.string.presencial),
                nivel = getString(R.string.nivel_intermediario),
                preRequisito = getString(R.string.prerequisito_programacao)
            )

            getString(R.string.engenharia_software) -> DetalhesDisciplina(
                descricao = getString(R.string.descricao_engenharia_software),
                cargaHoraria = getString(R.string.sessenta_horas),
                modalidade = getString(R.string.presencial),
                nivel = getString(R.string.nivel_intermediario),
                preRequisito = getString(R.string.prerequisito_programacao)
            )

            getString(R.string.desenvolvimento_web) -> DetalhesDisciplina(
                descricao = getString(R.string.descricao_desenvolvimento_web),
                cargaHoraria = getString(R.string.oitenta_horas),
                modalidade = getString(R.string.presencial),
                nivel = getString(R.string.nivel_intermediario),
                preRequisito = getString(R.string.prerequisito_programacao)
            )

            getString(R.string.desenvolvimento_mobile) -> DetalhesDisciplina(
                descricao = getString(R.string.descricao_desenvolvimento_mobile),
                cargaHoraria = getString(R.string.oitenta_horas),
                modalidade = getString(R.string.presencial),
                nivel = getString(R.string.nivel_intermediario),
                preRequisito = getString(R.string.prerequisito_programacao)
            )

            getString(R.string.inteligencia_artificial) -> DetalhesDisciplina(
                descricao = getString(R.string.descricao_inteligencia_artificial),
                cargaHoraria = getString(R.string.sessenta_horas),
                modalidade = getString(R.string.presencial),
                nivel = getString(R.string.nivel_avancado),
                preRequisito = getString(R.string.prerequisito_programacao_banco)
            )

            else -> DetalhesDisciplina(
                descricao = getString(R.string.descricao_programacao),
                cargaHoraria = getString(R.string.oitenta_horas),
                modalidade = getString(R.string.presencial),
                nivel = getString(R.string.nivel_basico),
                preRequisito = getString(R.string.sem_prerequisito)
            )
        }
    }

    private data class DetalhesDisciplina(
        val descricao: String,
        val cargaHoraria: String,
        val modalidade: String,
        val nivel: String,
        val preRequisito: String
    )

    companion object {
        const val EXTRA_NOME_DISCIPLINA = "nome_disciplina"
    }
}
