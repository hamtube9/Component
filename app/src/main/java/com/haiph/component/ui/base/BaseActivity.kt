package com.haiph.component.ui.base

import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.widget.ProgressBar
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.haiph.component.R

abstract class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    fun proogressLoading(context: Context): Dialog {
        val dialogbuilder = AlertDialog.Builder(context)
        val inflater = layoutInflater
        val viewDialog = inflater.inflate(R.layout.item_dialog, null)
        dialogbuilder.setView(viewDialog)
        val dialog = dialogbuilder.create()
        dialog.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        val progressBar = viewDialog.findViewById<ProgressBar>(R.id.progressBar)
        dialog.setCanceledOnTouchOutside(false)
        progressBar.showContextMenu()
        return dialog
    }
}