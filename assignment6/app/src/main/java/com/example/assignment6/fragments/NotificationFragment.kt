package com.example.assignment6.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.assignment6.R
import kotlinx.android.synthetic.main.fragment_notification.view.*

class NotificationFragment : Fragment(R.layout.fragment_notification) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.textView2.text = NotificationFragmentArgs.fromBundle(requireArguments()).amount.toString()

    }

}