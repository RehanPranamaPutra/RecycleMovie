package com.rehan.myapplication.Adapter

import android.content.Intent
import android.telecom.Call.Details
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import com.rehan.myapplication.DetailMovie
import com.rehan.myapplication.Model.modelMovie1
import com.rehan.myapplication.R
import com.rehan.myapplication.RecycleMovie

class MovieAdapter (
    val itemList : ArrayList<modelMovie1>,
    val getActivty : RecycleMovie
) : RecyclerView.Adapter<MovieAdapter.MyViewHolder>() {

    class MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        var itemImage : ImageView
        var itemNama : TextView
//        var txtSinopsisMovie : TextView

        init {
            itemImage = itemView.findViewById(R.id.imgMovieItem) as ImageView
            itemNama = itemView.findViewById(R.id.txtMovieJudul) as TextView
//            txtSinopsisMovie = itemView.findViewById(R.id.txtSinopsisMovie) as TextView
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val nView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_recycle_movie, parent, false)

        return MyViewHolder(nView)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.itemNama.setText(itemList[position].judul)
         holder.itemImage.setImageResource(itemList[position].gambar)

       // holder.txtSinopsisMovie.setText(itemList[position].sinopsis)

        holder.itemView.setOnClickListener(){
            val intent=Intent(getActivty,DetailMovie::class.java)
            intent.putExtra("judul",itemList[position].judul)
            intent.putExtra("gambar",itemList[position].gambar)
            getActivty.startActivity(intent)
        }

    }
}