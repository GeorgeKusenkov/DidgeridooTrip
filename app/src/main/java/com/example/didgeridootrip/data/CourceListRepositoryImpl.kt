package com.example.didgeridootrip.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.didgeridootrip.domain.entities.CourseItem
import com.example.didgeridootrip.domain.repository.CourseListRepository

object CourseListRepositoryImpl: CourseListRepository {

    private val courseListLiveData = MutableLiveData<List<CourseItem>>()
    private val courseList = mutableListOf<CourseItem>()

    init {
        for (i in 0 until 10) {
            val item = CourseOneDataStorage.getModuleList()
//            courseList.add(item[i])
            updateList()
        }
    }

    override fun getCourseList(): LiveData<List<CourseItem>> {
        return courseListLiveData
    }

    private fun updateList() {
        courseListLiveData.value = courseList.toList()
    }
}
