package com.example.superherolist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {


    val superHeros = listOf(
        SuperHero("Wheat","wheat field","Contenido aleatorio","https://i.picsum.photos/id/487/130/130.jpg?hmac=PWg8K5vO4UlmgZ8QFskXSX88ZcCV8bAjKkUavh43rlc"),
        SuperHero("Mountain","snowy mountain","Contenido aleatorio","https://i.picsum.photos/id/406/130/130.jpg?hmac=8Mih8MBRMCzWkJQgzNHQwLnm05RyMI_8pvTbnMzxB4Q"),
        SuperHero("Office","job","Contenido aleatorio","https://i.picsum.photos/id/192/130/130.jpg?hmac=MJhR-rxcMORupXIR5rhyDemeMUZDfdiIPmg3gMKoAhI"),
        SuperHero("Night","light in the night","Contenido aleatorio","https://i.picsum.photos/id/494/130/130.jpg?hmac=MfWFON_pgvBHNXcoh4DwyXDNyIULdXWGyU0e7Ryqhgg"),
        SuperHero("Wolf","wolf in the forest","Contenido aleatorio","https://i.picsum.photos/id/718/130/130.jpg?hmac=yfzvohL3wSLu1KrIY7F9do5D19tYK59qFilktdfhzlI"),
        SuperHero("Bear","bear on the mountain","Contenido aleatorio","https://i.picsum.photos/id/1020/130/130.jpg?hmac=-cH6n4uEhNuQCctpqf5nEI83awitzK1FdTvlsdJQ99w"),
        SuperHero("Desert","desert rock","Contenido aleatorio","https://i.picsum.photos/id/27/130/130.jpg?hmac=2nlN5W_cGdtzDr0Q3N1LLoMwrCwwasxh1N0znspkoMg")

    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        declarations()
        initRecycler()
    }

    fun initRecycler(){
        var recycler_object:RecyclerView = findViewById(R.id.rvSuperHero) as RecyclerView
        recycler_object.layoutManager = LinearLayoutManager(this)
        val adapter = HeroAdapter(superHeros)
        recycler_object.adapter = adapter
    }

    fun declarations(){


    }
}