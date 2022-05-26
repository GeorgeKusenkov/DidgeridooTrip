package com.example.didgeridootrip.domain.usecase

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.didgeridootrip.domain.entities.LessonItem
import com.example.didgeridootrip.domain.repository.LessonListRepository

class GetLessonListUseCase(private val repository: LessonListRepository) {
    fun getList(): MutableLiveData<List<LessonItem>> {
        return repository.getLessonsList()
    }
}