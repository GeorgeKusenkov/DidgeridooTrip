package com.example.didgeridootrip.domain.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.didgeridootrip.domain.entities.LessonItem

interface LessonListRepository {
    fun getLessonsList(): MutableLiveData<List<LessonItem>>
    fun setRightLessonList(id: Int)
}