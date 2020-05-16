package com.kachaninc.formulascalculator.classes

abstract class Element (protected var value: String) {

    fun getElementText() : String {
        return value
    }
}