package com.kachaninc.formulascalculator.classes

class OperationElement (value: Char): Element(value.toString()) {

    override fun getClassName(): String {
        return "operation"
    }
}