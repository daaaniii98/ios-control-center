package com.yorbax.iossettings

import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.yorbax.iossettings.databinding.ActivityMainBinding
import jp.wasabeef.blurry.Blurry

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bitmap = BitmapFactory.decodeResource(resources, R.drawable.ios_home)
        Blurry.with(this).radius(200).from(bitmap).into(binding.bgImg)
    }
}