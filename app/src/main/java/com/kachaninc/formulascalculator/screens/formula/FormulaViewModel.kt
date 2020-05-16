package com.kachaninc.formulascalculator.screens.formula

import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kachaninc.formulascalculator.classes.Formula
import com.kachaninc.formulascalculator.classes.NumberElement
import com.kachaninc.formulascalculator.classes.OperationElement
import com.kachaninc.formulascalculator.classes.SymbolElement
import org.mariuszgromada.math.mxparser.*

class FormulaViewModel : ViewModel() {

    private var formula = Formula()

    private var _formulaText = MutableLiveData<String>()
    val formulaText: LiveData<String>
        get() = _formulaText

    init {
        setText()
    }

    fun onFormulaElementButtonClicked (view: View) {
        val newElement = (view as Button).text.toString()[0]
        when (newElement) {
            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '.' -> {
                val newNumberElement = NumberElement(newElement)
                formula.addElement(newNumberElement)
            }

            '+', '-', 'x', '/' -> {
                val newOperationElement = OperationElement(newElement)
                formula.addElement(newOperationElement)
            }

            '(', ')' -> {
                val newSymbolElement = SymbolElement(newElement)
                formula.addElement(newSymbolElement)
            }
        }
        setText()
    }

    fun onDeleteButtonClicked() {
        formula.deleteLastElement()
        setText()
    }

    private fun setText() {
        _formulaText.value = formula.getFormulaText()
    }

}