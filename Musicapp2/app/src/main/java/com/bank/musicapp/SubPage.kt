package com.bank.musicapp

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.Divider
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SubPage(modifier: Modifier) {

    Column(modifier = modifier.fillMaxSize().padding(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally)
    {
        Text("Manage Subscription")
        Row(modifier= Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween)
        {
            Column()
            {
                Text("Musical",
                    fontStyle = FontStyle.Italic,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp)
                Text("Free trial")
            }
            TextButton(onClick = {})
            {
                Row {
                    Text(
                        "See All Plans",
                        color = Color.Cyan
                    )
                    Icon(Icons.AutoMirrored.Filled.ArrowForward,"Plans")
                }
            }
        }
        Card(modifier = Modifier.fillMaxWidth().padding(top = 20.dp), elevation = CardDefaults.cardElevation(
            defaultElevation = 8.dp
        ))
        {
            Row(
                horizontalArrangement = Arrangement.Start)
            {
                Icon(Icons.Default.AccountBox,"Get Plan")
                Text("Get Plan",
                    fontSize = 10.sp)
            }
        }
        Divider()
    }
}