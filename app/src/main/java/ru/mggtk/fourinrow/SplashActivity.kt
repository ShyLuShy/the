package ru.mggtk.fourinrow

import android.animation.ObjectAnimator
import android.content.Intent
import android.graphics.drawable.Animatable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.animation.LinearInterpolator
import android.widget.ImageView

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val SPLASH_DISPLAY_LENGTH = 1000L
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val animation: ImageView = findViewById(R.id.imageView)
        val drawable = animation.drawable

        //Проверка на наличие анимации
        if (drawable is Animatable) {
            drawable.start()
            /*Запуск основной activity, после опредленного времени, время регулируется константой
            SPLASH_DISPLAY_LENGTH, значение в миллисекундах
             */
            Handler().postDelayed({
                val intent = Intent(this@SplashActivity, MainActivity::class.java)
                startActivity(intent)
                finish()
            }, SPLASH_DISPLAY_LENGTH)
        }
        Handler().postDelayed({
            val intent = Intent(this@SplashActivity, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, SPLASH_DISPLAY_LENGTH)


        ObjectAnimator.ofFloat(animation, View.ROTATION_Y,0f,360f).apply{
            duration = 1000
            interpolator = LinearInterpolator()
            repeatCount = 1
            start()
        }
    }
}