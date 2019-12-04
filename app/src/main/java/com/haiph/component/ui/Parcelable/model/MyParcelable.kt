package com.haiph.component.ui.Parcelable.model

import android.os.Parcel
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class MyParcelable(var phone : String,var name : String) : Parcelable{



}