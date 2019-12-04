package com.haiph.component.ui.Parcelable

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.haiph.component.R
import com.haiph.component.ui.Parcelable.model.MyParcelable
import kotlinx.android.synthetic.main.item_parce.view.*

class AdapterParce(private var list: ArrayList<MyParcelable>, private var itemOnclick: ItemOnclick  ) : RecyclerView.Adapter<AdapterParce.ViewHolder>() {

    class ViewHolder(view : View) : RecyclerView.ViewHolder(view) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_parce,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
       return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemView.item_name.text = list.get(position).toString()
        holder.itemView.item_phone.text = list.get(position).toString()
        holder.itemView.item.setOnClickListener {
            itemOnclick.OnclickListener(position)
        }
    }

}