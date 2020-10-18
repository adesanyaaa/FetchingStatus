package com.adesoftware.fetchingstatus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.OrientationHelper
import com.adesoftware.fetchingstatus.adapter.FetchingAdapter
import com.adesoftware.fetchingstatus.model.FetchingData
import com.adesoftware.fetchingstatus.model.Sites
import com.adesoftware.fetchingstatus.repository.Repository
import com.adesoftware.fetchingstatus.viewmodel.FetchingViewModel
import com.adesoftware.fetchingstatus.viewmodel.FetchingViewModelFactory
import kotlinx.android.synthetic.main.activity_fetching_status.*

class FetchingStatusActivity : AppCompatActivity() {

    private lateinit var viewModel: FetchingViewModel
    private val myAdapter by lazy { FetchingAdapter() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fetching_status)
        setUpRecyclerView()

        //setup recyclerview
        recycler_fetch.layoutManager = LinearLayoutManager(this)
        recycler_fetch.addItemDecoration(DividerItemDecoration(this, OrientationHelper.VERTICAL))
        recycler_fetch.adapter = myAdapter

        val repository = Repository()
        val viewModelFactory = FetchingViewModelFactory(repository)
        viewModel = ViewModelProvider(this, viewModelFactory).get(FetchingViewModel::class.java)
        viewModel.getCustomPosts("https", 599, 7.0, "alert")

        viewModel.myCustomPosts.observe(this, Observer { response ->
            if (response.isSuccessful) {
                response.body()?.let {myAdapter.setData(it)}
            } else {
                Toast.makeText(this, response.code(), Toast.LENGTH_SHORT).show()
            }
        })
    }

    private fun setUpRecyclerView() {
        recycler_fetch.adapter = myAdapter
        recycler_fetch.layoutManager = LinearLayoutManager(this)
    }
}
