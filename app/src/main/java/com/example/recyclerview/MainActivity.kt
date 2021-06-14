package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val layoutList=generateDummList(100)
        recyclerview.adapter=LayoutAdapter(layoutList)
        recyclerview.layoutManager=GridLayoutManager(this, 2)

        generateDummList(500)
    }

    private fun generateDummList(size: Int): List<LayoutItem> {
        val list = ArrayList<LayoutItem>()

        for (i in 0 until size) {
            val drawable = when (i % 3) {
                0 -> R.drawable.shoes
                1 -> R.drawable.sunglasses
                else -> R.drawable.shirts

            }
            val item = LayoutItem(drawable, "Product $i", 500)
            list += item

        }
        return list

    }


}