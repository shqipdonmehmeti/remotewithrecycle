package com.cacttuseducation.remotedatashowinginrecycleview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.cacttuseducation.remotedatashowinginrecycleview.R
import com.cacttuseducation.remotedatashowinginrecycleview.model.User

class UserAdapter(private val list : List<User>) : RecyclerView.Adapter<UserAdapter.UserViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.user_item,parent,false)
        return UserViewHolder(view)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        val user = list[position]
        holder.tvId.text = user.id.toString()
        holder.tvFirstName.text = user.firstName
        holder.tvLastName.text = user.lastName
        holder.tvAge.text = user.age.toString()
        holder.tvAddress.text = user.address.address.plus(user.address.city).plus(user.address.postalCode)

        holder.itemView.setOnClickListener {
            onItemClickListener?.invoke(user)
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }

    class UserViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {

        val tvId : TextView = itemView.findViewById(R.id.tvId)
        val tvFirstName : TextView = itemView.findViewById(R.id.tvFirstName)
        val tvLastName : TextView = itemView.findViewById(R.id.tvLastName)
        val tvAge : TextView = itemView.findViewById(R.id.tvAge)
        val tvAddress : TextView = itemView.findViewById(R.id.tvAddress)

    }

    private var onItemClickListener : ((User) -> Unit)? = null

    fun setOnItemClickListener(listener : (User) -> Unit) {
        onItemClickListener = listener
    }






}