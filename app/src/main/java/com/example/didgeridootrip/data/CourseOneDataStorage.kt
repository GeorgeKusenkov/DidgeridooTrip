package com.example.didgeridootrip.data

import com.example.didgeridootrip.R
import com.example.didgeridootrip.domain.entities.LessonItem
import com.example.didgeridootrip.domain.entities.ModuleItem

object CourseOneDataStorage {
    fun getModuleList(): Array<ModuleItem> {
        return arrayOf(
            ModuleItem(
                id = 1,
                title = R.string.module1,
                description = R.string.course1_module1_description,
                image = R.drawable.ic_course1_module1,
                enabled = true
            ),

            ModuleItem(
                id = 2,
                title = R.string.module2,
                description = R.string.course1_module2_description,
                image = R.drawable.ic_course1_module2,
                enabled = false
            ),

            ModuleItem(
                id = 3,
                title = R.string.module3,
                description = R.string.course1_module3_description,
                image = R.drawable.ic_course1_module3,
                enabled = false
            ),

            ModuleItem(
                id = 4,
                title = R.string.module4,
                description = R.string.course1_module4_description,
                image = R.drawable.ic_course1_module4,
                enabled = false
            )
        )
    }

    fun getModuleOneLessonList(): Array<LessonItem> {
        return arrayOf(
            LessonItem(R.string.lesson1, R.string.course1_module1_lesson1_title, R.drawable.course1_module1_lesson1, 0),
            LessonItem(R.string.lesson2, R.string.course1_module1_lesson2_title, R.drawable.course1_module1_lesson2, 0),
            LessonItem(R.string.lesson3, R.string.course1_module1_lesson3_title, R.drawable.course1_module1_lesson3, 0),
            LessonItem(R.string.lesson4, R.string.course1_module1_lesson4_title, R.drawable.course1_module1_lesson4, 0),
            LessonItem(R.string.lesson5, R.string.course1_module1_lesson5_title, R.drawable.course1_module1_lesson5, 0)
        )
    }

    fun getModuleTwoLessonList(): Array<LessonItem> {
        return arrayOf(
            LessonItem(R.string.lesson1, R.string.course1_module1_lesson1_title, R.drawable.ic_arrow_forward, 0),
            LessonItem(R.string.lesson2, R.string.course1_module1_lesson2_title, R.drawable.ic_arrow_forward, 0),
            LessonItem(R.string.lesson3, R.string.course1_module1_lesson3_title, R.drawable.ic_arrow_forward, 0),
        )
    }

    fun getModuleThreeLessonList(): Array<LessonItem> {
        return arrayOf(

        )
    }

    fun getModuleFourLessonList(): Array<LessonItem> {
        return arrayOf(

        )
    }

    fun getModuleFiveLessonList(): Array<LessonItem> {
        return arrayOf(

        )
    }
}

