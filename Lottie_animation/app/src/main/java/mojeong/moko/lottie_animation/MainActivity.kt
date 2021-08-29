package mojeong.moko.lottie_animation

import android.animation.ValueAnimator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    
    val TAG: String = "로그"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        likebtn.setOnClickListener {

            Log.d(TAG, "MainActivity - onCreate() / 좋아요 버튼이 클릭되었다.")

            val animator = ValueAnimator.ofFloat(0f, 0.5f).setDuration(1000)
            animator.addUpdateListener {
             likebtn.setProgress(
                 animation.getAnimatedValue() as Float
             )
        }

    }
}