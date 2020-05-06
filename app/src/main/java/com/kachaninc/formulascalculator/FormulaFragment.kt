package com.kachaninc.formulascalculator

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.kachaninc.formulascalculator.databinding.FragmentFormulaBinding

class FormulaFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentFormulaBinding>(inflater, R.layout.fragment_formula, container, false)
        return binding.root
    }

}
