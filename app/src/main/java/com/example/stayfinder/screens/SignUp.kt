package com.example.stayfinder.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.Icon
import androidx.compose.material3.Label
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.stayfinder.R

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun SignUpScreen() {
    Row(
        modifier = Modifier.fillMaxWidth()
            .padding(35.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Start


    ){
        Icon(
            imageVector = Icons.Default.ArrowBack,
            contentDescription = null,
            Modifier.padding(start = 20.dp)

        )
        Text(
            text = "Sign Up",
            fontSize = 15.sp,
            modifier = Modifier.padding(start = 100.dp)
        )


    }
    var email by remember { mutableStateOf("") }
    OutlinedTextField(
        modifier = Modifier.padding(10.dp),
        leadingIcon ={
            Icon(
                imageVector = Icons.Default.Email,
                contentDescription = null

            )

        },
        value = email,
        Label(
            label ={
                Text(

                )
            }
        )



    )


}
