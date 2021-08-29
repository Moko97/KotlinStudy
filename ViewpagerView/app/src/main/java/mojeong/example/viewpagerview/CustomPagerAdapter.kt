package mojeong.example.viewpagerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import mojeong.example.viewpagerview.databinding.ItemmViewpagerBinding

class CustomPagerAdapter: RecyclerView.Adapter<Holder>() {
    var textList = listOf<String>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val binding = ItemmViewpagerBinding.inflate(LayoutInflater.from(parent.context),
                                    parent,false)
        return Holder(binding)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        val text = textList[position]
        holder.setText(text)
    }

    override fun getItemCount(): Int {
        return textList.size
    }
}

class Holder(val binding: ItemmViewpagerBinding): RecyclerView.ViewHolder(binding.root) {
    fun setText(text:String) {
        binding.textView.text = text
    }
}