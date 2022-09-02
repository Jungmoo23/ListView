package kr.co.so.softcapus.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    private val TAG  = "MainActivity"



    val arrayli = arrayListOf<DataPerson>(
        DataPerson("jungmoo",25),
        DataPerson("hyojoo",35),
        DataPerson("jiyeone",30),
    )

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val text11:TextView = findViewById<TextView>(R.id.t1)
        val listView : ListView = findViewById(R.id.listview1)
        val adp  = ListAdapterr(this,arrayli)
        listView.adapter = adp
        listView.setOnItemClickListener {p0, p1,p2,p3 ->
            text11.text ="here name:: "+ arrayli.get(p2).name+" age::" +arrayli.get(p2).age
        }

    }

    inner class  Listviewlis : AdapterView.OnItemClickListener{
        override fun onItemClick(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {

        }

    }



}