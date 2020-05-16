package com.kachaninc.formulascalculator.classes

class Formula {
    private var formula = ArrayList<Element>()

    fun addElement(newElement: Element) {
        if (formula.isNotEmpty()) {
            val lastElement = formula[formula.size-1]
            when (newElement.getClassName()) {
                "number" -> {
                    when (lastElement.getClassName()) {
                        "number" -> {
                            (lastElement as NumberElement).concatenateElement(newElement as NumberElement)
                        }

                        "symbol" -> {
                            if (lastElement.getElementText()[0]=='(') formula.add(newElement)
                        }

                        "variable" -> {
                        }

                        "function" -> {
                        }
                        else -> formula.add(newElement)
                    }
                }

                "operation" -> {
                    when (lastElement.getClassName()) {
                        "operation" -> {
                        }

                        "symbol" -> {
                            if (lastElement.getElementText()[0]==')') formula.add(newElement)
                        }

                        else -> formula.add(newElement)
                    }
                }

                "symbol" -> {
                    when (lastElement.getClassName()) {
                        "number" -> {
                            if (newElement.getElementText()[0]==')') formula.add(newElement)
                        }

                        "operation" -> {
                            if (newElement.getElementText()[0]=='(') formula.add(newElement)
                        }

                        "symbol" -> {
                            if (newElement.getElementText()[0]==lastElement.getElementText()[0]) formula.add(newElement)
                        }

                        "variable" -> {
                        }

                        "function" -> {
                        }

                        else -> formula.add(newElement)
                    }
                }

                "variable" -> {
                    when (lastElement.getClassName()) {
                        "number" -> {
                        }

                        "operation" -> {
                        }

                        "symbol" -> {
                        }

                        "variable" -> {
                        }

                        "function" -> {
                        }

                        else -> formula.add(newElement)
                    }
                }

                "function" -> {
                    when (lastElement.getClassName()) {
                        "number" -> {
                        }

                        "operation" -> {
                        }

                        "symbol" -> {
                        }

                        "variable" -> {
                        }

                        "function" -> {
                        }

                        else -> formula.add(newElement)
                    }
                }
            }
        } else formula.add(newElement)
    }

    fun deleteLastElement() {
        if (formula.isNotEmpty()) {
            val lastElement = formula[formula.size-1]
            if (lastElement is NumberElement) {
                val size = lastElement.getElementText().length
                if (size > 1) lastElement.deleteLastDigit()
                    else formula.removeAt(formula.size-1)
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

    private fun canAddElement(element: Element) : Boolean {
        if (formula.isEmpty()) return true
        val lastElement = formula[formula.size-1]


        return false
    }
}