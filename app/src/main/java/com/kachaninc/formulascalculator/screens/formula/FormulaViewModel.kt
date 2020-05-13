package com.kachaninc.formulascalculator.screens.formula

import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import org.mariuszgromada.math.mxparser.*

class FormulaViewModel : ViewModel() {

    private var _formulaText = MutableLiveData<String>()
    val formulaText: LiveData<String>
        get() = _formulaText

    init {
        _formulaText.value = ""
    }

    fun onTextButtonClicked (view: View) {
        val newElement = (view as Button).text.toString()
        if (formulaText.value.isNullOrEmpty() || canAddElementToFormula(newElement)) _formulaText.value += newElement
    }

    private fun canAddElementToFormula(newElement: String): Boolean {
        val lastSymbol = formulaText.value!![formulaText.value?.length!!-1]



        return false
    }

}