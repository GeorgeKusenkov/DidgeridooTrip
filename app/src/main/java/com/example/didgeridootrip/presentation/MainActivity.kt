package com.example.didgeridootrip.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.example.didgeridootrip.R
import com.example.didgeridootrip.presentation.adapters.ModuleListAdapter

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainViewModel
    private lateinit var adapter: ModuleListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupRecyclerView()
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        viewModel.moduleList.observe(this) {
            adapter.moduleList = it
        }
    }

    private fun setupRecyclerView() {
        val rvModuleList = findViewById<RecyclerView>(R.id.rv_module_list)
        adapter = ModuleListAdapter()
        rvModuleList.adapter = adapter
    }
}