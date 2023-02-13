package com.example.recyclerviewapp

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter(private var list: List<Exam>, var context: Context, private var clickListener: ClickListener):
    RecyclerView.Adapter<ExamViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExamViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        val photoView = inflater.inflate(R.layout.exam_card, parent, false)
        return ExamViewHolder(photoView)
    }

    override fun onBindViewHolder(holder: ExamViewHolder, position: Int) {
        val index = holder.adapterPosition
        holder.examName.text = list[position].name
        holder.examMessage.text = list[position].message
        holder.examDate.text = list[position].date
        holder.itemView.setOnClickListener {
            clickListener.onClick(index)
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }

}
