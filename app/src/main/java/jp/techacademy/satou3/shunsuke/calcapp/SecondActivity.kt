package jp.techacademy.satou3.shunsuke.calcapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val ans = intent.getDoubleExtra("ans", 0.0)
        textView.text ="ans".toString()

    }
}
