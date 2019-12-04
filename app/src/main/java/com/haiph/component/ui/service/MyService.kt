//package com.haiph.component.ui.service
//
//import android.app.Service
//import android.content.Intent
//import android.os.IBinder
//import android.widget.Toast
//
//class MyService: Service() {
//    override fun onBind(intent: Intent?): IBinder? {
//        return null
//    }
//
//    override fun onCreate() {
//        super.onCreate()
//        Toast.makeText(this,"onCreate" ,Toast.LENGTH_SHORT).show()
//    }
//
//    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
//        var serviceIntent :String? =null
//        if (intent != null){
////            serviceIntent = intent.getStringExtra(ServiceActivity.serviceString)
//        }
//        Toast.makeText(this,"onStartCommand"+serviceIntent,Toast.LENGTH_SHORT).show()
//        //START_SICKY  báo với hệ điều hành rằng cần tạo lại service khi có đủ bộ nhớ và call lại onStartCommand()
//        //với intent  là null ( thường áp dụng cho các service k truyền dữ liệu )
//        return START_STICKY
//    }
//    override fun onDestroy() {
//        super.onDestroy()
//        Toast.makeText(this,"onDestroy",Toast.LENGTH_SHORT).show()
//
//    }
//}