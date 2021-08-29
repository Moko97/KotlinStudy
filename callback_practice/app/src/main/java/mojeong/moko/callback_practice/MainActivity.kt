package mojeong.moko.callback_practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log

class MainActivity : AppCompatActivity() {

    val TAG: String = "로그"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG, "MainActivity - onCreate() called")

        someCallBackMethod(completion = {
            Log.d(TAG, "MainActivity - 컴플레션 블록 호출됨 / it : $it")
        })

    }

    fun someCallBackMethod(completion: () -> Unit) {
        Log.d(TAG, "MainActivity - someCallBackMethod() called")

       Handler(Looper.getMainLooper()).postDelayed({

            completion("끝났다")

       }, 1000L)
    }
}