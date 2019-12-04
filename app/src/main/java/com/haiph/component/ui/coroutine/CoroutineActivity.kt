package com.haiph.component.ui.coroutine

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.haiph.component.R
import kotlinx.android.synthetic.main.activity_coroutine.*
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.system.measureTimeMillis

class CoroutineActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coroutine)



    }

//    suspend fun main() = coroutineScope {
//        launch {
//            delay(1000)
//           Toast.makeText(this@CoroutineActivity,"Demo Coroutine",Toast.LENGTH_SHORT).show()
//        }
//        Toast.makeText(this@CoroutineActivity,"Hello",Toast.LENGTH_SHORT).show()
//    }


}
