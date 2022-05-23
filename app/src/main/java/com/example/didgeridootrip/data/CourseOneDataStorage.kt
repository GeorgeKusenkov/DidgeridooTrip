package com.example.didgeridootrip.data

import com.example.didgeridootrip.R
import com.example.didgeridootrip.domain.entities.LessonItem
import com.example.didgeridootrip.domain.entities.ModuleItem

object CourseOneDataStorage {
    fun getModuleList(): Array<ModuleItem> {
        return arrayOf(
            ModuleItem(R.string.module1, R.string.course1_module1_description, R.drawable.ic_course1_module1, 0, true),
            ModuleItem(R.string.module2, R.string.course1_module2_description, R.drawable.ic_course1_module2, 0, false),
            ModuleItem(R.string.module3, R.string.course1_module3_description, R.drawable.ic_course1_module3, 0, false),
            ModuleItem(R.string.module4, R.string.course1_module4_description, R.drawable.ic_course1_module4, 0, false)
        )
    }

    fun getModuleOneLessonList(): Array<LessonItem> {
        return arrayOf(
            LessonItem(R.string.lesson1, R.string.course1_module1_lesson1_title, R.drawable.course1_module1_lesson1, 0),
            LessonItem(R.string.lesson2, R.string.course1_module1_lesson2_title, R.drawable.course1_module1_lesson1, 0),
            LessonItem(R.string.lesson3, R.string.course1_module1_lesson3_title, R.drawable.course1_module1_lesson1, 0),
            LessonItem(R.string.lesson4, R.string.course1_module1_lesson4_title, R.drawable.course1_module1_lesson1, 0),
            LessonItem(R.string.lesson5, R.string.course1_module1_lesson5_title, R.drawable.course1_module1_lesson1, 0)
        )
    }

    fun getModuleTwoLessonList(): Array<LessonItem> {
        return arrayOf(

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

