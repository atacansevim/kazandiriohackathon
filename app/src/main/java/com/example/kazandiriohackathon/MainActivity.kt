package com.example.kazandiriohackathon

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.kazandriofeature.IEventEnd
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity(), IEventEnd {

    private var count_down = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        image1.setEventEnd(this@MainActivity)
        image2.setEventEnd(this@MainActivity)
        image3.setEventEnd(this@MainActivity)

        up.setOnClickListener {
            up.visibility = View.INVISIBLE
            down.visibility = View.VISIBLE
            image1.setValueRandom(Random.nextInt(6), Random.nextInt(15-5+1)+5)
            image2.setValueRandom(Random.nextInt(6), Random.nextInt(15-5+1)+5)
            image3.setValueRandom(Random.nextInt(6), Random.nextInt(15-5+1)+5)
        }

    }

    override fun eventEnd(result: Int, count: Int) {
        if (count_down < 2)
            count_down++ //if still have image is rolling
        else {
            up.visibility = View.VISIBLE
            down.visibility = View.INVISIBLE
            count_down = 0
            if (image1.value == image2.value && image2.value == image3.value) {
                Toast.makeText(this, "You win a BIG prize", Toast.LENGTH_LONG).show()
            } else if (image1.value == image2.value || image2.value == image3.value || image1.value == image3.value) {
                Toast.makeText(this, "You win a SMALL prize", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this, "You Lose", Toast.LENGTH_SHORT).show()
            }
        }
    }
}