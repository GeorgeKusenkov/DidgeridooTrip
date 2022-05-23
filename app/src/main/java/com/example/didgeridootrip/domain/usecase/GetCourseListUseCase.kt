package com.example.didgeridootrip.domain.usecase

import androidx.lifecycle.LiveData
import com.example.didgeridootrip.domain.entities.CourseItem
import com.example.didgeridootrip.domain.repository.CourseListRepository

class GetCourseListUseCase(private val repository: CourseListRepository) {
        operator fun invoke(): LiveData<List<CourseItem>> {
            return repository.getCourseList()
        }
}