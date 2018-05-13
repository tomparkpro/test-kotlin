package pro.tompark.smack.utilities

/**
 * Created by TomPark on 2018. 5. 10.
 *
 * @author tom.hyunung.park@gmail.com
 * github : http://github.com/tomparkpro
 *
 */
const val BASE_URL = "https://tomparkchat.herokuapp.com/v1/"
//const val BASE_URL = "http://10.0.2.2:3005/v1/"
const val SOCKET_URL = "https://tomparkchat.herokuapp.com/"
const val URL_REGISTER = "${BASE_URL}account/register"
const val URL_LOGIN = "${BASE_URL}account/login"
const val URL_CREATE_USER = "${BASE_URL}user/add"
const val URL_GET_USER = "${BASE_URL}user/byEmail/"
const val URL_GET_CHANNELS = "${BASE_URL}channel"

// Broadcast Constant
const val BROADCAST_USER_DATA_CHANGE = "BROADCAST_USER_DATA_CHANGE"