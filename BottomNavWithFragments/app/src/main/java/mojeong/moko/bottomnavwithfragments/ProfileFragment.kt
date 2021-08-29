package mojeong.moko.bottomnavwithfragments

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class ProfileFragment: Fragment() {

    companion object {
        const val TAG: String = "로그"

        fun newInstance() : ProfileFragment {
            return ProfileFragment()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "ProfileFragment - onCreate() called")
    }

    // 프래그먼트를 안고 있는 액티비티에 붙었을 때
    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d(TAG, "ProfileFragment - onAttach() called")
    }

    // 뷰가 생성되었을 때 화면과 연결 
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        Log.d(TAG, "ProfileFragment - onCreateView() called")

        return inflater.inflate(R.layout.fragment_profile, container, false)
    }

}