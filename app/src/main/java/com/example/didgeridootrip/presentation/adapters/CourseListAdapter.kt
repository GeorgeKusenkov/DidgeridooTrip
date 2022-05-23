package com.example.didgeridootrip.presentation.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.didgeridootrip.R
import com.example.didgeridootrip.domain.entities.CourseItem

class CourseListAdapter: RecyclerView.Adapter<CourseListAdapter.CourseItemViewHolder>() {

    var courseList = listOf<CourseItem>()

    class CourseItemViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val tvTitle:TextView = view.findViewById(R.id.tv_module_title)
        val tvDescription: TextView = view.findViewById(R.id.tv_module_description)
        val tvImage: ImageView = view.findViewById(R.id.course_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CourseItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(
            R.layout.course_item,
            parent,
            false
        )
        return CourseItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: CourseItemViewHolder, position: Int) {
        val courseItem = courseList[position]
        holder.tvTitle.text = courseItem.title
        holder.tvDescription.text = courseItem.description
//        holder.tvImage.resources = courseItem.image.toString()
    }

    override fun getItemCount(): Int {
        return courseList.size
    }

}