package com.sematec.sematecandroidadvancedmehr98.features.mvp

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.sematec.sematecandroidadvancedmehr98.R
import kotlinx.android.synthetic.main.activity_test_mvp.*

class TestMVPActivity : AppCompatActivity(), MVPContract.View {

    override fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }

    private lateinit var adapter: TestMVPRecyclerAdapter
    private val list = ArrayList<String>()
    private lateinit var presenter : MVPContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_mvp)

        presenter = TestPresenter(this)

        setUpRecyclerView()
        presenter.getAllNames()


        btnSave.setOnClickListener {
            presenter.onSaveButtonClicked()
        }

    }

    override fun setUpRecyclerView() {
        adapter = TestMVPRecyclerAdapter(list) {
            // TODO : Fill this method
        }
        recycler.adapter = adapter
        recycler.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
    }


    override fun onNamesReceived(namesList: List<String>) {
        list.addAll(namesList)
        adapter.notifyDataSetChanged()
    }
}
