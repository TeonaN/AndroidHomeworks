package com.example.assignment8
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.note_item.view.*

class ItemsAdapter( private var items: MutableList<String>) :
    RecyclerView.Adapter<ItemsAdapter.ProductViewHolder>() {

    class ProductViewHolder(view: View) : RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder( parent: ViewGroup, viewType: Int): ProductViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.note_item, parent,false)
        return ProductViewHolder(view)

    }

    override fun getItemCount(): Int = items.count()

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        val p = items[position]


        holder.itemView.textView1.text = p

    }

    fun addItem(item: String) {
        items.add(0, item)
        notifyDataSetChanged()
    }

    fun deleteItems(items: MutableList<String>) {
        this.items = items
        notifyDataSetChanged()
    }




}



