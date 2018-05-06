package pro.tompark.coderswag.controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import pro.tompark.coderswag.R
import pro.tompark.coderswag.utilities.EXTRA_CATEGORY

class ProductActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
        println(categoryType)
    }
}
