package com.example.didgeridootrip.domain.repository

import androidx.lifecycle.LiveData
import com.example.didgeridootrip.domain.entities.CourseItem

interface CourseListRepository {
    fun getCourseList(): LiveData<List<CourseItem>>
}