package com.example.didgeridootrip.domain.repository

import androidx.lifecycle.LiveData
import com.example.didgeridootrip.domain.entities.ModuleItem

interface ModuleListRepository {
    fun getModuleList(): LiveData<List<ModuleItem>>
}