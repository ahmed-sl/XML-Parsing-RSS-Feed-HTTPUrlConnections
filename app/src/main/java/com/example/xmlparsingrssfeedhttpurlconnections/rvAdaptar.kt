package com.example.xmlparsingrssfeedhttpurlconnections

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.xmlparsingrssfeedhttpurlconnections.databinding.ItemRowBinding

class rvAdaptar (val entry: ArrayList<String>,val athour: ArrayList<ArrayList<String>>): RecyclerView.Adapter<rvAdaptar.ItemHolder>(){
    class ItemHolder (val binding: ItemRowBinding): RecyclerView.ViewHolder(binding.root)


    var context: Context? = null
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        context=parent.getContext()
        return ItemHolder(ItemRowBinding.inflate(LayoutInflater.from(
            parent.context),
            parent,
            false)
        )
    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
        val name = entry[position]
        holder.binding.apply {
            textView.text = name
        }
        holder.itemView.setOnClickListener {
            val intent = Intent(context, MainActivity2::class.java)
            intent.putExtra("ath", athour)
            context!!.startActivity(intent)
        }
    }

    override fun getItemCount() = entry.size

}