package pro.tompark.coderswag.controller

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import pro.tompark.coderswag.R
import pro.tompark.coderswag.adapters.CategoryRecycleAdapter
import pro.tompark.coderswag.services.DataService
import pro.tompark.coderswag.utilities.EXTRA_CATEGORY

class MainActivity : AppCompatActivity() {

    lateinit var adapter: CategoryRecycleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryRecycleAdapter(this, DataService.categories) { category ->
            val productIntent = Intent(this, ProductActivity::class.java)
            productIntent.putExtra(EXTRA_CATEGORY, category.title)
            startActivity(productIntent)
        }
        catetoryListView.adapter = adapter

        val layoutManager = LinearLayoutManager(this)
        catetoryListView.layoutManager = layoutManager
        catetoryListView.setHasFixedSize(true)


    }
}
