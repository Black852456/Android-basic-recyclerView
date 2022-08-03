package com.example.superherolist

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class HeroAdapter(val superhero:List<SuperHero>):RecyclerView.Adapter<HeroAdapter.HeroHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeroHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return HeroHolder(layoutInflater.inflate(R.layout.item_superohero ,parent,false))
    }

    override fun onBindViewHolder(holder: HeroHolder, position: Int) {
        holder.render(superhero[position])
    }

    override fun getItemCount(): Int {
        return superhero.size
    }


    class HeroHolder(val itemView: View) : RecyclerView.ViewHolder(itemView) {

        val tvSuperHeroName:TextView
        val tvRealName:TextView
        val tvPublisher:TextView
        val ivImageContent:ImageView
        init {
            tvSuperHeroName = itemView.findViewById(R.id.tvSuperHeroName)
            tvRealName = itemView.findViewById(R.id.tvRealName)
            tvPublisher = itemView.findViewById(R.id.tvPublisher)
            ivImageContent = itemView.findViewById(R.id.ivSuperHeroImage)
        }
        fun render(superhero:SuperHero){
            tvSuperHeroName.text = superhero.superHeroName
            tvRealName.text = superhero.realName
            Log.v("Contenido",""+tvRealName.text+"")
            //tvPublisher.text = superhero.publisher
            Glide.with(itemView.context).load(superhero.url_image).into(ivImageContent)

        }
    }

}