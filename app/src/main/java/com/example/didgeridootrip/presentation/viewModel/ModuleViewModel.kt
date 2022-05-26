package com.example.didgeridootrip.presentation.viewModel

import androidx.lifecycle.ViewModel
import com.example.didgeridootrip.data.LessonListRepositoryImpl
import com.example.didgeridootrip.data.ModuleListRepositoryImpl
import com.example.didgeridootrip.domain.usecase.SetRightListUseCase
import com.example.didgeridootrip.domain.usecase.GetModuleListUseCase

class ModuleViewModel: ViewModel() {
    private val moduleRepository = ModuleListRepositoryImpl
    private val lessonRepository = LessonListRepositoryImpl
    private val getModuleListUseCase = GetModuleListUseCase(moduleRepository)
    private val setRightLessonListUseCase = SetRightListUseCase(lessonRepository)

    val moduleList = getModuleListUseCase.invoke()


    fun getItemId(id: Int) {
        setRightLessonListUseCase.setRightLessonList(id)
    }
}