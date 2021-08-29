package mojeong.moko.constructor_practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    val TAG: String = "로그"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG, "MainActivity - onCreate() called")

        var myFriend = MyFriend()

        Log.d(TAG, "MainActivity - myFriend.name : ${myFriend.name}")
        Log.d(TAG, "MainActivity - myFriend.age : ${myFriend.age}")
        Log.d(TAG, "MainActivity - myFriend.isMarried : ${myFriend.isMarried}")
        Log.d(TAG, "MainActivity - myFriend.nickname : ${myFriend.nickname}")

        var myFriendChulsoo = MyFriendWithParams(name = "철수", age = 17, isMarried = false, nickname = "안철수")

        Log.d(TAG, "MainActivity - myfriendChulsoo.name : ${myFriendChulsoo.name}")
        Log.d(TAG, "MainActivity - myfriendChulsoo.age : ${myFriendChulsoo.age}")
        Log.d(TAG, "MainActivity - myfriendChulsoo.isMarried : ${myFriendChulsoo.isMarried}")
        Log.d(TAG, "MainActivity - myfriendChulsoo.nickname : ${myFriendChulsoo.nickname}")

        var myFriendYoungsoo = MyFriendWithParams(name = "영수", age = 20, isMarried = false, nickname = "국영수", address = "대한민국")
        var myFriendSoosan = MyFriendWithParams(name = "영수", age = 20, isMarried = false, nickname = "국영수", address = "대한민국")

        var myFriendJames = MyFriendWithMoreParams(name = "제임스", age = 20, isMarried = true, nickname = "제임스본드")
        Log.d(TAG, "MainActivity - myFriendJames.name : ${myFriendJames.name}")
        Log.d(TAG, "MainActivity - myFriendJames.age : ${myFriendJames.age}")
        Log.d(TAG, "MainActivity - myFriendJames.isMarried : ${myFriendJames.isMarried}")
        Log.d(TAG, "MainActivity - myFriendJames.nickname : ${myFriendJames.nickname}")


        var myFriendJames1 = MyFriendWithMoreParams()
        Log.d(TAG, "MainActivity - myFriendJames.name : ${myFriendJames1.name}")


    }
}