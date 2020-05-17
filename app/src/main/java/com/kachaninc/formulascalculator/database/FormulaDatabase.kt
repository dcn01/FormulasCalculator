package com.kachaninc.formulascalculator.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Formula::class], version = 1, exportSchema = false)
abstract class FormulaDatabase : RoomDatabase() {

    abstract val formulaDatabaseDao: FormulaDatabaseDao

    companion object {

        @Volatile
        private var INSTANCE: FormulaDatabase? = null

        fun getInstance(context: Context) : FormulaDatabase {
            synchronized(this) {
                var instance = INSTANCE

                if (instance==null) {
                    instance = Room.databaseBuilder(
                            context.applicationContext,
                            FormulaDatabase::class.java,
                        "formulas_database"
                    )
                        .fallbackToDestructiveMigration()
                        .build()

                    INSTANCE = instance
                }

                return instance
            }
        }
    }
}