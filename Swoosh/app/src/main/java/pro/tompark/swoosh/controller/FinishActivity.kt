package pro.tompark.swoosh.controller

import android.os.Bundle
import kotlinx.android.synthetic.main.activity_finish.*
import pro.tompark.swoosh.R
import pro.tompark.swoosh.model.Player
import pro.tompark.swoosh.utilities.EXTRA_PLAYER

class FinishActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)

        searchLeaguesText.text = "Looking for ${player.league} ${player.skill} league near you..."
    }
}
