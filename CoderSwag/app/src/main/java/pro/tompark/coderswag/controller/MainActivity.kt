package pro.tompark.coderswag.controller

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import pro.tompark.coderswag.R
import pro.tompark.coderswag.adapters.CategoryRecycleAdapter
import pro.tompark.coderswag.services.DataService

class MainActivity : AppCompatActivity() {

    lateinit var adapter: CategoryRecycleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryRecycleAdapter(this, DataService.categories)
        catetoryListView.adapter = adapter

        val layoutManager = LinearLayoutManager(this)
        catetoryListView.layoutManager = layoutManager
        catetoryListView.setHasFixedSize(true)

//        catetoryListView.setOnItemClickListener { parent, view, position, id ->
//            val category = DataService.categories[position]
//            Toast.makeText(this, "You clicked on the ${category.title} cell", Toast.LENGTH_SHORT).show()
//        }
    }
}
