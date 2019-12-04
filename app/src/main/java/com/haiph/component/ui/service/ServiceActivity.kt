package com.haiph.component.ui.service

import android.app.AlertDialog
import android.app.Dialog
import android.app.Service
import android.content.Intent
import android.net.ConnectivityManager
import android.net.NetworkInfo
import android.net.wifi.WifiManager
import android.os.Bundle
import android.widget.Toast
import com.haiph.component.R
import com.haiph.component.ui.base.BaseActivity
import kotlinx.android.synthetic.main.activity_service.*


class ServiceActivity : BaseActivity() {
    var connectivity: ConnectivityManager? = null
    var networkInfo: NetworkInfo? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_service)

        btnWifi.setOnClickListener {

                    if (isNetworkAvailable()){
                        Toast.makeText(this, "WIFI off", Toast.LENGTH_SHORT).show()

                    }else{
                        Toast.makeText(this, "WIFI on connect", Toast.LENGTH_SHORT).show()


//                        var  builder= AlertDialog.Builder(this)
//                        builder.setTitle("wifi chưa bật, bạn có muốn bật wifi k")
//                        builder.setPositiveButton("Yes"){dialog, which ->
//                            startActivity(Intent(WifiManager.ACTION_PICK_WIFI_NETWORK))
//
//                        }
//                        builder.setNegativeButton("No"){dialog, which ->
//                            finish()
//                        }

                    }

        }

    }


    fun isNetworkAvailable(): Boolean {
        connectivity= this.getSystemService(Service.CONNECTIVITY_SERVICE) as ConnectivityManager
        networkInfo = connectivity!!.activeNetworkInfo
        return if (networkInfo != null && networkInfo!!.isConnected) {
            true
        } else false
    }
}
