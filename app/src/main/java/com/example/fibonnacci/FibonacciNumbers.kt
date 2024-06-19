package com.example.fibonnacci

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class FibonacciNumbers (var fibonacii: List<Int>):RecyclerView.Adapter<fibonaciiHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): fibonaciiHolder {
        var itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_numbers , parent,false)
        return fibonaciiHolder(itemView)


    }

    override fun onBindViewHolder(holder: fibonaciiHolder, position: Int) {
        holder.rvNumbers.text= fibonacii[position].toString()

    }

    override fun getItemCount(): Int {
        return fibonacii.size

    }
}

class fibonaciiHolder (itemView: View) : ViewHolder(itemView){
var rvNumbers = itemView.findViewById<TextView>(R.id.rvNumbers)
}