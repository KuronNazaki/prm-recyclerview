package com.example.recyclerviewapp

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class FirstFragment : Fragment() {
    private lateinit var adapter: RecyclerAdapter
    private lateinit var recyclerView: RecyclerView
    private lateinit var listener: ClickListener

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.fragment_first, container, false)!!
        val list = getData()
        recyclerView = view.findViewById(R.id.recyclerView)!!

        listener = object : ClickListener {
            override fun onClick(index: Int) {
                Toast.makeText(view.context, "Click item index is $index", Toast.LENGTH_LONG).show()
            }
        }
        adapter = RecyclerAdapter(list, view.context, listener)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = GridLayoutManager(view.context, 2)
        return view
    }

    private fun getData(): ArrayList<Exam> {
        val list = ArrayList<Exam>()
        list.add(Exam("First Exam", "May 23", "Best Of Luck"))
        list.add(Exam("Second Exam", "May 25", "Best Of Luckiest"))
        list.add(Exam("Third Exam", "May 28", "This is test"))
        list.add(Exam("First Exam", "May 23", "Best Of Luck"))
        list.add(Exam("First Exam", "May 23", "Best Of Luck"))
        list.add(Exam("First Exam", "May 23", "Best Of Luck"))
        list.add(Exam("First Exam", "May 23", "Best Of Luck"))
        list.add(Exam("First Exam", "May 23", "Best Of Luck"))
        list.add(Exam("Second Exam", "May 25", "Best Of Luckiest"))
        list.add(Exam("Third Exam", "May 28", "This is test"))
        list.add(Exam("Second Exam", "May 25", "Best Of Luckiest"))
        list.add(Exam("Third Exam", "May 28", "This is test"))
        list.add(Exam("Second Exam", "May 25", "Best Of Luckiest"))
        list.add(Exam("Third Exam", "May 28", "This is test"))
        list.add(Exam("Second Exam", "May 25", "Best Of Luckiest"))
        list.add(Exam("Third Exam", "May 28", "This is test"))
        list.add(Exam("Second Exam", "May 25", "Best Of Luckiest"))
        list.add(Exam("Third Exam", "May 28", "This is test"))
        return list
    }

}