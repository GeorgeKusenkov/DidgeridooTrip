package com.example.didgeridootrip.presentation.fragments.courseOne.moduleTwo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.didgeridootrip.R
import com.example.didgeridootrip.databinding.FragmentLessonsOneModuleBinding
import com.example.didgeridootrip.databinding.FragmentModuleTwoLessonBinding
import com.example.didgeridootrip.presentation.adapters.LessonListAdapter
import com.example.didgeridootrip.presentation.viewModel.LessonViewModel
import java.lang.RuntimeException

class ModuleTwoLessonFragment : Fragment() {

    private lateinit var viewModel: LessonViewModel
    private lateinit var adapter: LessonListAdapter

    private var _binding: FragmentModuleTwoLessonBinding? = null
    private val binding: FragmentModuleTwoLessonBinding
        get() = _binding ?: throw RuntimeException("FragmentModuleTwoLessonBinding == null")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentModuleTwoLessonBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupRecyclerView()
        observeViewModel()
        setOnClickListener()
    }

    private fun setupRecyclerView() {
        val rvLessonList = binding.rvModuleTwoLessonItemList
        adapter = LessonListAdapter()
        rvLessonList.adapter = adapter
    }

    private fun observeViewModel() {
        viewModel = ViewModelProvider(this).get(LessonViewModel::class.java)
        viewModel.moduleList.observe(requireActivity()) {
            adapter.lessonList = it
        }
    }

    private fun setOnClickListener() {
        adapter.onLessonItemClickListener = {
            when(it) {
                1 -> findNavController().navigate(R.id.action_moduleTwoLessonFragment_to_courseOneModuleTwoLessonOneFragment)
                2 -> findNavController().navigate(R.id.action_moduleTwoLessonFragment_to_courseOneModuleTwoLessonTwoFragment)
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}