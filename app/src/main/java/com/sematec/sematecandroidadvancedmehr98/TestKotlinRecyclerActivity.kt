package com.sematec.sematecandroidadvancedmehr98

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_test_kotlin_recycler.*

class TestKotlinRecyclerActivity : AppCompatActivity() {


    fun something(name: String) {
        Toast.makeText(this, name, Toast.LENGTH_LONG).show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_kotlin_recycler)


        val number: Int = 20

        val lambdaFunction: (String) -> Unit = {
            showToast(it)
        }


        TestLambdaClass().checkNames()

        val list = ArrayList<String>()
        list.add("Ali")
        list.add("Ali")
        list.add("Ali")
        list.add("Ali")
        list.add("Ali")
        list.add("Ali")

        recycler.adapter = TestKotlinRecyclerAdapter(list, lambdaFunction)
        recycler.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
    }

    private fun showToast(name: String) {
        Toast.makeText(this, name, Toast.LENGTH_LONG).show()
    }
}
