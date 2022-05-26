package com.example.didgeridootrip.data

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.didgeridootrip.domain.entities.LessonItem
import com.example.didgeridootrip.domain.repository.LessonListRepository

object LessonListRepositoryImpl: LessonListRepository {

    private val lessonListLiveData = MutableLiveData<List<LessonItem>>()
    private val lessonList = mutableListOf<LessonItem>()

    override fun getLessonsList(): MutableLiveData<List<LessonItem>> {
        return lessonListLiveData
    }

    override fun setRightLessonList(id: Int) {

        val allLessons = when(id) {
            1 -> CourseOneDataStorage.getModuleOneLessonList()
            2 -> CourseOneDataStorage.getModuleTwoLessonList()
            else -> throw Exception("Unknown Lesson List")
        }

        lessonList.clear()
        updateList()

        for (i in allLessons.indices) {
            lessonList.add(allLessons[i])
        }
        updateList()
    }

    private fun updateList() {
        lessonListLiveData.value = lessonList.toList()
    }
}