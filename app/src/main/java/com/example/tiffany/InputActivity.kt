package com.example.tiffany

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tiffany.ui.theme.TiffanyTheme

class InputActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           Input()
        }
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun Input() {
    Box (
        modifier = Modifier
            .fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.portfoli),
            contentDescription = "",
            modifier = Modifier
                .fillMaxSize(),
            contentScale = ContentScale.Crop
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(15.dp),
            horizontalAlignment = Alignment.CenterHorizontally

        ) {

            var name by remember {
                mutableStateOf(TextFieldValue(""))
            }
            OutlinedTextField(
                value = name,
                onValueChange = { name = it },
                label = { Text(text = "Input name") },
                textStyle = TextStyle(Color.Black),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    unfocusedBorderColor = Color.Black,
                    focusedBorderColor = Color.Green,
                    unfocusedLabelColor = Color.Black,
                    focusedLabelColor = Color.Green,
                    cursorColor = Color.Red


                )
            )
//            LazyColumn() {
//                item {  }
//            }
//            or
//            LazyRow {
//                item {
//                    Row {
//
//                    }
//                }
//            }




            Spacer(modifier = Modifier.height(20.dp))
            var email by remember {
                mutableStateOf(TextFieldValue(""))
            }

            OutlinedTextField(
                value = email,
                onValueChange = { email = it },
                label = { Text(text = "Enter Email") },
                textStyle = TextStyle(Color.Black),
                leadingIcon = { Icon(imageVector = Icons.Default.Email , contentDescription = "" )},
                keyboardOptions = KeyboardOptions (keyboardType = KeyboardType.Text),
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    unfocusedBorderColor = Color.Black,
                    focusedBorderColor = Color.Green,
                    unfocusedLabelColor = Color.Black,
                    focusedLabelColor = Color.Green,
                    cursorColor = Color.Red,
                    unfocusedLeadingIconColor = Color.Black,
                    focusedLeadingIconColor = Color.Blue                   )
            )


            Spacer(modifier = Modifier.height(20.dp))
            var password by remember {
                mutableStateOf(TextFieldValue(""))
            }
            OutlinedTextField(
                value = password,
                onValueChange = { password = it },
                label = { Text(text = "Password") },
                textStyle = TextStyle(Color.Black),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.NumberPassword),
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    unfocusedBorderColor = Color.Black,
                    focusedBorderColor = Color.Green,
                    unfocusedLabelColor = Color.Black,
                    focusedLabelColor = Color.Green,
                    cursorColor = Color.Red,
                    unfocusedLeadingIconColor = Color.Black,
                    focusedLeadingIconColor = Color.Blue
                )
            )
            Spacer(modifier = Modifier.height(20.dp))
            var phone by remember {
                mutableStateOf(TextFieldValue(""))
            }
            OutlinedTextField(
                value = password,
                onValueChange = { password = it },
                label = { Text(text = "phone") },
                textStyle = TextStyle(Color.Black),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone),
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    unfocusedBorderColor = Color.Black,
                    focusedBorderColor = Color.Green,
                    unfocusedLabelColor = Color.Black,
                    focusedLabelColor = Color.Green,
                    cursorColor = Color.Red,
                    unfocusedLeadingIconColor = Color.Black,
                    focusedLeadingIconColor = Color.Blue
                )

            )
            Spacer(modifier = Modifier.height(20.dp))
            val Submit = LocalContext.current

            Button(onClick = {
                Submit.startActivity(Intent(Submit, InputActivity::class.java))

                /*TODO*/
            }) {
                Text(text = "Submit")

            }














        }

            }


        }




    
    


