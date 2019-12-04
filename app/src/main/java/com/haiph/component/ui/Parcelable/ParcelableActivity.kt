package com.haiph.component.ui.Parcelable

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import androidx.recyclerview.widget.LinearLayoutManager
import com.haiph.component.R
import com.haiph.component.ui.Parcelable.model.MyParcelable
import kotlinx.android.synthetic.main.activity_parcelable.*

class ParcelableActivity : AppCompatActivity() {
    lateinit var adapter: AdapterParce
    var list: ArrayList<MyParcelable> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_parcelable)
        list.add(MyParcelable("0988250020", "me"))
        list.add(MyParcelable("113", "police"))
        list.add(MyParcelable("115", "hospital"))

       adapter = AdapterParce(list, object : ItemOnclick{
           override fun OnclickListener(position: Int) {
               var intent = Intent(this@ParcelableActivity,getDataParcelable::class.java)
               intent.putExtra("item",list.get(position))
               startActivity(intent)
           }

       })

        rcParce.adapter = adapter
        rcParce.layoutManager = LinearLayoutManager(this)


    }
}
