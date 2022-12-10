package com.example.myfirstapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ListUnivAdapter(private val context: Context, private val listUniv: List<Univ>, val listener: (Univ) -> Unit) : RecyclerView.Adapter<ListUnivAdapter.ListViewHolder>() {

    class ListViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val imgUniv = view.findViewById<ImageView>(R.id.img_item_photo)
        val tvName = view.findViewById<TextView>(R.id.tv_item_name)
        val tvDetail = view.findViewById<TextView>(R.id.tv_item_detail)

        fun bindView(listUniv: Univ, listener: (Univ) -> Unit) {
            imgUniv.setImageResource(listUniv.photo)
            tvName.text = listUniv.name
            tvDetail.text = listUniv.detail
            itemView.setOnClickListener {
                listener(listUniv)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        return ListViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_row_univ, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        holder.bindView(listUniv[position], listener)
    }

    override fun getItemCount(): Int {
        return listUniv.size
    }


}


