package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.items.view.*

class ItemsAdapter(private val items: List<Items>) :
    RecyclerView.Adapter<ItemsAdapter.ProductViewHolder>() {

    class ProductViewHolder(view: View) : RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.items, parent, false)

        return ProductViewHolder(view)

    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {

        val p = items[position]

        holder.itemView.imageView.setImageResource(p.image)

        holder.itemView.textView3.text = p.title

        holder.itemView.textView.text = p.description


    }

}