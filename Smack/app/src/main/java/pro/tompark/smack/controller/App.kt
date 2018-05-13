package pro.tompark.smack.controller

import android.app.Application
import pro.tompark.smack.utilities.SharedPrefs

/**
 * Created by TomPark on 2018. 5. 14.
 *
 * @author tom.hyunung.park@gmail.com
 * github : http://github.com/tomparkpro
 *
 */
class App : Application() {

    companion object {
        lateinit var prefs: SharedPrefs
    }

    override fun onCreate() {
        prefs = SharedPrefs(applicationContext)
        super.onCreate()
    }
}