package com.haiph.component.ui

import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.haiph.component.R
import com.haiph.component.ui.activity.ActivityActivity
import com.haiph.component.ui.broadcast.MyBroadcast
import kotlinx.android.synthetic.main.activity_broadcast_receiver.*

class BroadcastReceiver : AppCompatActivity() {

    lateinit var network: MyBroadcast

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_broadcast_receiver)

        back.setOnClickListener {
            startActivity(Intent(this, ActivityActivity::class.java))
        }

    }

    override fun onStart() {
        super.onStart()
        wifiBroadcast()
        Toast.makeText(this, "Broadcast wifi is started", Toast.LENGTH_SHORT).show()

    }

    override fun onPause() {
        super.onPause()
    }

    override fun onStop() {
        super.onStop()
        unregisterReceiver(network)
        Toast.makeText(this,"Unregister broadcast receiver",Toast.LENGTH_SHORT).show()
    }


    fun wifiBroadcast() {
        network = MyBroadcast()
        var intentfilter = IntentFilter()
        intentfilter.addAction("android.net.conn.CONNECTIVITY_CHANGE")
        registerReceiver(network, intentfilter)
    }
}
