package com.bank.musicapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun BrowsePage(modifier: Modifier)
{
    LazyVerticalGrid(modifier = modifier.fillMaxSize(), columns = GridCells.Fixed(2))
    {
        items(BrowseItem)
        {
            BitemsLayout(it)
        }
    }
}

@Composable
fun BitemsLayout(Bite : Categorie)
{
    Card(modifier = Modifier.fillMaxSize().size(200.dp).border(4.dp, color = Color.Cyan).padding(8.dp))
    {
        Column(modifier = Modifier.fillMaxSize().padding(10.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally)
        {
            Text(Bite.name)
            Image(painterResource(Bite.res), contentDescription = Bite.name)
        }
    }
}