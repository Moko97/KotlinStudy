package mojeong.example.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setFragment()
    }

    private fun setFragment() {
       val listFragment: ListFragment = ListFragment()

       var bundle = Bundle()
       bundle.putString("key1", "List Fragment")
       bundle.putInt("key2", 20210101)
        listFragment.arguments = bundle

       val transaction = supportFragmentManager.beginTransaction()
       transaction.add(R.id.frameLayout, listFragment)
       transaction.commit()
    }

    fun goDetail() {
        val detailFragment = DetailFragment()
        val transaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.frameLayout, detailFragment)
        transaction.addToBackStack("detail")
        transaction.commit()
    }

    fun goBack() {
        onBackPressed()
    }
}