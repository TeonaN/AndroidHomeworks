package com.example.viewpager.fargments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.viewpager.R
import kotlinx.android.synthetic.main.second_fragment.*



class SecondFragment : Fragment(R.layout.second_fragment) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        arguments?.takeIf {
            it.containsKey("STRING")
        }?.apply { textView2.text = getString("STRING") }

    }

}