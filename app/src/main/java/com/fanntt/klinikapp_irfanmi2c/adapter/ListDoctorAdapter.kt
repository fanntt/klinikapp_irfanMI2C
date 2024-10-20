package com.fanntt.klinikapp_irfanmi2c.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.fanntt.klinikapp_irfanmi2c.R
import com.fanntt.klinikapp_irfanmi2c.adapter.MenuIconAdapter.MyViewHolder
import com.fanntt.klinikapp_irfanmi2c.model.ModelListDoctors


class ListDoctorAdapter (
    val itemDoctorList : List<ModelListDoctors>
) : RecyclerView.Adapter<ListDoctorAdapter.MyViewHolder>(){
    class MyViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView){
        var ImgDoctor : ImageView=itemView.findViewById(R.id.imgDoctor)
        var NamaDoctor : TextView=itemView.findViewById(R.id.txtDoctorName)
        var SpecsDoctor : TextView=itemView.findViewById(R.id.txtDoctorSpecs)
        var JumlahReview : TextView=itemView.findViewById(R.id.txtReviews)
        var JumlahRating: TextView=itemView.findViewById(R.id.txtAvgRating)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val nView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_menu_home,parent,false )
        return MyViewHolder(nView)
    }

    override fun getItemCount(): Int {
        return itemDoctorList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = itemDoctorList[position]
        holder.ImgDoctor.setImageResource(currentItem.ImgDoctor)
        holder.NamaDoctor.text = currentItem.NamaDoctor.toString()
        holder.SpecsDoctor.text = currentItem.SpecsDoctor.toString()
        holder.JumlahReview.text = currentItem.JumlahReview.toString()
        holder.JumlahRating.text = currentItem.JumlahRating.toString()
    }
}