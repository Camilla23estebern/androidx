package com.example.tiffany

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tiffany.ui.theme.TiffanyTheme

class TestActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           travel()
        }
    }
}
@Preview(showBackground = true)
@Composable
fun travel() {
    LazyColumn {
        item {
            Column(
                modifier = Modifier
                    .background(color = Color.LightGray)
                    .fillMaxSize()
                    .padding(15.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Row {

                    val about = LocalContext.current

                    Button(
                        onClick = {
                            about.startActivity(Intent(about, AssignmentActivity::class.java))
                        },
                        colors = ButtonDefaults.buttonColors(Color.White),
                        border = BorderStroke(2.dp, Color.White),
                        shape = CutCornerShape(10)


                    ) {
                        Icon(painter = painterResource(id = R.drawable.b),
                            contentDescription ="",
                            modifier = Modifier
                                .size(width = 20.dp,
                                    height =20.dp)
                        )

                        Text(
                            text = "Hotels",
                            color = Color.Black
                        )
                    }
                    Spacer(modifier = Modifier.width(20.dp))
                    val main = LocalContext.current

                    Button(
                        onClick = {
                            main.startActivity(Intent(about, AssignmentActivity::class.java))


                        },
                        colors = ButtonDefaults.buttonColors(Color.Blue),
                        border = BorderStroke(2.dp, Color.White),
                        shape = CutCornerShape(10),


                        ) {

                        Icon(painter = painterResource(id = R.drawable.a),
                            contentDescription ="",
                            modifier = Modifier
                                .size(width = 20.dp,
                                    height =20.dp)
                        )
                        Text(
                            text = "Holiday",
                            color = Color.Black
                        )
                    }
                }
                Spacer(modifier = Modifier.width(40.dp))

                Row {
                    val rr = LocalContext.current

                    Button(
                        onClick = {
                            rr.startActivity(Intent(rr, AssignmentActivity::class.java))

                            /*TODO*/
                        },
                        colors = ButtonDefaults.buttonColors(Color.White),
                        border = BorderStroke(2.dp, Color.White),
                        shape = CutCornerShape(10)


                    ) {
                        Icon(painter = painterResource(id = R.drawable.a),
                            contentDescription ="",
                            modifier = Modifier
                                .size(width = 20.dp,
                                    height =20.dp)
                        )
                        Text(
                            text = "Taxi",
                            color = Color.Black
                        )
                    }
                    Spacer(modifier = Modifier.width(20.dp))
                    val dd = LocalContext.current

                    Button(
                        onClick = {
                            dd.startActivity(Intent(dd, AssignmentActivity::class.java))

                            /*TODO*/
                        },
                        colors = ButtonDefaults.buttonColors(Color.White),
                        border = BorderStroke(2.dp, Color.White),
                        shape = CutCornerShape(10)


                    ) {
                        Icon(painter = painterResource(id = R.drawable.b),
                            contentDescription ="",
                            modifier = Modifier
                                .size(width = 20.dp,
                                    height =20.dp)
                        )
                        Text(
                            text = "Ticket",
                            color = Color.Black
                        )


                    }

                }

                Spacer(modifier = Modifier.width(40.dp))

                Row {
                    Spacer(modifier = Modifier.width(20.dp))
                    val pp = LocalContext.current

                    Button(
                        onClick = {
                            pp.startActivity(Intent(pp, AssignmentActivity::class.java))

                            /*TODO*/
                        },
                        colors = ButtonDefaults.buttonColors(Color.White),
                        border = BorderStroke(2.dp, Color.White),
                        shape = CutCornerShape(10)


                    ) {
                        Icon(painter = painterResource(id = R.drawable.ae),
                            contentDescription ="",
                            modifier = Modifier
                                .size(width = 20.dp,
                                    height =20.dp)
                        )
                        Text(
                            text = "Airplane",
                            color = Color.Black
                        )


                    }

                    Spacer(modifier = Modifier.width(20.dp))
                    val qq = LocalContext.current

                    Button(
                        onClick = {
                            qq.startActivity(Intent(qq, AssignmentActivity::class.java))
                        },
                        colors = ButtonDefaults.buttonColors(Color.White),
                        border = BorderStroke(2.dp, Color.White),
                        shape = CutCornerShape(10),

                        ) {
                        Icon(painter = painterResource(id = R.drawable.apicha),
                            contentDescription ="",
                            modifier = Modifier
                                .size(width = 20.dp,
                                    height =20.dp)
                        )
                        Text(
                            text = "Harbour",
                            color = Color.Black
                        )


                    }


                    Spacer(modifier = Modifier.width(40.dp))
                }
                Column {
                    Text(text = "Popular in town")
                    Spacer(modifier = Modifier.width(20.dp))
                    Text(text = "View all",
                        color = Color.Blue                        )
                }






            }


        }


    }
}
