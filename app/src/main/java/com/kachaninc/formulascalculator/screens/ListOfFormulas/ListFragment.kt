package com.kachaninc.formulascalculator.screens.ListOfFormulas

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.kachaninc.formulascalculator.R
import com.kachaninc.formulascalculator.databinding.FragmentListBinding

class ListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentListBinding>(inflater,
            R.layout.fragment_list, container, false)
        binding.addFormulaButton.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_listFragment_to_formulaFragment)
        )
        return binding.root
    }

}
