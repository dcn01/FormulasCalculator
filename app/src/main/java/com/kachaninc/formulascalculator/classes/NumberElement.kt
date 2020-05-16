package com.kachaninc.formulascalculator.classes

class NumberElement (value: Char) : Element(value.toString()) {
    private var number = ArrayList<Char>()
    private var containDot = false

    init {
        number.add(value)
    }

    override fun getClassName(): String {
        return "number"
    }

    fun concatenateElement(element: NumberElement) {
        val digit = element.getElementText()[0]

        if (digit=='.') addDot()
            else number.add(digit)

        updateElementText()
    }

    fun deleteLastDigit() {
        if (number.isNotEmpty()) {
            val index = number.size-1
            val lastSymbol = number[index]
            number.removeAt(index)
            if (lastSymbol=='.') containDot = false
        }
        updateElementText()
    }

    private fun addDot() {
        if (!containDot) {
            number.add('.')
            containDot = true
        }
    }

    private fun updateElementText() {
        var numberText = ""
        number.forEach { numberText += it}
        value = numberText
    }
}