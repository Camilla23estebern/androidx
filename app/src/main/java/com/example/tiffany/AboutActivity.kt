package com.example.tiffany

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tiffany.ui.theme.TiffanyTheme

class AboutActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            About ()


                }
            }
        }

@Preview(showBackground = true) 
@Composable
fun About () {
    Column (
        modifier = Modifier
            .background(color = Color.White)
            .fillMaxSize()
            .padding(15.dp),




    ){


    }

    val home = LocalContext.current
    Button(onClick = {
        home.startActivity(Intent(home, MainActivity::class.java))
    },
        border = BorderStroke(2.dp, Color.Magenta),
        shape = CutCornerShape(10)



        ) {

        Text(text = "Main Page")

    }
    Spacer(modifier = Modifier.height(30.dp))

    val tt = LocalContext.current
    val rr = AnnotatedString("Click here to go home")

    ClickableText(text = rr, onClick =  {
        tt.startActivity(Intent(tt, MainActivity::class.java))

    })
//       Text(text = "cryter4hy66", modifier = Modifier.clickable {
//        tt.startActivity(Intent(tt, MainActivity::class.java))
//    })



            




}




