package com.jjoaooliveira.superheroes.model

import com.jjoaooliveira.superheroes.R

object HeroesDataSource {
    val heroes = listOf<Hero>(
        Hero(
            R.string.hero1_name,
            R.string.hero_description1,
            R.drawable.android_superhero1
        ),
        Hero(
            R.string.hero2_name,
            R.string.hero_description2,
            R.drawable.android_superhero2
        ),
        Hero(
            R.string.hero3_name,
            R.string.hero_description3,
            R.drawable.android_superhero3
        ),
        Hero(
            R.string.hero4_name,
            R.string.hero_description4,
            R.drawable.android_superhero4
        ),
        Hero(
            R.string.hero5_name,
            R.string.hero_description5,
            R.drawable.android_superhero5
        ),
        Hero(
            R.string.hero6_name,
            R.string.hero_description6,
            R.drawable.android_superhero6
        )
    )
}