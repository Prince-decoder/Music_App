package com.bank.musicapp

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun toppbar(title: String,
           action:()-> Unit)
{
    TopAppBar(title = { Text(text =title) },
        modifier = Modifier.fillMaxWidth(),
        colors = TopAppBarDefaults.topAppBarColors(colorResource(R.color.Mytop)),
        navigationIcon = {
            IconButton(onClick = {
                action()
            })
            {
                if(title == "My App")
                Icon(imageVector = Icons.Default.Menu, contentDescription = "Menu")
                else
                Icon(imageVector = Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Menu")
            }
        })
}