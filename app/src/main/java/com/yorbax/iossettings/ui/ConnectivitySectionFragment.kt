package com.yorbax.iossettings.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.ViewCompat
import androidx.transition.TransitionInflater
import com.yorbax.iossettings.R
import com.yorbax.iossettings.base.BaseFragment
import com.yorbax.iossettings.databinding.FragmentConnectivitySectionBinding

class ConnectivitySectionFragment : BaseFragment<FragmentConnectivitySectionBinding>() {
    override fun myInit() {
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        sharedElementEnterTransition = TransitionInflater.from(requireContext())
            .inflateTransition(android.R.transition.move)
    }


    override fun listeners() {
    }

    override fun getViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): FragmentConnectivitySectionBinding = FragmentConnectivitySectionBinding.inflate(inflater,container,false)

}