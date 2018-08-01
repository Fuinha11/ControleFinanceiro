package com.example.fuinha.contolefinanceiro.ui.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.fuinha.contolefinanceiro.R
import com.example.fuinha.contolefinanceiro.enums.TransactionType
import com.example.fuinha.contolefinanceiro.models.Transaction
import com.example.fuinha.contolefinanceiro.ui.adapter.TransactionListAdapter
import kotlinx.android.synthetic.main.activity_lista_transacoes.*
import java.math.BigDecimal
import java.util.*

/**
* This file was created by Fuinha on 30/07/2018.
* Visit https://github.com/Fuinha11
* Unauthorized use may be punishable by law
*/

class ListaTranscoesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_transacoes)

        val list = listOf(Transaction(BigDecimal.valueOf(100.0), TransactionType.Credit, "Economia"),
                Transaction(BigDecimal.valueOf(50.0), TransactionType.Debit, "Conta"))

        val adapter = TransactionListAdapter(list, this)
        lista_transacoes_listview.adapter = adapter
    }
}