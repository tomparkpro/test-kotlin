package pro.tompark.smack.services

import android.graphics.Color
import pro.tompark.smack.controller.App
import java.util.*

/**
 * Created by TomPark on 2018. 5. 11.
 *
 * @author tom.hyunung.park@gmail.com
 * github : http://github.com/tomparkpro
 *
 */
object UserDataService {

    var id = ""
    var avatarColor = ""
    var avatarName = ""
    var email = ""
    var name = ""

    fun logout() {
        id = ""
        avatarColor = ""
        avatarName = ""
        email = ""
        name = ""
        App.prefs.authToken = ""
        App.prefs.userEmail = ""
        App.prefs.isLoggedIn = false
        MessageService.clearChannel()
        MessageService.clearMessage()
    }

    fun returnAvatarColor(components: String) : Int {
        // [0.26666666666666666, 0.7215686274509804, 0.4, 1]
        // 0.26666666666666666 0.7215686274509804 0.4 1

        val strippedColor = components
                .replace("[", "")
                .replace("]", "")
                .replace(",", "")

        var r = 0
        var g = 0
        var b = 0

        val scanner = Scanner(strippedColor)
        if (scanner.hasNext()) {
            r = (scanner.nextDouble() * 255).toInt()
            g = (scanner.nextDouble() * 255).toInt()
            b = (scanner.nextDouble() * 255).toInt()
        }

        return Color.rgb(r, g, b)
    }

}