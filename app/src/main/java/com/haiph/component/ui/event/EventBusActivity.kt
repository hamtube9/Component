package com.haiph.component.ui.event

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.util.Log
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentPagerAdapter
import com.haiph.component.R
import kotlinx.android.synthetic.main.activity_event.*
import org.greenrobot.eventbus.EventBus

class EventBusActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_event)
        sendBus.setOnClickListener {
            var text = edit.text.toString()
            sendBus(text)
            startActivity(Intent(this,GetEventBusActivity::class.java))
        }
    }

    fun sendBus(text : String){
        EventBus.getDefault().postSticky(Messenger(text))
        Log.d("sendText",text+"")
    }

    override fun onStart() {
        super.onStart()
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onStop() {
        super.onStop()
    }



}
