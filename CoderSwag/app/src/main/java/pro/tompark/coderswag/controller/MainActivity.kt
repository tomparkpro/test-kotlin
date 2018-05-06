package pro.tompark.coderswag.controller

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import pro.tompark.coderswag.R
import pro.tompark.coderswag.adapters.CategoryAdapter
import pro.tompark.coderswag.services.DataService

class MainActivity : AppCompatActivity() {

    lateinit var adapter: CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryAdapter(this, DataService.categories)

        catetoryListView.adapter = adapter
    }
}
