package com.bank.musicapp

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun AccountPage(modifier: Modifier)
{
    Column(modifier = modifier.fillMaxSize()
            .padding(16.dp))
    {
        Row(modifier = Modifier.fillMaxWidth().padding(5.dp).clickable(onClick = {})
        , horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.Top)
        {
            Row {
                Icon(
                    imageVector = Icons.Default.AccountCircle,
                    "Profile"
                )
                Spacer(modifier = Modifier.width(6.dp))
                Column(modifier = Modifier.padding(8.dp))
                {
                    Text("helow")
                    Text("how are you")
                }
            }
            IconButton(onClick = {})
            {
                Icon(imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,"Details")
            }
        }
        Spacer(modifier = Modifier.height(8.dp))
        Row(modifier= Modifier.fillMaxWidth())
        {
            Icon(painter = painterResource( R.drawable.outline_music_note_24),"Music")

            Text("My music")
        }
    }
}

//@Preview(showSystemUi = true)
//@Composable
//fun demo()
//{
//    AccountPage()
//}