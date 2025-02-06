package com.example.registrationpage

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView

class ItemsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_items)

        val itemsList: RecyclerView = findViewById(R.id.itemsList)
        val items = arrayListOf<Item>()

        items.add(Item(1,"divan", "Диван", "штука на якій лежать", "There are a big text just to check how it works or maybe not soo big as it coukd be, anyway", 666))
        items.add(Item(1,"TV", "То тєлік", "штука на якій дивляться щось з дивану", "There are a big text just to check how it works or maybe not soo big as it coukd be, anyway", 8888))
        items.add(Item(1,"Xbox", "Приставка", "штука на якій грають у тєлік лежачи на дивані", "There are a big text just to check how it works or maybe not soo big as it coukd be, anyway", 99099))


        }
    }