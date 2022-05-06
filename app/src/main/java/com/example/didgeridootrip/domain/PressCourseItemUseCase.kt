package com.example.didgeridootrip.domain

class PressCourseItemUseCase(private val courseListRepository: CourseListRepository) {
    fun pressCourseItem(courseItem: CourseItem) {
        courseListRepository.pressCourseItem(courseItem)
    }
}