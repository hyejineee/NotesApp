package com.hyejineee.notes

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.hyejineee.notes.databinding.ItemMainNoteBinding

class NotesAdapter(val notes : List<String>) : RecyclerView.Adapter<NotesAdapter.ItemViewHolder>(){
    class ItemViewHolder(private val binding: ItemMainNoteBinding)
        : RecyclerView.ViewHolder(binding.root){
        fun bind(){
            binding.title = "note 1"
            binding.executePendingBindings()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        return ItemViewHolder(ItemMainNoteBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.bind()
    }

    override fun getItemCount(): Int {
        return notes.size
    }

}