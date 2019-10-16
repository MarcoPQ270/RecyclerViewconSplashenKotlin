package com.example.ejemplerecy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.ejemplerecy.Adapters.AdapterRvMarco
import com.example.ejemplerecy.dataclasses.Viajes

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.AppTheme)
        setContentView(R.layout.activity_main)
        val lista = listOf<Viajes>(
            Viajes("Marco", "12:00", "TICS","Comonfort"),
            Viajes("MarcoMarcoMarco Antonio", "12:00", "TICS","Comonfort"),
            Viajes("Marco AntonioMarcoMarcoMarcoMarcoMarco", "12:00", "TICS","Comonfort"),
            Viajes("vvv", "12:00", "TICS","Comonfort"),
            Viajes("Marco", "12:00", "TICS","Comonfort"),
            Viajes("MarcoMarco Antonio", "12:00", "TICS","Comonfort"),
            Viajes("Antonio", "12:00", "TICS","Comonfort"),
            Viajes("MarcoMarco Antonio", "12:00", "TICS","Comonfort"),
            Viajes("MarcoMarco Antonio", "12:00", "TICS","Comonfort"),
            Viajes("Marconio", "12:00", "TICS","Comonfort"),
            Viajes(" Antonio", "12:00", "TICS","Comonfort"),
            Viajes("MarcoMarcoMarco Antonio", "12:00", "TICS","Comonfort"),
                    Viajes("Marco", "12:00", "TICS","Comonfort"),
        Viajes("MarcoMarcoMarco Antonio", "12:00", "TICS","Comonfort"),
        Viajes("Marco AntonioMarcoMarcoMarcoMarcoMarco", "12:00", "TICS","Comonfort"),
        Viajes("vvv", "12:00", "TICS","Comonfort"),
        Viajes("Marco", "12:00", "TICS","Comonfort"),
        Viajes("MarcoMarco Antonio", "12:00", "TICS","Comonfort"),
        Viajes("Antonio", "12:00", "TICS","Comonfort"),
        Viajes("MarcoMarco Antonio", "12:00", "TICS","Comonfort"),
        Viajes("MarcoMarco Antonio", "12:00", "TICS","Comonfort"),
        Viajes("Marconio", "12:00", "TICS","Comonfort"),
        Viajes(" Antonio", "12:00", "TICS","Comonfort"),
        Viajes("MarcoMarcoMarco Antonio", "12:00", "TICS","Comonfort"),

            Viajes("Marco", "12:00", "TICS","Comonfort"),
            Viajes("MarcoMarcoMarco Antonio", "12:00", "TICS","Comonfort"),
            Viajes("Marco AntonioMarcoMarcoMarcoMarcoMarco", "12:00", "TICS","Comonfort"),
            Viajes("vvv", "12:00", "TICS","Comonfort"),
            Viajes("Marco", "12:00", "TICS","Comonfort"),
            Viajes("MarcoMarco Antonio", "12:00", "TICS","Comonfort"),
            Viajes("Antonio", "12:00", "TICS","Comonfort"),
            Viajes("MarcoMarco Antonio", "12:00", "TICS","Comonfort"),
            Viajes("MarcoMarco Antonio", "12:00", "TICS","Comonfort"),
            Viajes("Marconio", "12:00", "TICS","Comonfort"),
            Viajes(" Antonio", "12:00", "TICS","Comonfort"),
            Viajes("MarcoMarcoMarco Antonio", "12:00", "TICS","Comonfort"),
            Viajes("Marco", "12:00", "TICS","Comonfort"),
            Viajes("MarcoMarcoMarco Antonio", "12:00", "TICS","Comonfort"),
            Viajes("Marco AntonioMarcoMarcoMarcoMarcoMarco", "12:00", "TICS","Comonfort"),
            Viajes("vvv", "12:00", "TICS","Comonfort"),
            Viajes("Marco", "12:00", "TICS","Comonfort"),
            Viajes("MarcoMarco Antonio", "12:00", "TICS","Comonfort"),
            Viajes("Antonio", "12:00", "TICS","Comonfort"),
            Viajes("MarcoMarco Antonio", "12:00", "TICS","Comonfort"),
            Viajes("MarcoMarco Antonio", "12:00", "TICS","Comonfort"),
            Viajes("Marconio", "12:00", "TICS","Comonfort"),
            Viajes(" Antonio", "12:00", "TICS","Comonfort"),
            Viajes("MarcoMarcoMarco Antonio", "12:00", "TICS","Comonfort"),
            Viajes("Marco", "12:00", "TICS","Comonfort"),
            Viajes("MarcoMarcoMarco Antonio", "12:00", "TICS","Comonfort"),
            Viajes("Marco AntonioMarcoMarcoMarcoMarcoMarco", "12:00", "TICS","Comonfort"),
            Viajes("vvv", "12:00", "TICS","Comonfort"),
            Viajes("Marco", "12:00", "TICS","Comonfort"),
            Viajes("MarcoMarco Antonio", "12:00", "TICS","Comonfort"),
            Viajes("Antonio", "12:00", "TICS","Comonfort"),
            Viajes("MarcoMarco Antonio", "12:00", "TICS","Comonfort"),
            Viajes("MarcoMarco Antonio", "12:00", "TICS","Comonfort"),
            Viajes("Marconio", "12:00", "TICS","Comonfort"),
            Viajes(" Antonio", "12:00", "TICS","Comonfort"),
            Viajes("MarcoMarcoMarco Antonio", "12:00", "TICS","Comonfort"),
            Viajes("Marco", "12:00", "TICS","Comonfort"),
            Viajes("MarcoMarcoMarco Antonio", "12:00", "TICS","Comonfort"),
            Viajes("Marco AntonioMarcoMarcoMarcoMarcoMarco", "12:00", "TICS","Comonfort"),
            Viajes("vvv", "12:00", "TICS","Comonfort"),
            Viajes("Marco", "12:00", "TICS","Comonfort"),
            Viajes("MarcoMarco Antonio", "12:00", "TICS","Comonfort"),
            Viajes("Antonio", "12:00", "TICS","Comonfort"),
            Viajes("MarcoMarco Antonio", "12:00", "TICS","Comonfort"),
            Viajes("MarcoMarco Antonio", "12:00", "TICS","Comonfort"),
            Viajes("Marconio", "12:00", "TICS","Comonfort"),
            Viajes(" Antonio", "12:00", "TICS","Comonfort"),
            Viajes("MarcoMarcoMarco Antonio", "12:00", "TICS","Comonfort"),
            Viajes("Marco", "12:00", "TICS","Comonfort"),
            Viajes("MarcoMarcoMarco Antonio", "12:00", "TICS","Comonfort"),
            Viajes("Marco AntonioMarcoMarcoMarcoMarcoMarco", "12:00", "TICS","Comonfort"),
            Viajes("vvv", "12:00", "TICS","Comonfort"),
            Viajes("Marco", "12:00", "TICS","Comonfort"),
            Viajes("MarcoMarco Antonio", "12:00", "TICS","Comonfort"),
            Viajes("Antonio", "12:00", "TICS","Comonfort"),
            Viajes("MarcoMarco Antonio", "12:00", "TICS","Comonfort"),
            Viajes("MarcoMarco Antonio", "12:00", "TICS","Comonfort"),
            Viajes("Marconio", "12:00", "TICS","Comonfort"),
            Viajes(" Antonio", "12:00", "TICS","Comonfort"),
            Viajes("MarcoMarcoMarco Antonio", "12:00", "TICS","Comonfort"),
            Viajes("Marco", "12:00", "TICS","Comonfort"),
            Viajes("MarcoMarcoMarco Antonio", "12:00", "TICS","Comonfort"),
            Viajes("Marco AntonioMarcoMarcoMarcoMarcoMarco", "12:00", "TICS","Comonfort"),
            Viajes("vvv", "12:00", "TICS","Comonfort"),
            Viajes("Marco", "12:00", "TICS","Comonfort"),
            Viajes("MarcoMarco Antonio", "12:00", "TICS","Comonfort"),
            Viajes("Antonio", "12:00", "TICS","Comonfort"),
            Viajes("MarcoMarco Antonio", "12:00", "TICS","Comonfort"),
            Viajes("MarcoMarco Antonio", "12:00", "TICS","Comonfort"),
            Viajes("Marconio", "12:00", "TICS","Comonfort"),
            Viajes(" Antonio", "12:00", "TICS","Comonfort"),
            Viajes("MarcoMarcoMarco Antonio", "12:00", "TICS","Comonfort"),
            Viajes("Marco", "12:00", "TICS","Comonfort"),
            Viajes("MarcoMarcoMarco Antonio", "12:00", "TICS","Comonfort"),
            Viajes("Marco AntonioMarcoMarcoMarcoMarcoMarco", "12:00", "TICS","Comonfort"),
            Viajes("vvv", "12:00", "TICS","Comonfort"),
            Viajes("Marco", "12:00", "TICS","Comonfort"),
            Viajes("MarcoMarco Antonio", "12:00", "TICS","Comonfort"),
            Viajes("Antonio", "12:00", "TICS","Comonfort"),
            Viajes("MarcoMarco Antonio", "12:00", "TICS","Comonfort"),
            Viajes("MarcoMarco Antonio", "12:00", "TICS","Comonfort"),
            Viajes("Marconio", "12:00", "TICS","Comonfort"),
            Viajes(" Antonio", "12:00", "TICS","Comonfort"),
            Viajes("MarcoMarcoMarco Antonio", "12:00", "TICS","Comonfort"),
            Viajes("Marco", "12:00", "TICS","Comonfort"),
            Viajes("MarcoMarcoMarco Antonio", "12:00", "TICS","Comonfort"),
            Viajes("Marco AntonioMarcoMarcoMarcoMarcoMarco", "12:00", "TICS","Comonfort"),
            Viajes("vvv", "12:00", "TICS","Comonfort"),
            Viajes("Marco", "12:00", "TICS","Comonfort"),
            Viajes("MarcoMarco Antonio", "12:00", "TICS","Comonfort"),
            Viajes("Antonio", "12:00", "TICS","Comonfort"),
            Viajes("MarcoMarco Antonio", "12:00", "TICS","Comonfort"),
            Viajes("MarcoMarco Antonio", "12:00", "TICS","Comonfort"),
            Viajes("Marconio", "12:00", "TICS","Comonfort"),
            Viajes(" Antonio", "12:00", "TICS","Comonfort"),
            Viajes("MarcoMarcoMarco Antonio", "12:00", "TICS","Comonfort"),
            Viajes("Marco", "12:00", "TICS","Comonfort"),
            Viajes("MarcoMarcoMarco Antonio", "12:00", "TICS","Comonfort"),
            Viajes("Marco AntonioMarcoMarcoMarcoMarcoMarco", "12:00", "TICS","Comonfort"),
            Viajes("vvv", "12:00", "TICS","Comonfort"),
            Viajes("Marco", "12:00", "TICS","Comonfort"),
            Viajes("MarcoMarco Antonio", "12:00", "TICS","Comonfort"),
            Viajes("Antonio", "12:00", "TICS","Comonfort"),
            Viajes("MarcoMarco Antonio", "12:00", "TICS","Comonfort"),
            Viajes("MarcoMarco Antonio", "12:00", "TICS","Comonfort"),
            Viajes("Marconio", "12:00", "TICS","Comonfort"),
            Viajes(" Antonio", "12:00", "TICS","Comonfort"),
            Viajes("MarcoMarcoMarco Antonio", "12:00", "TICS","Comonfort")

        )

        val recycler = findViewById<RecyclerView>(R.id.main_rvMarco)
        val adapter = AdapterRvMarco(this)
        recycler.adapter = adapter
        recycler.layoutManager = LinearLayoutManager(this)
        //recycler.layoutManager = GridLayoutManager(this,4)

        //recycler.layoutManager = StaggeredGridLayoutManager(4,StaggeredGridLayoutManager.VERTICAL)
        adapter.setDataToList(lista)
    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.app_menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId){
            R.id.lupita -> {
                Toast.makeText(this,"CLick al menu",  Toast.LENGTH_LONG).show()
                true
            }
            else ->     super.onOptionsItemSelected(item)
        }
    }
}
