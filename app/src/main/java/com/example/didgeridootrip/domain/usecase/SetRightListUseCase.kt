package com.example.didgeridootrip.domain.usecase

import com.example.didgeridootrip.domain.repository.LessonListRepository

class SetRightListUseCase(private val lessonListRepository: LessonListRepository) {
    fun setRightLessonList(id: Int) {
        lessonListRepository.setRightLessonList(id)
    }
}