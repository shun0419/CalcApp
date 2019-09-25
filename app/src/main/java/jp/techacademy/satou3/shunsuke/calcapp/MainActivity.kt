package jp.techacademy.satou3.shunsuke.calcapp


import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent
import android.support.design.widget.Snackbar


class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)

    }

    override fun onClick(v: View?) {

        var ans = 0.0

        try {
            var num1 = editText1.text.toString().toDouble()
            var num2 = editText2.text.toString().toDouble()


            when(v!!.id){
                R.id.button1 -> ans = num1+num2
                R.id.button2 -> ans = num1-num2
                R.id.button3 -> ans = num1*num2
                R.id.button4 -> ans = num1/num2
            }
        }catch (e:Exception){
            Snackbar.make(v!!, "正しい数値を入力してください", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()

        }


        val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("ans", ans.toString())
            startActivity(intent)

    }
}