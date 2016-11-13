package lt.markav.simplerecyclearapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup

import java.util.Arrays

open class SimpleRecycleAdapter<Item>(private val layoutId: Int, val items: MutableList<Item>)
    : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    lateinit var onBindListener: (RecyclerView.ViewHolder, Int, Item) -> Unit

    constructor(layoutId: Int, vararg items: Item) : this(layoutId, Arrays.asList(*items))

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return object : RecyclerView.ViewHolder(LayoutInflater.from(parent.context).inflate(layoutId, null)) {}
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        onBindListener(holder, position, items[position])
    }

    fun onBindItem(onBindListener: (RecyclerView.ViewHolder, Int, Item) -> Unit ) {
        this.onBindListener = onBindListener
    }

    override fun getItemCount(): Int {
        return items.size
    }

}
