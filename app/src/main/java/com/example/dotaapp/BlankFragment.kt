package com.example.dotaapp

import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.annotation.RequiresApi
import com.google.gson.Gson
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import java.lang.Exception
import java.net.URL
import java.nio.charset.StandardCharsets.UTF_8


class BlankFragment: Fragment(),View.OnClickListener {

    @RequiresApi(Build.VERSION_CODES.KITKAT)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        }




    @RequiresApi(Build.VERSION_CODES.KITKAT)
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_blank, container, false)

        val button1: Button = rootView.findViewById(R.id.button6)
        button1.setOnClickListener(this)

        return rootView
    }


    @SuppressLint("SetTextI18n")
    @RequiresApi(Build.VERSION_CODES.KITKAT)
    fun responce(){
        GlobalScope.async {

            try {
                val idOfMatch: String
                val textofTextPlain = activity?.findViewById<EditText>(R.id.findGame)
                idOfMatch = textofTextPlain?.text.toString()
                val response = URL("https://api.opendota.com/api/matches/$idOfMatch?api_key=YOUR-API-KEY").readText(UTF_8)
                val i = Gson()
                val m = i.fromJson(response, Response::class.java)

                activity?.runOnUiThread(){

                    run() {

                        val win = activity?.findViewById<TextView>(R.id.textView2)
                        val gameDurationDota = activity?.findViewById<TextView>(R.id.textView3)
                        var player0 = activity?.findViewById<TextView>(R.id.player0)
                        var player1 = activity?.findViewById<TextView>(R.id.player1)
                        var player2 = activity?.findViewById<TextView>(R.id.player2)
                        var player3 = activity?.findViewById<TextView>(R.id.player3)
                        var player4 = activity?.findViewById<TextView>(R.id.player4)
                        var player5 = activity?.findViewById<TextView>(R.id.player5)
                        var player6 = activity?.findViewById<TextView>(R.id.player6)
                        var player7 = activity?.findViewById<TextView>(R.id.player7)
                        var player8 = activity?.findViewById<TextView>(R.id.player8)
                        var player9 = activity?.findViewById<TextView>(R.id.player9)
                        //players?.text="Players: "
                        if(m.radiantWin.toString()=="true")
                        win?.setText("Radinat win")
                        else
                            win?.setText("Dire win")
                        gameDurationDota?.text="%.1f".format(m.duration?.div(60)).toString()+" minutes"

                                //if(m.players!![x]!!.name.toString()=="null")
                               // player0?.text=""+players2!!.text+ "Anonymous"+"; "
                            //else
                        if(m.players!![0]!!.name.toString()=="null")player0?.text="Anonymus" else player0?.text=m.players!![0]!!.name.toString()
                        if(m.players!![1]!!.name.toString()=="null")player1?.text="Anonymus" else player1?.text=m.players!![1]!!.name.toString()
                        if(m.players!![2]!!.name.toString()=="null")player2?.text="Anonymus" else player2?.text=m.players!![2]!!.name.toString()
                        if(m.players!![3]!!.name.toString()=="null")player3?.text="Anonymus" else player3?.text=m.players!![3]!!.name.toString()
                        if(m.players!![4]!!.name.toString()=="null")player4?.text="Anonymus" else player4?.text=m.players!![4]!!.name.toString()
                        if(m.players!![5]!!.name.toString()=="null")player5?.text="Anonymus" else player5?.text=m.players!![5]!!.name.toString()
                        if(m.players!![6]!!.name.toString()=="null")player6?.text="Anonymus" else player6?.text=m.players!![6]!!.name.toString()
                        if(m.players!![7]!!.name.toString()=="null")player7?.text="Anonymus" else player7?.text=m.players!![7]!!.name.toString()
                        if(m.players!![8]!!.name.toString()=="null")player8?.text="Anonymus" else player8?.text=m.players!![8]!!.name.toString()
                        if(m.players!![9]!!.name.toString()=="null")player9?.text="Anonymus" else player9?.text=m.players!![9]!!.name.toString()
                        }
                    }


                //Toast.makeText(MainActivity(), textofStatistics.text.toString(), Toast.LENGTH_SHORT).show()
            } catch (e: Exception) {
                Toast.makeText(MainActivity(), e.toString(), Toast.LENGTH_SHORT).show()
            }
        }
    }

    @RequiresApi(Build.VERSION_CODES.KITKAT)
    override fun onClick(v: View?) {
        responce()
    }

}