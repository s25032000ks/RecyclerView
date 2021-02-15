package com.example.recyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class ImageAdapter(val context: Context, val itemList: ArrayList<ImageUrl>) : RecyclerView.Adapter<ImageAdapter.ImageViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recycler_single_row, parent, false)
        return ImageViewHolder(view)
    }

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        val image = itemList[position]
        Picasso.get().load(image.imageUrl).error(R.drawable.number1).into(holder.imgThumbnail)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    class ImageViewHolder(view: View): RecyclerView.ViewHolder(view){
        val imgThumbnail:ImageView = view.findViewById(R.id.imgThumbnail)
    }
}