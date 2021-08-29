package mojeong.moko.myapitutorial

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.core.os.HandlerCompat.postDelayed
import androidx.core.widget.addTextChangedListener
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.layout_button_search.*
import utils.Constants
import utils.Constants.TAG
import utils.SEARCH_TYPE
import utils.onMyTextChanged

class MainActivity : AppCompatActivity() {

    private var currentSearchType: SEARCH_TYPE = SEARCH_TYPE.PHOTO

    @SuppressLint("UseCompatLoadingForDrawables")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG, "MainActivity - onCreate() called")

        // 라디오그룹 가져오기
        search_term_radio_group.setOnCheckedChangeListener { _, checkedId ->
            when (checkedId) {
                R.id.photo_search_radio_btn -> {
                    Log.d(TAG, "사진검색 버튼 클릭!")
                    search_term_text_layout.hint = "사진 검색"
                    search_term_text_layout.startIconDrawable = resources.getDrawable(
                        R.drawable.ic_baseline_photo_library_24,
                        resources.newTheme()
                    )
                    this.currentSearchType = SEARCH_TYPE.PHOTO
                }
                R.id.user_search_radio_btn -> {
                    Log.d(TAG, "사용자검색 버튼 클릭!")
                    search_term_text_layout.hint = "사용자 검색"
                    search_term_text_layout.startIconDrawable = resources.getDrawable(
                        R.drawable.ic_baseline_person_24,
                        resources.newTheme()
                    )
                    this.currentSearchType = SEARCH_TYPE.USER
                }
            }
            Log.d(
                TAG,
                "MainActivity - onCheckedChanged() called / currentSearchType : $currentSearchType"
            )
        }
        search_term_edittext.onMyTextChanged {
            //입력된글자가 하나라도 있으면
            if(it.toString().count() > 0) {
                //검색버튼을 보인다
                frame_search_btn.visibility = View.VISIBLE
                // 스크롤뷰를 올린다
                main_scrollview.scrollTo(0,200)
                search_term_text_layout.helperText = " "
            } else {
                frame_search_btn.visibility = View.INVISIBLE
            }

            if(it.toString().count() == 12) {
                Toast.makeText(this, "검색어는 12글자까지만 입력가능", Toast.LENGTH_SHORT).show()
            }
        }
        // 버튼 클릭시
        btn_search.setOnClickListener {
            Log.d(TAG, "검색버튼 called / currentsearchtype : $currentSearchType")

            this.handleSearchButtonUi()
        }
    }

    private fun handleSearchButtonUi() {
        btn_progress.visibility = View.VISIBLE
        btn_search.text = ""
        Handler(Looper.getMainLooper()).postDelayed({
            btn_progress.visibility = View.INVISIBLE
            btn_search.text = "검색"
        }, 1500)
    }
}