package com.kachaninc.formulascalculator.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity (tableName = "formulas_table")
data class Formula (

    @PrimaryKey (autoGenerate = true)
    var formulaId: Long = 0L,

    @ColumnInfo (name="formula_text")
    var formulaText: String = "formula"
)