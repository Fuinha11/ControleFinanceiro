package com.example.fuinha.contolefinanceiro.extension

import java.math.BigDecimal
import java.text.DecimalFormat
import java.text.SimpleDateFormat
import java.util.*

/**
 * This file was created by Fuinha on 01/08/2018.
 * Visit https://github.com/Fuinha11
 * Unauthorized use may be punishable by law.
 */


fun Calendar.toBrDate() : String {
    val format = SimpleDateFormat("dd/MM/yyyy")
    return format.format(this.time)
}

fun BigDecimal.toBRL() : String {
    val formatoBrasileiro = DecimalFormat
            .getCurrencyInstance(Locale("pt","br"))
    val moedaFormatada = formatoBrasileiro
            .format (this).replace("R$", "R$ ")

    return moedaFormatada
}

fun String.limitTo(caracteres: Int) : String {
    if(this.length > caracteres){
        return "${this.substring(0, 14)}..."
    }
    return this
}