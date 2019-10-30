package com.sematec.sematecandroidadvancedmehr98.mvp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.sematec.sematecandroidadvancedmehr98.R
import kotlinx.android.synthetic.main.recycler_item.view.*

class TestMVPRecyclerAdapter(private val list: List<String>, val activityFunction: (String) -> Unit) :
    RecyclerView.Adapter<TestMVPRecyclerAdapter.TestKotlinRecyclerViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): TestKotlinRecyclerViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.recycler_item, parent, false)
        return TestKotlinRecyclerViewHolder(v, activityFunction)
    }

    override fun getItemCount() = list.size

    override fun onBindViewHolder(holder: TestKotlinRecyclerViewHolder, position: Int) {
        holder.bind(list[position])
    }

    class TestKotlinRecyclerViewHolder(itemView: View, val activityFunction: (String) -> Unit) :
        RecyclerView.ViewHolder(itemView) {
        fun bind(s: String) {
            itemView.text1.text = s
            itemView.setOnClickListener { activityFunction(s) }
        }
    }
}