package com.example.recyclerviewapp

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ExamViewHolder(var itemView: View): RecyclerView.ViewHolder(itemView) {
    var examName: TextView
    var examMessage: TextView
    var examDate: TextView

    init {
        examName = itemView.findViewById(R.id.examName)
        examMessage = itemView.findViewById(R.id.examMessage)
        examDate = itemView.findViewById(R.id.examDate)
    }
}