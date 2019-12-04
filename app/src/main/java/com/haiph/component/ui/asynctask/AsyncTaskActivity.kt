package com.haiph.component.ui.asynctask

import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.haiph.component.R
import kotlinx.android.synthetic.main.activity_async_task.*


class AsyncTaskActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_async_task)

        change.setOnClickListener {
            var download : DownloadImagesTask=DownloadImagesTask()
            download.execute()
        }

    }

  inner  class DownloadImagesTask(): AsyncTask<Void, Int, String>() {
      override fun doInBackground(vararg params: Void?): String {
          for (i in 0..100) {


              publishProgress(i)
              try {
                  Thread.sleep(1000)
              } catch (e: InterruptedException) {
                  e.printStackTrace()
              }

          }
          return "DONE"
      }

      override fun onProgressUpdate(vararg values: Int?) {
          progress.setProgress(values[0]!!)

      }
      override fun onPreExecute() {
          super.onPreExecute()
      }

      override fun onPostExecute(result: String?) {
          super.onPostExecute(result)
          Toast.makeText(this@AsyncTaskActivity, result, Toast.LENGTH_SHORT).show()
      }



  }
}
