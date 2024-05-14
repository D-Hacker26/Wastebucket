package com.example.wastebusks

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.airbnb.lottie.LottieAnimationView

class SplashScreen : AppCompatActivity() {

    private lateinit var appName: TextView
    private lateinit var lottie: LottieAnimationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        appName = findViewById(R.id.AppName)
        lottie = findViewById(R.id.lottie)

        appName.animate().translationY(-1400f).setDuration(2700).setStartDelay(0)
        lottie.animate().translationX(2000f).setDuration(2000).setStartDelay(2900)

        Handler().postDelayed({
            val i = Intent(applicationContext, SignInActivity::class.java)
            startActivity(i)
            finish()
        }, 3000)
    }
}
