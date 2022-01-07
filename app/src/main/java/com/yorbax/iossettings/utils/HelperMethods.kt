package com.yorbax.iossettings.utils

import android.content.Context
import android.os.*
import androidx.fragment.app.Fragment

fun Fragment.vibratePhone() {
    val vib  = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
        val vibratorManager =  this.requireContext().getSystemService(Context.VIBRATOR_MANAGER_SERVICE) as VibratorManager
        vibratorManager.defaultVibrator;
    } else {
        this.requireContext().getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
    }
    val DELAY = 0
    val VIBRATE = 100
    val SLEEP = 100
    val START = 0
    val vibratePattern = longArrayOf(DELAY.toLong(), VIBRATE.toLong(), SLEEP.toLong())

    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
        vib.vibrate(VibrationEffect.createWaveform(vibratePattern, START))
        Handler(Looper.getMainLooper()).postDelayed({
            vib.cancel()
        },100)
    } else {
        // backward compatibility for Android API < 26
        vib.vibrate(vibratePattern, START)
    }

}