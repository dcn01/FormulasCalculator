package com.kachaninc.formulascalculator.classes

class Formula {
    private var formula = ArrayList<Element>()

    fun addElement(element: Element) {
        if (formula.isNotEmpty() && element is NumberElement) {
            val lastElement = formula[formula.size-1]
            if (lastElement is NumberElement) lastElement.concatenateElement(element)
                else formula.add(element)
        } else formula.add(element)
    }

    fun deleteLastElement() {
        if (formula.isNotEmpty()) {
            val element = formula[formula.size-1]
            if (element is NumberElement) {
                element.deleteLastDigit()
            } else formula.removeAt(formula.size-1)
        }
    }

    fun getFormulaText() : String {
        var line = ""
        formula.forEach {
            line += it.getElementText()
        }
        return line
    }
}