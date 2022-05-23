package com.example.didgeridootrip.presentation.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.didgeridootrip.R
import com.example.didgeridootrip.domain.entities.ModuleItem

class ModuleListAdapter: RecyclerView.Adapter<ModuleListAdapter.ModuleItemViewHolder>() {

    var moduleList = listOf<ModuleItem>()

    class ModuleItemViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val tvTitle: TextView = view.findViewById(R.id.tv_module_title)
        val tvDescription: TextView = view.findViewById(R.id.tv_module_description)
        val tvImage: ImageView = view.findViewById(R.id.module_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ModuleItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(
            R.layout.module_item,
            parent,
            false
        )
        return ModuleItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: ModuleItemViewHolder, position: Int) {
        val moduleItem = moduleList[position]
        holder.tvImage.setImageResource(moduleItem.image)
        holder.tvTitle.setText(moduleItem.title)
        holder.tvDescription.setText(moduleItem.description)

    }

    override fun getItemCount(): Int {
        return moduleList.size
    }
}