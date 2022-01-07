package com.yorbax.iossettings.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding

/**
 * Base-class to hold common methods for fragments
 */
abstract class BaseFragment <VB:ViewBinding>: Fragment() {
    lateinit var binding:VB
    abstract fun myInit()
    abstract fun listeners()
    abstract fun getViewBinding(inflater: LayoutInflater,
                                container: ViewGroup?,
                                savedInstanceState: Bundle?):VB
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = getViewBinding(inflater, container, savedInstanceState)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        myInit()
        listeners()
    }
}