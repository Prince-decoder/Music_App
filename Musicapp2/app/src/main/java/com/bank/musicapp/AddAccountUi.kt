package com.bank.musicapp

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun AddAcc(dialogopen: MutableState<Boolean>)
{
    if(dialogopen.value)
    {
        AlertDialog(
            onDismissRequest = {
                dialogopen.value= false
            },
            confirmButton = {
                Button(
                    onClick = {dialogopen.value= false},
                    colors = ButtonDefaults.buttonColors(containerColor = colorResource(R.color.Mytop))
                ) {
                    Text("Confirm")
                }
            },
            dismissButton = {
                Button(
                    onClick = {dialogopen.value= false},
                    colors = ButtonDefaults.buttonColors(containerColor = colorResource(R.color.Mytop))
                ) {
                    Text("Cancel")
                }
            },
            title = {Text("Account", fontSize = 20.sp)                    }
            , text = {
                Column(modifier = Modifier.fillMaxWidth())
                {
                    OutlinedTextField(value = "",onValueChange = {}, label ={Text("Name")})
                    OutlinedTextField(value = "",onValueChange = {}, label = {Text("Password")})
                }
            },
            modifier = Modifier.fillMaxWidth().background(MaterialTheme.colorScheme.background,
                shape = RoundedCornerShape(5.dp),

            )
        )
    }
}
