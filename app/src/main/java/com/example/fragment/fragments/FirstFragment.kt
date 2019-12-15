package com.example.fragment.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.fragment.R
import kotlinx.android.synthetic.main.fragment_first.*

class FirstFragment : Fragment(){

    //fragment_first.xml와 FirstFragment를 연결시킨다.
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //container에게 붙여준다. root에는 안붙인다.
        return inflater.inflate(R.layout.fragment_first, container, false)
    }



    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        confirmBtn.setOnClickListener {
            //나를 감싸고 있는 activity를 불러서 그 화면에 이 이벤트를 보여주기 위해
            Toast.makeText(activity, "${name.text.toString()} / ${nickname.text.toString()}", Toast.LENGTH_SHORT).show()
        }

    }

}