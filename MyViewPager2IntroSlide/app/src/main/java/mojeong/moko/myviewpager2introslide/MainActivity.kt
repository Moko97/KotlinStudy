package mojeong.moko.myviewpager2introslide

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.viewpager2.widget.ViewPager2
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    companion object {
       const val TAG: String = "로그"
    }

    private var pageItemList = ArrayList<PageItem>()
    private lateinit var myIntroPagerRecyclerAdapter: MyIntroPagerRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG, "MainActivity - onCreate() called")

        previous_btn.setOnClickListener {
            Log.d(TAG, "MainActivity - 이전버튼 called")
            my_intro_view_pager.currentItem = my_intro_view_pager.currentItem - 1
        }

        next_btn.setOnClickListener {
            Log.d(TAG, "MainActivity - 다음버튼 called")
            my_intro_view_pager.currentItem = my_intro_view_pager.currentItem + 1
        }

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        actionBar?.hide()

        pageItemList.add(PageItem(R.color.colorOrange, R.drawable.ic_pager_item_1, "안녕하세요~\n" + "화이팅"))
        pageItemList.add(PageItem(R.color.colorBlue, R.drawable.ic_pager_item_2, "잘해봅시다!!"))
        pageItemList.add(PageItem(R.color.colorWhite, R.drawable.ic_pager_item_3, "잘부탁해요!!"))

        myIntroPagerRecyclerAdapter = MyIntroPagerRecyclerAdapter(pageItemList)

        my_intro_view_pager.apply {
            adapter = myIntroPagerRecyclerAdapter
            orientation = ViewPager2.ORIENTATION_HORIZONTAL
            dots_indicator.setViewPager2(this)
        }


    }
}