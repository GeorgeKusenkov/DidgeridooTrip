package com.example.didgeridootrip.presentation.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.didgeridootrip.data.LessonListRepositoryImpl
import com.example.didgeridootrip.domain.usecase.GetLessonListUseCase

class LessonViewModel: ViewModel() {
    private val repository = LessonListRepositoryImpl
    private val getLessonListUseCase = GetLessonListUseCase(repository)

    val moduleList = getLessonListUseCase.getList()
}