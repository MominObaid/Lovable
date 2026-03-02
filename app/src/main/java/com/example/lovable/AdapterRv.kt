package com.example.lovable

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdapterRv(private val itemRV: List<ItemRV>) : RecyclerView.Adapter<AdapterRv.AdapterViewHolder>() {

    class AdapterViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val tvName :TextView = itemView.findViewById(R.id.tv_name)
        val tvDetail : TextView = itemView.findViewById(R.id.tv_detail)
        val tvDetailHashtag: TextView = itemView.findViewById(R.id.tv_detail_hashtag)
        val tvTime: TextView = itemView.findViewById(R.id.time)

    }

    override fun onCreateViewHolder(
        parent: ViewGroup, viewType: Int
    ): AdapterViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_rv, parent, false)
        return AdapterViewHolder(view)

    }

    override fun onBindViewHolder(
        holder: AdapterViewHolder,
        position: Int
    ) {
        val item = itemRV[position]
        holder.tvName.text = item.name
        holder.tvDetail.text = item.detail
        holder.tvDetailHashtag.text = item.detailHashtag
        holder.tvTime.text = item.time.toString()

   }

    override fun getItemCount(): Int {
        return itemRV.size
    }
}