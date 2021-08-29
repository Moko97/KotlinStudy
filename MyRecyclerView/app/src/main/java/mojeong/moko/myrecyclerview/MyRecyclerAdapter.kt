package mojeong.moko.myrecyclerview

import android.content.ContentValues.TAG
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class MyRecyclerAdapter(myRecyclerviewInterface: MyRecyclerviewInterface): RecyclerView.Adapter<MyViewHolder>() {

    val TAG: String = "로그"

    private var modelList = ArrayList<MyModel>()

    private var myRecyclerviewInterface: MyRecyclerviewInterface? = null

    init {
        this.myRecyclerviewInterface = myRecyclerviewInterface
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return  MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.layout_recycler_item,
                                parent, false), this.myRecyclerviewInterface!!)
    }

    override fun getItemCount(): Int {
        return this.modelList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        Log.d(TAG, "MyRecyclerAdapter - onBindViewHolder() called / position : $position")
        holder.bind(this.modelList[position])
    }

    fun submitList(modelList: ArrayList<MyModel>) {
        this.modelList = modelList
    }

}