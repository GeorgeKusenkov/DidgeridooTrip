package com.example.didgeridootrip.presentation

import androidx.lifecycle.ViewModel
import com.example.didgeridootrip.data.CourseListRepositoryImpl
import com.example.didgeridootrip.data.ModuleListRepositoryImpl
import com.example.didgeridootrip.domain.usecase.GetCourseListUseCase
import com.example.didgeridootrip.domain.usecase.GetModuleListUseCase

class MainViewModel: ViewModel() {

    private val repository = CourseListRepositoryImpl
    private val getCourseListUseCase = GetCourseListUseCase(repository)

    private val repository2 = ModuleListRepositoryImpl
    private val getModuleListUseCase = GetModuleListUseCase(repository2)

    val courseList = getCourseListUseCase.invoke()
    val moduleList = getModuleListUseCase.invoke()
}