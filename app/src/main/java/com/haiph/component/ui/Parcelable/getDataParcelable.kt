package com.haiph.component.ui.Parcelable

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import com.haiph.component.R
import com.haiph.component.ui.Parcelable.model.MyParcelable
import kotlinx.android.synthetic.main.activity_get_data_parcelable.*

class getDataParcelable : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_get_data_parcelable)

        var intent = intent
        var myParcelable : MyParcelable?=null
        myParcelable = intent.getParcelableExtra("item")

        getPhone.text = myParcelable.phone
        getName.text = myParcelable.name

    }
}
