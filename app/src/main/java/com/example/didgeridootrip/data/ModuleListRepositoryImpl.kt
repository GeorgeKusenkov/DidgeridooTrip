package com.example.didgeridootrip.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.didgeridootrip.domain.entities.ModuleItem
import com.example.didgeridootrip.domain.repository.ModuleListRepository

object ModuleListRepositoryImpl: ModuleListRepository {
    private val moduleListLiveData = MutableLiveData<List<ModuleItem>>()
    private val moduleList = mutableListOf<ModuleItem>()
    private val modules = CourseOneDataStorage.getModuleList()

    init {
            for (i in modules.indices) {
            val item = CourseOneDataStorage.getModuleList()
            moduleList.add(item[i])
            updateList()
        }
    }

    override fun getModuleList(): LiveData<List<ModuleItem>> {
        return moduleListLiveData
    }

    private fun updateList() {
        moduleListLiveData.value = moduleList.toList()
    }
}