package pro.tompark.coderswag.controller

import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_product.*
import pro.tompark.coderswag.R
import pro.tompark.coderswag.adapters.ProductsAdapter
import pro.tompark.coderswag.services.DataService
import pro.tompark.coderswag.utilities.EXTRA_CATEGORY
import pro.tompark.coderswag.utilities.EXTRA_PRODUCT

class ProductActivity : AppCompatActivity() {

    lateinit var adapter: ProductsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
        adapter = ProductsAdapter(this, DataService.getProducts(categoryType)) { product ->
            val intent = Intent(this, ProductDetailActivity::class.java)
            intent.putExtra(EXTRA_PRODUCT, product)
            startActivity(intent)
        }

        var spanCount = 2
        val orientation = resources.configuration.orientation
        if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
            spanCount = 3
        }

        val screenSize = resources.configuration.screenWidthDp
        if (screenSize > 720) {
            spanCount += 1
        }

        val layoutManager = GridLayoutManager(this, spanCount)

        productListView.adapter = adapter
        productListView.layoutManager = layoutManager
    }
}
