package com.haiph.component.ui.event

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.util.Log
import android.widget.Toast
import com.haiph.component.R
import kotlinx.android.synthetic.main.activity_get_event_bus.*
import org.greenrobot.eventbus.EventBus
import org.greenrobot.eventbus.Subscribe
import org.greenrobot.eventbus.ThreadMode

class GetEventBusActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_get_event_bus)
        btnBack.setOnClickListener { startActivity(Intent(this, EventBusActivity::class.java)) }
    }


    override fun onStart() {
        super.onStart()
        EventBus.getDefault().register(this)
        Toast.makeText(this,"Register EvenBus",Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        EventBus.getDefault().unregister(this)
    }

    //hàm nhận event thông báo
    @Subscribe(sticky = true,threadMode = ThreadMode.POSTING)
    public fun onMessageEvent( event : Messenger){
        Log.d("getDataaEvent",event.getMess()+" " +event.messenger)
        textBus.text = Editable.Factory.getInstance().newEditable(event.getMess())

    }




}
