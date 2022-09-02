package kr.co.so.softcapus.myapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.BaseAdapter
import android.widget.TextView


class ListAdapterr(val context: Context, val PersonItem: ArrayList<DataPerson>): BaseAdapter() {
    override fun getCount(): Int {
        return PersonItem.size
    }

    override fun getItem(position: Int): Any {
        return PersonItem[position]
    }

    override fun getItemId(p0: Int): Long {
        return 0L
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        val view : View= LayoutInflater.from(context).inflate(R.layout.activity_listview,null)

        val t1 :TextView = view.findViewById(R.id.text_list1)
        val t2 :TextView = view.findViewById(R.id.text_list2)

        val eachItem = PersonItem[p0]

        t1.text = eachItem.name
        t2.text = eachItem.age.toString()

        return view
    }

}