package com.yorbax.iossettings.ui

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.yorbax.iossettings.R
import com.yorbax.iossettings.base.BaseFragment
import com.yorbax.iossettings.databinding.FragmentSettingsBinding
import jp.wasabeef.blurry.Blurry
import android.graphics.BitmapFactory

import android.graphics.Bitmap
import android.graphics.Color
import android.os.Build
import android.util.Log
import android.view.MotionEvent
import android.view.MotionEvent.ACTION_DOWN
import androidx.core.view.ViewCompat
import androidx.navigation.fragment.FragmentNavigatorExtras
import androidx.navigation.fragment.findNavController


class SettingsFragment : BaseFragment<FragmentSettingsBinding>() {
    override fun myInit() {
    }

    override fun listeners() {
        binding.panelConnectivity.setOnClickListener {
            val transitionExtras = FragmentNavigatorExtras(
                binding.panelConnectivity to "panel",
                binding.tglPlane to "airplane",
                binding.tglWifiTet to "wifi_tet",
                binding.tglWifi to "wifi",
                binding.tglBltoth to "bluetooth"
            )
            findNavController().navigate(
                R.id.action_settingsFragment_to_connectivitySectionFragment,
                null,
                null,
                transitionExtras
            )
        }
    }

    override fun getViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): FragmentSettingsBinding = FragmentSettingsBinding.inflate(inflater, container, false)

}

private const val TAG = "SettingsFragment"