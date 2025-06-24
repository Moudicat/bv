package dev.aaa1115910.bv.mobile.activities

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        installSplashScreen()
        super.onCreate(savedInstanceState)
        val tvMainActivity = Intent().apply {
            setClassName(this@MainActivity, "dev.aaa1115910.bv.tv.activities.MainActivity")
        }
        startActivity(tvMainActivity)
        finish()
    }
}