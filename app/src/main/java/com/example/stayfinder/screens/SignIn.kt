package com.example.stayfinder.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.stayfinder.R

@Preview(showSystemUi = true, showBackground = true)
@Composable

fun SignInScreen() {
   Column(
      modifier = Modifier.fillMaxSize()
         .padding(top = 30.dp),
      verticalArrangement = Arrangement.Top,
      horizontalAlignment = Alignment.CenterHorizontally
   )
   {

      Row(
         Modifier.fillMaxWidth()
            .padding(8.dp),
         verticalAlignment = Alignment.CenterVertically,
         horizontalArrangement = Arrangement.Start

      )
      {
         Icon(
            imageVector = Icons.Default.ArrowBack,
            contentDescription = null,
            Modifier.padding(start = 20.dp)

         )
         Text("Sign in", modifier = Modifier.padding(start = 120.dp))

      }
      var email by remember { mutableStateOf("") }
      OutlinedTextField(
         modifier = Modifier.padding(10.dp),
         leadingIcon = {
            Icon(
               imageVector = Icons.Default.Email,
               contentDescription = null

            )

         },
         value = email,
         label = {
            Text("Email")

         },
         onValueChange = { newText ->
            email = newText
         }

      )
      var password by remember { mutableStateOf("") }
      OutlinedTextField(
         modifier = Modifier.padding(10.dp),
         leadingIcon = {
            Icon(
               imageVector = Icons.Default.Lock,
               contentDescription = null

            )

         },
         value = password,
         label = {
            Text("Password")

         },
         onValueChange = { newText ->
            password = newText
         }

      )
      Row(
         modifier = Modifier.padding(20.dp),
         horizontalArrangement = Arrangement.Start



      ){
         val checkState = remember { mutableStateOf(false) }
         Checkbox(
            checked = checkState.value,
            onCheckedChange = {
               checkState.value
            }
         )
         Text(
            "Remember me",

         )
         Spacer(
            Modifier.width(90.dp)
         )
         Text(
            "Forgot password?"
         )


      }
      Button(
         onClick = {

         }
      ){
         Text(
            "Sign In"
         )

      }
      Spacer(
         Modifier.padding(20.dp)
      )
      Row(
         modifier = Modifier.fillMaxSize()
            .padding(92.dp),

         horizontalArrangement = Arrangement.SpaceEvenly


      )
      {
         Image(
            painterResource(R.drawable.img),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
               .size(55.dp)



         )
         Spacer(
            modifier = Modifier.padding(35.dp)
         )

         Image(
            painterResource(R.drawable.img),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
               .size(55.dp)
         )
         Spacer(
            modifier = Modifier.padding(35.dp)
         )
         
         Image(
            painterResource(R.drawable.img),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
               .size(55.dp)
         )

      }


   }











   }
