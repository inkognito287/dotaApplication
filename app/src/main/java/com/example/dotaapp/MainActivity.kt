package com.example.dotaapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import java.net.URL

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }


suspend fun w (){

}
    fun onClick1 (v:View){

        var f1= BlankFragment()
        var ft= supportFragmentManager.beginTransaction()
        ft.replace(R.id.view,f1)
        ft.commit()
    }
    fun onClick2 (v:View){
        var f2= MainList()
        var ft= supportFragmentManager.beginTransaction()
        ft.replace(R.id.view,f2)
        ft.commit()
    }
    fun onClick3 (v:View){
        var f3= BlankFragment()
        var ft= supportFragmentManager.beginTransaction()
        ft.replace(R.id.view,f3)
        ft.commit()
    }
}