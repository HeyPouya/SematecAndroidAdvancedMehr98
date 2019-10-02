package com.sematec.sematecandroidadvancedmehr98

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.recycler_item.view.*

class TestKotlinRecyclerAdapter(val list: List<String>) :
    RecyclerView.Adapter<TestKotlinRecyclerAdapter.TestKotlinRecyclerViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TestKotlinRecyclerViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.recycler_item, parent, false)
        return TestKotlinRecyclerViewHolder(v)
    }

    override fun getItemCount() = list.size

    override fun onBindViewHolder(holder: TestKotlinRecyclerViewHolder, position: Int) {
        holder.bind(list[position])
    }

    class TestKotlinRecyclerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(s: String) {
            itemView.text1.text = s
        }
    }
}