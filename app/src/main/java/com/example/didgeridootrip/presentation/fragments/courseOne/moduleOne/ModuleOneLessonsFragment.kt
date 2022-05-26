package com.example.didgeridootrip.presentation.fragments.courseOne.moduleOne

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.didgeridootrip.R
import com.example.didgeridootrip.databinding.FragmentLessonsOneModuleBinding
import com.example.didgeridootrip.presentation.adapters.LessonListAdapter
import com.example.didgeridootrip.presentation.viewModel.LessonViewModel
import com.example.didgeridootrip.presentation.viewModel.ModuleViewModel
import java.lang.RuntimeException

class ModuleOneLessonsFragment : Fragment() {

    private lateinit var viewModel: LessonViewModel
    private lateinit var adapter: LessonListAdapter

    private var _binding: FragmentLessonsOneModuleBinding? = null
    private val binding: FragmentLessonsOneModuleBinding
        get() = _binding ?: throw RuntimeException("FragmentLessonsOneModuleBinding == null")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentLessonsOneModuleBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupRecyclerView()
        observeViewModel()
        setOnClickListener()
    }

    private fun setupRecyclerView() {
        val rvLessonList = binding.rvModuleOneLessonItemList
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
                1 -> findNavController().navigate(R.id.action_moduleOneLessonsFragment_to_lessonOneFragment)
                2 -> findNavController().navigate(R.id.action_moduleOneLessonsFragment_to_lessonTwoFragment)
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}