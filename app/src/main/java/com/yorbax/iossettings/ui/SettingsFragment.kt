package com.yorbax.iossettings.ui

import android.annotation.SuppressLint
import android.content.Context
import android.content.Context.VIBRATOR_SERVICE
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.yorbax.iossettings.R
import com.yorbax.iossettings.base.BaseFragment
import com.yorbax.iossettings.databinding.FragmentSettingsBinding
import jp.wasabeef.blurry.Blurry
import android.graphics.BitmapFactory

import android.graphics.Bitmap
import android.graphics.Color
import android.os.Build
import android.util.Log
import android.view.*
import android.view.MotionEvent.ACTION_DOWN
import androidx.core.view.ViewCompat
import androidx.navigation.fragment.FragmentNavigatorExtras
import androidx.navigation.fragment.findNavController
import nl.bryanderidder.themedtogglebuttongroup.ThemedButton
import androidx.core.content.ContextCompat.getSystemService

import android.os.Vibrator
import android.os.VibratorManager
import androidx.core.content.ContextCompat
import android.os.VibrationEffect
import com.yorbax.iossettings.utils.vibratePhone


class SettingsFragment : BaseFragment<FragmentSettingsBinding>(), View.OnClickListener {
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

        binding.tglBltoth.setOnSelectListener {
            onClick(null)
        }
        binding.tglWifi.setOnSelectListener {
            onClick(null)
        }
        binding.tglWifiTet.setOnSelectListener {
            onClick(null)
        }
        binding.tglPlane.setOnSelectListener {
            onClick(null)
        }
        binding.tglFocus.setOnSelectListener {
            onClick(null)
        }
        binding.btnCalculator.setOnClickListener(this)
        binding.btnCam.setOnClickListener(this)
        binding.btnForward.setOnClickListener(this)
        binding.btnLockRotation.setOnClickListener(this)
        binding.btnPlay.setOnClickListener(this)
        binding.btnRecord.setOnClickListener(this)
        binding.btnRewind.setOnClickListener(this)
        binding.btnScreen.setOnClickListener(this)
        binding.btnTorch.setOnClickListener(this)
    }

    override fun getViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): FragmentSettingsBinding = FragmentSettingsBinding.inflate(inflater, container, false)

    override fun onClick(v: View?) {
        vibratePhone()
    }

}

private const val TAG = "SettingsFragment"