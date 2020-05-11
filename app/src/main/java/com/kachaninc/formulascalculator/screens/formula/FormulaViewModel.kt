package com.kachaninc.formulascalculator.screens.formula

import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FormulaViewModel : ViewModel() {

    private var _formulaText = MutableLiveData<String>()
    val formulaText: LiveData<String>
        get() = _formulaText

    init {
        _formulaText.value = ""
    }

    fun onTextButtonClicked (view: View) {
        _formulaText.value += (view as Button).text
        Log.d("leo", "")
    }

}