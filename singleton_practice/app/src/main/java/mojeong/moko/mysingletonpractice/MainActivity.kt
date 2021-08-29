package mojeong.moko.mysingletonpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    val TAG: String = "로그"
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "MainActivity - onCreate() called")

        val myNormalClass_1 = MyNormalClass()
        
        val myNormalClass_2 = MyNormalClass()

        Log.d(TAG, "MainActivity - myNormalClass_1 : $myNormalClass_1")

        Log.d(TAG, "MainActivity - myNormalClass_2 : $myNormalClass_2")

        val mySingletonClass_1 = MySingletonClass
        
        val mySingletonClass_2 = MySingletonClass

        Log.d(TAG, "MainActivity - mySingletonClass_1 : $mySingletonClass_1")

        Log.d(TAG, "MainActivity - mySingletonClass_2 : $mySingletonClass_2")

        val mySQLOpenHelperSingleton_1 = MySQLOpenHelperSingleton.getInstance(this)

        val mySQLOpenHelperSingleton_2 = MySQLOpenHelperSingleton.getInstance(this)

        Log.d(TAG, "MainActivity - mySQLOpenHelperSingleton_1 : $mySQLOpenHelperSingleton_1")

        Log.d(TAG, "MainActivity - mySQLOpenHelperSingleton_2 : $mySQLOpenHelperSingleton_2")



    }
}