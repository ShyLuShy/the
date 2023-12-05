package ru.mggtk.fourinrow

import android.animation.ObjectAnimator
import android.animation.ValueAnimator.INFINITE
import android.animation.ValueAnimator.REVERSE
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.Animatable
import android.graphics.drawable.Drawable
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.animation.AccelerateDecelerateInterpolator
import android.view.animation.LinearInterpolator
import android.widget.ImageView
import androidx.core.content.ContextCompat

class SplashActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        val SPLASH_DISPLAY_LENGTH = 2000L
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            window.statusBarColor = ContextCompat.getColor(this, R.color.white)
        }

        val animation: ImageView = findViewById(R.id.imageView)
        val drawable = animation.getDrawable();

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

        ObjectAnimator.ofFloat(animation,View.ROTATION_Y,90f,0f).apply{
            duration = 1500
            interpolator= AccelerateDecelerateInterpolator()


            start()
        }



    }
}




