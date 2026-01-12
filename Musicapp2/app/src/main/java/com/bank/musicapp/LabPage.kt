package com.bank.musicapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun LibPage(modifier: Modifier)
{
    LazyColumn(modifier = modifier.fillMaxSize()
        .padding(8.dp)) {
        items(LibItem)
        {
            LibItemLayout(it)
        }
    }
}

@Composable
fun LibItemLayout(lib : Categorie)
{
    Row(modifier = Modifier.fillMaxWidth().padding(10.dp),
        horizontalArrangement =Arrangement.SpaceBetween)
    {
        Row {
            Image(painter = painterResource( lib.res), contentDescription = lib.name)
            Text(text = lib.name)
        }
        Icon(Icons.AutoMirrored.Filled.ArrowForward, contentDescription = "For")
    }
    Divider(modifier = Modifier.fillMaxWidth(), thickness = 2.dp)
}