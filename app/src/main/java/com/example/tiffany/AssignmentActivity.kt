package com.example.tiffany

import android.annotation.SuppressLint
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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tiffany.ui.theme.TiffanyTheme

class AssignmentActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           assign()
        }
    }
}
@SuppressLint("SuspiciousIndentation")
@Preview(showBackground = true)
@Composable
fun assign() {
    LazyColumn {
        item {
            Box(
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
Row {
    Text(text = "Explore the world here",
       color = Color.White,
        fontWeight = FontWeight.Bold
    )
    Spacer(modifier = Modifier.width(20.dp))
    Text(text = "The best travel app in the world in 2021.",
                   color = Color.White,
        fontWeight = FontWeight.ExtraLight

        )
    Spacer(modifier = Modifier.width(20.dp))
    Text(text = "Answer of traveler to find their journey")

}
             val Button= LocalContext.current

                        Button(onClick = {
                            Button.startActivity(Intent(Button, AssignmentActivity::class.java))

                            /*TODO*/
                        }) {
                            Text(text = "Create an account")
             }

                 Spacer(modifier = Modifier.width(20.dp))
                      val tt = LocalContext.current
                   val rr= AnnotatedString("Already have an account")

                       ClickableText(text = rr, onClick = {
                           tt.startActivity(Intent(tt, AssignmentActivity::class.java))
                       })







                   }





            }
        }


    }






