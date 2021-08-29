package mojeong.moko.constructor_practice

import android.util.Log

class MyFriendWithMoreParams() {

    val TAG: String = "로그"

    var name: String? = null
    var age: Int? = null
    var isMarried: Boolean? = null
    var nickname: String? = null

    init {
        Log.d(TAG, "MyFriendWithMoreParams - init() called")
        this.name = "길동이"
    }


    constructor(name: String) : this() {
        Log.d(TAG, "MyFriendWithMoreParams - name 생성자() called")
        this.name = name
    }

    constructor(name: String, age: Int) : this() {
        Log.d(TAG, "MyFriendWithMoreParams - name 생성자() called")
        this.name = name
        this.age = age
    }

    constructor(name: String, age: Int, isMarried: Boolean) : this() {
        Log.d(TAG, "MyFriendWithMoreParams - name 생성자() called")
        this.name = name
        this.age = age
        this.isMarried = isMarried
    }

    constructor(name: String, age: Int, isMarried: Boolean, nickname: String) : this() {
        Log.d(TAG, "MyFriendWithMoreParams - name 생성자() called")
        this.name = name
        this.age = age
        this.isMarried = isMarried
        this.nickname = nickname
    }
}