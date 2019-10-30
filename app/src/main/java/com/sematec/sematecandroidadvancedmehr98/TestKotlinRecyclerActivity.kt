package com.sematec.sematecandroidadvancedmehr98

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_test_kotlin_recycler.*

class TestKotlinRecyclerActivity : AppCompatActivity() {


    val myList = ArrayList<String>()
    lateinit var adapter: TestKotlinRecyclerAdapter

    fun something(name: String) {
        Toast.makeText(this, name, Toast.LENGTH_LONG).show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_kotlin_recycler)


        setUpRecyclerView()
        val number: Int = 20



        TestLambdaClass().checkNames()

        val list = ArrayList<String>()
        list.add("Ali")
        list.add("Ali")
        list.add("Ali")
        list.add("Ali")
        list.add("Ali")
        list.add("Ali")


        myList.addAll(list)
        adapter.notifyDataSetChanged()

    }

    private fun setUpRecyclerView() {
        val lambdaFunction: (String) -> Unit = {
            showToast(it)
        }
        adapter = TestKotlinRecyclerAdapter(myList, lambdaFunction)
        recycler.adapter = adapter
        recycler.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
    }

    private fun showToast(name: String) {
        Toast.makeText(this, name, Toast.LENGTH_LONG).show()
    }
}
