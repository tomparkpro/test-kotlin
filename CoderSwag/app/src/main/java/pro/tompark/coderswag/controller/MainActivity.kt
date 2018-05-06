package pro.tompark.coderswag.controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*
import pro.tompark.coderswag.R
import pro.tompark.coderswag.model.Category
import pro.tompark.coderswag.services.DataService

class MainActivity : AppCompatActivity() {

    lateinit var adapter: ArrayAdapter<Category>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, DataService.categories)

        catetoryListView.adapter = adapter
    }
}
