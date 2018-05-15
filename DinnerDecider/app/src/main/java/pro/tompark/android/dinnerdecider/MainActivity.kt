package pro.tompark.android.dinnerdecider

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    var foodList = arrayListOf("Chinese", "Hamburger", "Pizza", "McDonalds", "Barros Pizza")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        selectedFoodTxt.text = "Burger King"

        decideBtn.setOnClickListener {
            var random = Random()
            var randomFood = random.nextInt(foodList.count())
            selectedFoodTxt.text = foodList[randomFood ]
        }

        addFoodBtn.setOnClickListener {
            var newFood = addFoodTxt.text.toString()
            foodList.add(newFood)
            addFoodTxt.text.clear()
            println(foodList)
        }
    }
}
