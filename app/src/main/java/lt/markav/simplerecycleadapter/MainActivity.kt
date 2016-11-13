package lt.markav.simplerecycleadapter

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.list_item.view.*
import lt.markav.simplerecyclearapter.SimpleRecycleAdapter

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listView.layoutManager = LinearLayoutManager(this)
        val adapter = SimpleRecycleAdapter<String>(R.layout.list_item, "Labas", "Delfi", "Delfi", "Delfi", "Delfi", "Delfi", "Delfi", "Delfi", "Delfi", "Delfi", "Delfi", "Delfi", "Delfi", "Delfi", "Delfi", "Delfi", "Delfi", "Delfi", "Delfi", "Delfi", "Delfi")
        adapter.onBindItem { holder, index, item -> holder.itemView.text.setText(item) }
        listView.adapter = adapter

    }



}
