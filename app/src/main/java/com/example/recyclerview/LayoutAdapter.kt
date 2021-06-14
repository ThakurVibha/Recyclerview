package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.layout_item.view.*

class LayoutAdapter(private val layoutList: List<LayoutItem>) :
    RecyclerView.Adapter<LayoutAdapter.LayoutViewHolder>() {

    class LayoutViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LayoutViewHolder {
        val layout = LayoutInflater.from(parent.context).inflate(
            R.layout.layout_item,
            parent, false
        )
        return LayoutViewHolder(layout)
    }

    override fun getItemCount(): Int {
        return layoutList.size
    }

    override fun onBindViewHolder(holder: LayoutViewHolder, position: Int) {
        val currentLayout = layoutList[position]
        holder.itemView.imageView.setImageResource(currentLayout.image)
        holder.itemView.name.text = currentLayout.name
        holder.itemView.price.text = currentLayout.price.toString()

    }

}