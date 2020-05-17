package com.kachaninc.formulascalculator.database

import androidx.room.*

@Dao
interface FormulaDatabaseDao {

    @Insert
    fun insert(formula: Formula)

    @Update
    fun update(formula: Formula)

    @Query("SELECT * from formulas_table WHERE formulaId = :id")
    fun getById(id: Long): Formula

    @Delete
    fun delete(formula: Formula)

    @Query("DELETE from formulas_table WHERE formulaId = :id")
    fun deleteById(id: Long)
}