package pro.tompark.coderswag.controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.product_list_item.*
import pro.tompark.coderswag.R
import pro.tompark.coderswag.model.Product
import pro.tompark.coderswag.utilities.EXTRA_PRODUCT

class ProductDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_detail)

        val product = intent.getParcelableExtra<Product>(EXTRA_PRODUCT)
        println(product.title)
        val identifier = resources.getIdentifier(product.image, "drawable", packageName)
        productImage?.setImageResource(identifier)
        productName?.text = product.title
        productPrice?.text = product.price
    }
}
