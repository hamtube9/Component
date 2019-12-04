package com.haiph.component.ui.event

 class Messenger {
     var messenger: String? = null


     constructor(messenger : String){
        this.messenger=messenger
     }

     fun getMess(): String?{
         return messenger
     }



}