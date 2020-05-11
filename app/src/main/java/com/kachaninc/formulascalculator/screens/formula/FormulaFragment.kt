package com.kachaninc.formulascalculator.screens.formula

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.kachaninc.formulascalculator.R
import com.kachaninc.formulascalculator.databinding.FragmentFormulaBinding

class FormulaFragment : Fragment() {

    private lateinit var binding: FragmentFormulaBinding
    private lateinit var viewModel: FormulaViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_formula, container, false)
        viewModel = ViewModelProvider(this).get(FormulaViewModel::class.java)

        binding.formulaViewModel = viewModel
        binding.lifecycleOwner = this

        return binding.root
    }

}
