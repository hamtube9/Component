package com.haiph.component.ui.activity

import android.os.Parcel
import android.os.Parcelable

data class User(var name : String, var phone : String) : Parcelable {

    constructor(parcel: Parcel) : this(
        parcel.readString().toString(),
        parcel.readString().toString()
    ) {
    }
    override fun writeToParcel(dest: Parcel?, flags: Int) {
      dest!!.writeString(name)
        dest.writeString(phone)
    }

    override fun describeContents(): kotlin.Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<User> {
        override fun createFromParcel(parcel: Parcel): User {
            return User(parcel)
        }

        override fun newArray(size: Int): Array<User?> {
            return arrayOfNulls(size)
        }
    }
}

