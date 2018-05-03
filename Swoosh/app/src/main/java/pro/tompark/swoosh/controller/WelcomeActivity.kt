package pro.tompark.swoosh.controller

import android.content.Intent
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_welcome.*
import pro.tompark.swoosh.R

class WelcomeActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        getStartedBtn.setOnClickListener {
            val leagueIntent = Intent(this, LeagueActivity::class.java)
            startActivity(leagueIntent)
        }
    }
}
