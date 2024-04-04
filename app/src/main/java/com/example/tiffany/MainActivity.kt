package com.example.tiffany

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.currentCompositionLocalContext
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tiffany.ui.theme.TiffanyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Tuesday()
                }
            }
        }
    

@Preview(showBackground = true)
@Composable
fun Tuesday() {
   Column(
       modifier = Modifier
           .background(Color.Gray)
//            .fillMaxWidth()
//            .fillMaxHeight()
           .fillMaxSize(),

       horizontalAlignment = Alignment.CenterHorizontally,
//        verticalArrangement = Arrangement.Center

       ) {
       Row() {
           Text(text = "Main")
           Spacer(modifier = Modifier.width(20.dp))

           Text(text = "About")
           Spacer(modifier = Modifier.width(20.dp))

           Text(text = "Settings")
       }
       Text(
           "My First Android Project",
           color = Color.Yellow,
           fontFamily = FontFamily.Monospace,
           fontSize = 37.sp
       )

       Text("Project is projecting", fontFamily = FontFamily.Cursive, fontSize = 37.sp)
       Text(
           text = "So about the screen.....",
           fontSize = 37.sp,
           modifier = Modifier
               .background(Color.White)
       )

       Text("What about Kafka", color = Color.Green, fontSize = 37.sp)
       val about = LocalContext.current

       Button(onClick = {
           about.startActivity(Intent(about, AboutActivity::class.java))

           /*TODO*/
       }) {
           Text(text = "About Screen")

       }

       val image = LocalContext.current
       Button(onClick = {
           image.startActivity(Intent(about, AboutActivity::class.java))
           /*TODO*/
       }) {
           Text(text = "NEXT")

       }

       val inp = LocalContext.current
       Text(text = "input",
       modifier = Modifier
           .clickable {
               inp.startActivity(Intent(inp, PichaActivity::class.java))
           }

       )

       val ff = LocalContext.current
       Text(text = "click here",
           modifier = Modifier
               .clickable {
                   inp.startActivity(Intent(inp, WebActivity::class.java))
               }

       )





       }

       }



