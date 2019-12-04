package com.haiph.component.ui.ExtensionFunction

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.IntegerRes
import com.haiph.component.R
import kotlinx.android.synthetic.main.activity_demo_extension_function.*

class DemoExtensionFunction : AppCompatActivity() {

    var checkNumberScore = CheckScore()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_demo_extension_function)
        var score : Int

        checkScore.setOnClickListener {
            score =  editScore.text.toString().toInt()

            if (checkNumberScore.checkScoreLessThanFive(score)){
                tvcheck.text = "YOU SUCK "
            }else if (checkNumberScore.checkScoreMoreThanFive(score)){
                tvcheck.text = " YOU GOOD"
            }
        }


    }
}
