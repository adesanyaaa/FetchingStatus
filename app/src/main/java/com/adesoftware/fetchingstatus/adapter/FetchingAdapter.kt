package com.adesoftware.fetchingstatus.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.adesoftware.fetchingstatus.R
import com.adesoftware.fetchingstatus.model.FetchingData
import com.adesoftware.fetchingstatus.model.Sites
import kotlinx.android.synthetic.main.status_layout.view.*

class FetchingAdapter: RecyclerView.Adapter<FetchingAdapter.MyViewHolder>() {

    private var myList = emptyList<FetchingData>()

    inner class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.status_layout, parent, false))
    }

    override fun getItemCount(): Int {
        return myList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.itemView.url_text.text = myList[position].url.toString()
        holder.itemView.response_code.text = myList[position].responseCode.toInt()
        holder.itemView.response_time.text = myList[position].responseTime.toDouble()
        holder.itemView.classx_text.text = myList[position].classX.toString()
    }

    fun setData(newList: List<FetchingData>) {
        myList = newList
        notifyDataSetChanged()
    }
}