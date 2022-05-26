package com.example.didgeridootrip.presentation.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.didgeridootrip.R
import com.example.didgeridootrip.domain.entities.LessonItem

class LessonListAdapter: RecyclerView.Adapter<LessonListAdapter.LessonItemViewHolder>() {

    var onLessonItemClickListener: ((Int) -> Unit)? = null
    var lessonList = listOf<LessonItem>()

    class LessonItemViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val tvTitle: TextView = view.findViewById(R.id.tv_lesson_item_title)
        val tvDescription: TextView = view.findViewById(R.id.tv_lesson_item_description)
        val ivImage: ImageView = view.findViewById(R.id.iv_lesson_item_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LessonItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(
            R.layout.lesson_item,
            parent,
            false
        )
        return LessonItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: LessonItemViewHolder, position: Int) {
        val lessonItem = lessonList[position]
        holder.tvTitle.setText(lessonItem.title)
        holder.tvDescription.setText(lessonItem.description)
        holder.ivImage.setImageResource(lessonItem.image)

        holder.itemView.setOnClickListener{
            onLessonItemClickListener?.invoke(position+1)
        }
    }

    override fun getItemCount(): Int {
        return lessonList.size
    }

}