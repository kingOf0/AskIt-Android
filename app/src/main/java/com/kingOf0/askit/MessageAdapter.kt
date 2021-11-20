package com.kingOf0.askit

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kingOf0.askit.databinding.MessageCardBinding
import com.kingOf0.askit.model.Message

class MessageAdapter(private val list: List<Message>) :
    RecyclerView.Adapter<MessageAdapter.MessageCardDesign>() {

    class MessageCardDesign(val binding: MessageCardBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MessageCardDesign {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = MessageCardBinding.inflate(layoutInflater, parent, false)

        return MessageCardDesign(binding)
    }

    override fun onBindViewHolder(holder: MessageCardDesign, position: Int) {
        val message = list[position]

        holder.binding.apply {
            this.message.text = message.message
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }

}