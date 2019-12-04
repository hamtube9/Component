package com.haiph.component.ui.activity

import android.os.Bundle
import android.text.Editable
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.haiph.component.R
import kotlinx.android.synthetic.main.activity_activity.*

class ActivityActivity : AppCompatActivity() {
    var c = 0

    var sum = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activity)

        Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show()


        btSave.setOnClickListener {
            sum = edA.text.toString().toInt() + edB.text.toString().toInt()
            tvSum.text = "$sum"
        }




//        save.setOnClickListener {
//            c++
//            tvName.text = c.toString()
//        }
//
//        saveUser.setOnClickListener {
//            val name = edtnameUser.text.toString()
//            var phone = edtDT.text.toString()
//            tvDT.text = phone
//            tvnameUser.text = name
//            var user = User(name,phone)
//            Log.d("user",user.name + " " +user.phone)
//        }
    }


    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

         outState.putInt("sum",tvSum.text.toString().toInt())

    }


    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        tvSum.text = savedInstanceState?.getInt("sum").toString()
    }

    override fun onStart() {
        super.onStart()
        var toast: Toast = Toast.makeText(this, "onStart", Toast.LENGTH_SHORT)
        toast.show()
    }



    override fun onResume() {
        super.onResume()
        var toast: Toast = Toast.makeText(this, "onResume", Toast.LENGTH_SHORT)
        toast.show()
    }

    override fun onStop() {
        super.onStop()
        var toast: Toast = Toast.makeText(this, "onStop", Toast.LENGTH_SHORT)
        toast.show()

    }

    override fun onRestart() {
        super.onRestart()
        var toast: Toast = Toast.makeText(this, "onRestart", Toast.LENGTH_LONG)
        toast.show()
    }
}
