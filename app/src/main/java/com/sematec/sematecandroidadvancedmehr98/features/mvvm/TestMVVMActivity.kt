package com.sematec.sematecandroidadvancedmehr98.features.mvvm

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.sematec.sematecandroidadvancedmehr98.ClickInterface
import com.sematec.sematecandroidadvancedmehr98.R
import com.sematec.sematecandroidadvancedmehr98.TestAdapter
import kotlinx.android.synthetic.main.activity_test.*

class TestMVVMActivity : AppCompatActivity() {

    private lateinit var viewModel: TestViewModel
    private lateinit var adapter: TestAdapter
    private val list = arrayListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_mvvm)

        setUpRecyclerView()

        viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory()).get(TestViewModel::class.java)

        viewModel.getLiveData().observe(this, Observer {
            list.clear()
            list.addAll(it)
            adapter.notifyDataSetChanged()
        })


        imgSearch.setOnClickListener {
            val name = edtName.text.toString()
            viewModel.onNameAdded(name)
            edtName.setText("")
        }


    }

    private fun setUpRecyclerView() {
        adapter = TestAdapter(list, ClickInterface {
            Toast.makeText(this, it, Toast.LENGTH_LONG).show()
        })

        recycler.adapter = adapter
        recycler.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)

    }
}
