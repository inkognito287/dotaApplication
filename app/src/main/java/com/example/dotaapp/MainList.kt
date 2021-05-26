package com.example.dotaapp

import android.os.AsyncTask
import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.fragment.app.ListFragment
import com.google.gson.Gson
import kotlinx.coroutines.*
import java.lang.Exception
import java.net.URL
import java.nio.charset.StandardCharsets



var data= arrayListOf<String>("1","2","3","","","","")
class MainList : ListFragment() {
inner class Api : AsyncTask<String,Void,String>(){
    override fun doInBackground(vararg params: String?): String {
        try {
            val idOfMatch: String
            var response = URL("https://api.opendota.com/api/proMatches?api_key=YOUR-API-KEY").readText(Charsets.UTF_8)
            val i = Gson()
            response="{\"ResponsePro\":" + response + "}"
            val m = i.fromJson(response, ResponsePro::class.java)
            //delay(1000)
            for (x in 0..6){
                var win= m.responsePro!![x]!!.radiantWin
                if(win==true) {
                    var result = m.responsePro!![x]?.radiantName + " vs " + m.responsePro[x]!!.direName +"("+m.responsePro!![x]?.radiantName+" win)"
                    data[x]=result
                }
                else {

                    var result = m.responsePro!![x]?.radiantName + " vs " + m.responsePro[x]!!.direName + "(" + m.responsePro!![x]?.direName + " lose)"
                    data[x]=result
                }
            }

            //Toast.makeText(MainActivity(), textofStatistics.text.toString(), Toast.LENGTH_SHORT).show()
        } catch (e: Exception) {
            Toast.makeText(MainActivity(), e.toString(), Toast.LENGTH_SHORT).show()
        }
        return ""
    }

    override fun onPostExecute(result: String?) {
        super.onPostExecute(result)
    }

}

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
    //Api().execute()
        responcePro()

        try {
            println(data[0])
            //adapter.notifyDataSetChanged()
        }catch (e:Exception){
            Toast.makeText(MainActivity(), e.toString(), Toast.LENGTH_SHORT).show()
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
       // Thread.sleep(2000)

        return super.onCreateView(inflater, container, savedInstanceState)
    }
    fun responcePro(){

            GlobalScope.async {
                try {
                    val idOfMatch: String
                    var response = URL("https://api.opendota.com/api/proMatches?api_key=YOUR-API-KEY").readText(Charsets.UTF_8)
                    val i = Gson()
                    response="{\"ResponsePro\":" + response + "}"
                    val m = i.fromJson(response, ResponsePro::class.java)
                    //delay(1000)
                    for (x in 0..6){
                        var win= m.responsePro!![x]!!.radiantWin
                        if(win==true) {
                            var result = m.responsePro!![x]?.radiantName + " vs " + m.responsePro[x]!!.direName +"("+m.responsePro!![x]?.radiantName+" win)"
                            data[x]=result
                        }
                        else {

                            var result = m.responsePro!![x]?.radiantName + " vs " + m.responsePro[x]!!.direName + "(" + m.responsePro!![x]?.direName + " lose)"
                            data[x]=result
                        }
                    }
                    //delay(1000)
                    activity?.runOnUiThread(){

                        run() {
                            var adapter = ArrayAdapter<String>(activity!!, android.R.layout.simple_list_item_1, data)
                           
                            listAdapter = adapter
                            // Stuff that updates the UI

                        }
                    }


                    //Toast.makeText(MainActivity(), textofStatistics.text.toString(), Toast.LENGTH_SHORT).show()
                } catch (e: Exception) {
                    Toast.makeText(MainActivity(), e.toString(), Toast.LENGTH_SHORT).show()
                }
            }

        }
    }
