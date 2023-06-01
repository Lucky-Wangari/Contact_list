package com.lucky.contactsapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ContactRvAdapter(var contactList:List<Contacts>): RecyclerView.Adapter<ContactsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactsViewHolder {
        var binding = ContactsListItemBinding.inflate(LayoutInflater.from(parent.context),parent, false)
        return ContactsViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return contactList.size
    }

    override fun onBindViewHolder(holder: ContactsViewHolder, position: Int) {
        var contact = contactList[position]
        holder.binding.apply
    }

}
class ContactsViewHolder(var binding:ContactsListItemBinding):RecyclerView.ViewHolder(binding.root)
