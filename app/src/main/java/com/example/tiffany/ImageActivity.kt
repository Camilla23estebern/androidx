package com.example.tiffany

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.tiffany.ui.theme.TiffanyTheme

class ImageActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TiffanyTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    Images()


                }
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun  Images() {
    Column (){
        Image(painter = painterResource(id = R.drawable.portfoli),
            contentDescription = "",
            modifier = Modifier
                .size(300.dp),
            colorFilter = ColorFilter.tint(Color.Magenta)
        )
        Text(text = "Click here")


        AsyncImage(
            model = "https://assets.vogue.com/photos/660dbf54d98aad88cdd24e39/1:1/w_1280%2Cc_limit/1059157466",
            contentDescription = null,
        )





    }

}



