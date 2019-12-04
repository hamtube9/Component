package com.haiph.component.ui.broadcast

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class MyBroadcast : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        var intentMyBroadcast = intent
        Toast.makeText(context,"Network is  turn ON/ OFF "+ intentMyBroadcast!!.action,Toast.LENGTH_LONG).show()
    }



}