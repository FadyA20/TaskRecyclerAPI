package com.example.retrofittest

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.retrofittest.databinding.ItemLayoutBinding

class MyAdapter(private var albums: List<album>) : RecyclerView.Adapter<MyAdapter.ViewHolder>() {
    class ViewHolder(val binding: ItemLayoutBinding) : RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount() = albums.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item=albums[position]
        holder.binding.albumUserId.text=item.userId.toString()
        holder.binding.albumId.text=item.id.toString()
        holder.binding.albumTitle.text=item.title
    }

}