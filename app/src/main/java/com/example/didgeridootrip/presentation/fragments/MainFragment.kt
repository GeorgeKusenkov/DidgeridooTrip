package com.example.didgeridootrip.presentation.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.didgeridootrip.R
import com.example.didgeridootrip.databinding.FragmentMainBinding
import com.example.didgeridootrip.databinding.FragmentModuleListItemBinding
import java.lang.RuntimeException

class MainFragment : Fragment() {

    private var _binding: FragmentMainBinding? = null
    private val binding: FragmentMainBinding
        get() = _binding?: throw RuntimeException("ModuleListItemFragment == null")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMainBinding.inflate(inflater, container, false)

        binding.button.setOnClickListener{
            findNavController().navigate(R.id.action_mainFragment_to_moduleListItemFragment)
        }

        return binding.root
    }

}