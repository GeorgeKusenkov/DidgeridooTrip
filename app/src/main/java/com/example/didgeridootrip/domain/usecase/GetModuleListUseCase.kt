package com.example.didgeridootrip.domain.usecase

import androidx.lifecycle.LiveData
import com.example.didgeridootrip.domain.entities.ModuleItem
import com.example.didgeridootrip.domain.repository.ModuleListRepository

class GetModuleListUseCase(private val repository: ModuleListRepository) {
    operator fun invoke(): LiveData<List<ModuleItem>> {
        return repository.getModuleList()
    }
}