package mojeong.moko.myrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.LinearLayout
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MyRecyclerviewInterface {

    val TAG: String = "로그"

    var modelList = ArrayList<MyModel>()

    private lateinit var myRecyclerAdapter: MyRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG, "MainActivity - onCreate() called")
        Log.d(TAG, "MainActivity - 반복 전 this.modelList.size : ${this.modelList.size}")

        for(i in 1..10) {
            var myModel = MyModel(name = "유정모 $i", profileImage = "https://ppak-coders.com/img/profile.png")
            this.modelList.add(myModel)
        }
        Log.d(TAG, "MainActivity - 반복 후 this.modelList.size : ${this.modelList.size}")

        myRecyclerAdapter = MyRecyclerAdapter(this)
        myRecyclerAdapter.submitList(this.modelList)
        my_recycler_view.apply {
            layoutManager = LinearLayoutManager(this@MainActivity, LinearLayoutManager.VERTICAL, false)

            adapter = myRecyclerAdapter
        }

    }

    override fun onItemClicked(position: Int) {
        Log.d(TAG, "MainActivity - onItemClicked() called / position : $position")

        var name: String? = null

        val title: String = this.modelList[position].name?: ""

        AlertDialog.Builder(this)
            .setTitle(title)
            .setMessage("$title 하이루 ")
            .setPositiveButton("ㅇㅋ") { dialog, id ->
                Log.d(TAG, "MainActivity - 다이얼로그 확인 버튼 클릭했다.")
            }
            .show()
    }
}