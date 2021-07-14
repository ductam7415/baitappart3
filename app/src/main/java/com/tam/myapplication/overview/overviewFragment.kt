package com.tam.myapplication.overview

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.tam.myapplication.R
import com.tam.myapplication.databinding.FragmentOverview2Binding

class overviewFragment {
    fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_overview2, container, false)
    }
}

