package mojeong.moko.mycustomdialog_tutorial

import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.custom_dialog.*

class MyCustomDialog(context: Context, myCustomDialogInterface: MyCustomDialogInterface): Dialog(context) {

    val TAG: String = "로그"

    private var myCustomDialogInterface: MyCustomDialogInterface? = null

    init {
        this.myCustomDialogInterface = myCustomDialogInterface
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.custom_dialog)
        Log.d(TAG, "MyCustomDialog - onCreate() called")

        window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

        like_btn.setOnClickListener {
            Log.d(TAG, "MyCustomDialog - 좋아요 버튼 클릭")
            this.myCustomDialogInterface?.onLikeBtnClicked()
        }

        subscribe_btn.setOnClickListener {
            Log.d(TAG, "MyCustomDialog - 구독 버튼 클릭")
            this.myCustomDialogInterface?.onSubscribeBtnClicked()
        }

    }
}