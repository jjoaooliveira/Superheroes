package com.jjoaooliveira.superheroes

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Shapes
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp

import com.jjoaooliveira.superheroes.model.Hero
import com.jjoaooliveira.superheroes.model.HeroesDataSource.heroes

@Composable
fun HeroesList() {
    LazyColumn(
        contentPadding = PaddingValues(16.dp)
    ){
       items(heroes) {
           HeroItem(hero = it)
       }
    }
}

@Composable
fun HeroItem(
    hero: Hero,
    modifier: Modifier = Modifier
) {
    Card(
        modifier
            .fillMaxWidth()
            .padding(bottom = 8.dp),
        shape = MaterialTheme.shapes.medium,
        elevation = 2.dp,

    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .padding(16.dp)

        ) {
            HeroInformation(hero = hero)
            HeroImage(hero = hero)
        }
    }
}

/**
 * Composable responsável por trazer as informações de cada heroi
 *
 * @param hero recebe um objeto Hero
 */
@Composable
fun HeroInformation(
    hero: Hero,
    modifier: Modifier = Modifier
) {
    Column {
        Text(
            text = stringResource(id = hero.name),
            style = MaterialTheme.typography.h2
        )
        Text(
            text = stringResource(id = hero.heroDescription),
            style = MaterialTheme.typography.body1
        )
    }
}

/**
 *
 */

@Composable
fun HeroImage(
    hero: Hero,
    modifier: Modifier = Modifier
) {
    Image(
        painter = painterResource(id = hero.heroImage),
        contentDescription = null,
        modifier
            .size(72.dp)
            .clip(MaterialTheme.shapes.small),
        contentScale = ContentScale.Crop,
    )
}