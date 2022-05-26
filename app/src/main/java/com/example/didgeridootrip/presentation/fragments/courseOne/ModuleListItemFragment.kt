package com.example.didgeridootrip.presentation.fragments.courseOne

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.didgeridootrip.R
import com.example.didgeridootrip.databinding.FragmentModuleListItemBinding
import com.example.didgeridootrip.presentation.viewModel.ModuleViewModel
import com.example.didgeridootrip.presentation.adapters.ModuleListAdapter
import java.lang.RuntimeException

class ModuleListItemFragment : Fragment() {

    private lateinit var viewModel: ModuleViewModel
    private lateinit var adapter: ModuleListAdapter

    private var _binding: FragmentModuleListItemBinding? = null
    private val binding: FragmentModuleListItemBinding
        get() = _binding ?: throw RuntimeException("ModuleListItemFragment == null")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentModuleListItemBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupRecyclerView()
        observeViewModel()
        setOnClickListener()
    }

    private fun setupRecyclerView() {
        val rvModuleList = binding.rvModuleList
        adapter = ModuleListAdapter()
        rvModuleList.adapter = adapter
    }

    private fun observeViewModel() {
        viewModel = ViewModelProvider(this).get(ModuleViewModel::class.java)
        viewModel.moduleList.observe(requireActivity()) {
            adapter.moduleList = it
        }
    }

    private fun setOnClickListener() {
        adapter.onModuleItemClickListener = {




            viewModel.getItemId(it.id)



            Toast.makeText(requireContext(), it.id.toString(), Toast.LENGTH_SHORT).show()
            when(it.id) {
                1 -> findNavController().navigate(R.id.action_moduleListItemFragment_to_moduleOneLessonsFragment)
                2 -> findNavController().navigate(R.id.action_moduleListItemFragment_to_moduleTwoLessonFragment)
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}