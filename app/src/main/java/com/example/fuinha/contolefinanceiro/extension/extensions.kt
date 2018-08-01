package com.example.fuinha.contolefinanceiro.extension

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