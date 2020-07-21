package com.lee.kioskour.mymain

import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.lee.kioskour.R
import com.lee.kioskour.model.MyOrder

class MyOrderAdapter(val clickListener: MyOrderListener) : RecyclerView.Adapter<MyOrderAdapter.ViewHolder>() {
    var data = listOf<MyOrder>()

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = data[position]

        holder.bind(clickListener, item)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.list_item_my_order, parent, false)
        return ViewHolder(view)
    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        private val foodName: TextView = itemView.findViewById(R.id.name_text)
        private val price: TextView = itemView.findViewById(R.id.price_text)
        private val orderImage: ImageView = itemView.findViewById(R.id.order_image)

        fun bind(clickListener: MyOrderListener, item: MyOrder){
            foodName.text = item.foodName
            price.text = item.price.toString()
            orderImage.setImageResource(R.drawable.ic_launcher_background)
            itemView.setOnClickListener{
                clickListener.onClick(item)
            }
        }
    }
}

class MyOrderListener(val clickListener: (order: MyOrder) -> Unit) {
    fun onClick(order: MyOrder) = clickListener(order)
}