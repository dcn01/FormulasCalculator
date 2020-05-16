package com.kachaninc.formulascalculator.classes

class SymbolElement (value: Char): Element(value.toString()) {

    override fun getClassName(): String {
        return "symbol"
    }
}