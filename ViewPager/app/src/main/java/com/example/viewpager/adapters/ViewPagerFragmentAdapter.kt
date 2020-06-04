package com.example.viewpager.adapters

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.viewpager.fargments.FirstFragment
import com.example.viewpager.fargments.SecondFragment
import com.example.viewpager.fargments.ThirdFragment


class ViewPagerFragmentAdapter(activity: AppCompatActivity) : FragmentStateAdapter(activity) {

    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> FirstFragment()
            1 -> SecondFragment().apply {
                arguments = Bundle().apply {
                    putString("STRING", "123TEXT")
                }
            }
            2 -> ThirdFragment()
            else -> FirstFragment()
        }
    }

}