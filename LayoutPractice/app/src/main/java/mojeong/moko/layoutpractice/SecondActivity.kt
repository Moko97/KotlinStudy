package mojeong.moko.layoutpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

class SecondActivity : AppCompatActivity() {

    val TAG: String = "로그"
     
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
    }

    fun onBackButtonClicked(view:View) {
        Log.d(TAG, "SecondActivity - onBackButtonClicked() called")
        finish()
    }
}