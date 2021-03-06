package com.example.fuinha.contolefinanceiro.ui.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.example.fuinha.contolefinanceiro.R
import com.example.fuinha.contolefinanceiro.enums.TransactionType
import com.example.fuinha.contolefinanceiro.extension.limitTo
import com.example.fuinha.contolefinanceiro.extension.toBRL
import com.example.fuinha.contolefinanceiro.extension.toBrDate
import com.example.fuinha.contolefinanceiro.models.Transaction
import kotlinx.android.synthetic.main.transacao_item.view.*

/**
 * This file was created by Fuinha on 31/07/2018.
 * Visit https://github.com/Fuinha11
 * Unauthorized use may be punishable by law.
 */

class TransactionListAdapter(var transactions: List<Transaction>,
                             val context: Context) : BaseAdapter() {
    @SuppressLint("NewApi")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val v = LayoutInflater.from(context).inflate(R.layout.transacao_item, parent, false)
        val t = transactions[position]
        v.transacao_valor.text = t.value.toBRL()
        v.transacao_categoria.text = t.category.limitTo(14)

        v.transacao_data.text = t.date.toBrDate()
        if (t.type == TransactionType.Credit) {
            v.transacao_icone.setImageResource(R.drawable.icone_transacao_item_receita)
            v.transacao_valor.setTextColor(context.getColor(R.color.receita))
        } else {
            v.transacao_icone.setImageResource(R.drawable.icone_transacao_item_despesa)
            v.transacao_valor.setTextColor(context.getColor(R.color.despesa))
        }


        return v
    }

    override fun getItem(position: Int): Transaction {
        return transactions[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return transactions.size
    }

}