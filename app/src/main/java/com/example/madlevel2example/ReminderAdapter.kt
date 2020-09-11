package com.example.madlevel2example

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.madlevel2example.databinding.ItemReminderBinding

class ReminderAdapter(

    private val reminders: List<Reminder>

) : RecyclerView.Adapter<ReminderAdapter.ViewHolder>() { // : means extends like in java

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_reminder, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.databind(reminders[position])
    }

    // Returns the number of items in the list
    override fun getItemCount(): Int {
        return reminders.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val binding = ItemReminderBinding.bind(itemView)

        fun databind(reminder: Reminder) {
            binding.tvReminder.text = reminder.reminderText
        }
    }


}