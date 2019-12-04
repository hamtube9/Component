package com.haiph.component.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.haiph.component.R
import com.haiph.component.ui.ExtensionFunction.DemoExtensionFunction
import com.haiph.component.ui.Parcelable.ParcelableActivity
import com.haiph.component.ui.activity.ActivityActivity
import com.haiph.component.ui.asynctask.AsyncTaskActivity
import com.haiph.component.ui.coroutine.CoroutineActivity
import com.haiph.component.ui.event.EventBusActivity
import com.haiph.component.ui.handler.HandlerCountActivity
import com.haiph.component.ui.service.ServiceActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        provider.setOnClickListener { startActivity(Intent(this, ProviderActivity::class.java)) }
        recerver.setOnClickListener { startActivity(Intent(this, BroadcastReceiver::class.java)) }
        service.setOnClickListener { startActivity(Intent(this, ServiceActivity::class.java)) }
        event.setOnClickListener { startActivity(Intent(this, EventBusActivity::class.java)) }
        btnhandler.setOnClickListener {
            startActivity(
                Intent(
                    this,
                    HandlerCountActivity::class.java
                )
            )
        }
        asynctask.setOnClickListener { startActivity(Intent(this, AsyncTaskActivity::class.java)) }
        parce.setOnClickListener { startActivity(Intent(this, ParcelableActivity::class.java)) }
        extension.setOnClickListener {
            startActivity(
                Intent(
                    this,
                    DemoExtensionFunction::class.java
                )
            )
        }
        coroutime.setOnClickListener { startActivity(Intent(this, CoroutineActivity::class.java)) }
        activity.setOnClickListener { startActivity(
            Intent(this,
                ActivityActivity::class.java)
        ) }
    }
}
