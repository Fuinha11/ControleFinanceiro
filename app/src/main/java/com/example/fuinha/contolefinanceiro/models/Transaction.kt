package com.example.fuinha.contolefinanceiro.models

import com.example.fuinha.contolefinanceiro.enums.TransactionType
import java.math.BigDecimal
import java.util.Calendar

/**
 * This file was created by Fuinha on 31/07/2018.
 * Visit https://github.com/Fuinha11
 * Unauthorized use may be punishable by law.
 */

class Transaction(val value: BigDecimal,
                  val type: TransactionType,
                  var category: String,
                  val date: Calendar = Calendar.getInstance())