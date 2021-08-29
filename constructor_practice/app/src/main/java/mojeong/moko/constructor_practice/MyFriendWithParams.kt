package mojeong.moko.constructor_practice

import android.util.Log

class MyFriendWithParams(var name: String?, var age: Int?, var isMarried: Boolean?, var nickname: String?) {
    val TAG: String = "로그"
    var address: String = ""

    init {
        Log.d(TAG, "MyFriendWithParams - init() called")
        this.name = "할아범"
        this.age = 100
        this.isMarried = true
        this.nickname = "꼰대"
    }

    constructor(name: String?, age: Int?, isMarried: Boolean?, nickname: String?, address: String):
                                                                this(name, age, isMarried, nickname){
                                                                    this.address = address
                                                                }
}