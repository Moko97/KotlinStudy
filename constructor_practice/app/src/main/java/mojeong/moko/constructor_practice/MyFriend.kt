package mojeong.moko.constructor_practice

import android.util.Log

class MyFriend {

    val TAG: String = "로그"

    var name: String? = null
    var age: Int? = null
    var isMarried: Boolean? = null
    var nickname: String? = null

    init {
        Log.d(TAG, "MyFriend - () init called")

        name = "홍길동"
        age = 20
        isMarried = false
        nickname = "아바이를 아바이라 부르지 못한 사내"
    }
}