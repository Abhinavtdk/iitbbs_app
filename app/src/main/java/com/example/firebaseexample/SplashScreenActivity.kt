package com.example.firebaseexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView

class SplashScreenActivity : AppCompatActivity() {

    lateinit var topAnim : Animation
    lateinit var bottomAnim : Animation
    lateinit var appCompatImageView: ImageView
    lateinit var appText : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN) //Hide status bar
        setContentView(R.layout.activity_splash_screen)

        topAnim = AnimationUtils.loadAnimation(this,R.anim.top_animation)
        bottomAnim = AnimationUtils.loadAnimation(this,R.anim.bottom_animation)

        appCompatImageView = findViewById<ImageView>(R.id.appCompatImageView)
        appText = findViewById<TextView>(R.id.app_name)
        appCompatImageView.startAnimation(topAnim)
        appText.startAnimation(bottomAnim)

        Handler().postDelayed({
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()
        },4000)
    }
}