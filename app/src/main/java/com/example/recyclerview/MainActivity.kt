package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Adapter
import android.widget.ProgressBar
import android.widget.RelativeLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    lateinit var layoutManager: RecyclerView.LayoutManager


    val imageList = arrayListOf<ImageUrl>(
            ImageUrl("https://gamedata.britishcouncil.org/sites/default/files/attachment/number-1_1.jpg"),
            ImageUrl("https://gamedata.britishcouncil.org/sites/default/files/attachment/number-2_1.jpg"),
            ImageUrl("https://gamedata.britishcouncil.org/sites/default/files/attachment/number-3_1.jpg"),
            ImageUrl("https://gamedata.britishcouncil.org/sites/default/files/attachment/number-4_1.jpg"),
            ImageUrl("https://gamedata.britishcouncil.org/sites/default/files/attachment/number-5_1.jpg"),
            ImageUrl("https://gamedata.britishcouncil.org/sites/default/files/attachment/number-6_1.jpg"),
            ImageUrl("https://gamedata.britishcouncil.org/sites/default/files/attachment/number-7_0.jpg"),
            ImageUrl("https://gamedata.britishcouncil.org/sites/default/files/attachment/number-8_1.jpg"),
            ImageUrl("https://gamedata.britishcouncil.org/sites/default/files/attachment/number-9_1.jpg")
    )

    lateinit var recyclerAdapter: ImageAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        layoutManager = LinearLayoutManager(this@MainActivity)
        recyclerAdapter = ImageAdapter(this@MainActivity, imageList)
        recyclerView.adapter = recyclerAdapter
        recyclerView.layoutManager = layoutManager

    }
}