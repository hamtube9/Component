package com.haiph.component.ui.handler

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.os.Message
import com.haiph.component.R
import com.haiph.component.ui.activity.ActivityActivity
import kotlinx.android.synthetic.main.activity_handler_count.*
import java.lang.Exception

class HandlerCountActivity : AppCompatActivity() {
    val MSG_UPDATE_NUMER = 10
    lateinit var handler : Handler
    var counting : Boolean?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_handler_count)

        //tạo 1 luồng xử lí
       var thread  : Thread = Thread(Runnable {
           //cho 1 vòng lặp từ 1 đến 10
           for (i in 1..10){
               //tạo 1 message
               var message : Message = Message()
               // tạo mã thông báo
               message.what = MSG_UPDATE_NUMER
               //cho tham sổ arg1 = i
               message.arg1=i
               //gửi message
               handler.sendMessage(message)
               try {
                   //luồng ngủ 1 giây
                   Thread.sleep(1000)
               }catch (e : Exception){
                   e.printStackTrace()
               }
           }
       })

        btnCount.setOnClickListener {
            //luồng bắt đầu chạy
                thread.start()
        }
        listenHandler()
    }

    private fun listenHandler() {
        handler= object : Handler(Looper.getMainLooper()){
            override fun handleMessage(msg: Message) {
                super.handleMessage(msg)
               when(msg.what){
                   MSG_UPDATE_NUMER -> {
                       counting=true
                       tvCount.text = msg.arg1.toString()
                       if (tvCount.text=="10"){
                           msg.arg1=1
                           startActivity(Intent(this@HandlerCountActivity,
                               ActivityActivity::class.java))
                       }
                   }
               }
            }
        }
    }

}
