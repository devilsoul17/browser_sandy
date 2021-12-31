package com.santhosh.browser_

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.santhosh.browser_.bookmarks
import kotlinx.android.synthetic.main.fragment_third.*
import kotlinx.android.synthetic.main.fragment_third.view.*

class thirdFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
//        view.bookmarks.setOnClickListner(view.OnClickListener)
        // Inflate the layout for this fragment
//        bookmarks.setOnClickListener {  }
        val view = inflater.inflate(R.layout.fragment_third, container, false)
        view.bookmarks.setOnClickListener {
            val intent = Intent (activity, bookmarks::class.java)
            startActivity(intent)
        }
        return view.rootView
    }
}