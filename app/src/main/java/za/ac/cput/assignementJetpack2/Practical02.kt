package za.ac.cput.assignementJetpack2

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.Color.Companion.Blue
import androidx.compose.ui.graphics.Color.Companion.LightGray
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.location.GnssStatusCompat
import za.ac.cput.assignementJetpack2.ui.theme.AssignementJetpack2Theme

class Practical02 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
                   Column(
                       modifier = Modifier.background(Black)
                   ) {
                       title()

                Column(modifier = Modifier
                    .fillMaxSize()
                    .background(Black),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,

                    )
                {

                    IT()

                    Button(onClick = {
                        val navigate= Intent(this@Practical02,MainActivity::class.java)
                        startActivity(navigate)
                    },

                        border= BorderStroke(10.dp, color = LightGray),
                        contentPadding = PaddingValues(16.dp),
                        modifier = Modifier
                            .size(width = 350.dp, height = 70.dp)
                            .background(White),

                        ) {
                        Text(text = "Back\n", fontSize = 18.sp)
                    }

                    }
                }
            }}
        }

    @Composable
    fun IT() {

        Column(

        ) {

            Text(
                buildAnnotatedString {
                    withStyle(style = SpanStyle(color = Blue)) {
                        withStyle(style = SpanStyle(color = White,fontSize = 25.sp)) {
                            append("\n Names: Franck L. Kalengayi \n")
                        }
                        withStyle(
                            style = SpanStyle(
                                fontWeight = FontWeight.Normal,
                                color = White,
                                fontSize = 24.sp
                            )
                        ) {

                            append("\n Faculty: Informatics and Design \n")
                        }
                        withStyle(
                            style = SpanStyle(
                                fontWeight = FontWeight.Medium,
                                color = White,
                                fontSize = 24.sp
                            )
                        ) {
                            append("\n Department: Information Technology\n")
                        }

                        withStyle(
                            style = SpanStyle(
                                fontWeight = FontWeight.Medium,
                                color = White,
                                fontSize = 24.sp
                            )
                        ) {
                            append("\n Course: Application Development\n")
                        }
                        withStyle(
                            style = SpanStyle(
                                fontWeight = FontWeight.Medium,
                                color = White,
                                fontSize = 24.sp
                            )
                        ) {
                            append("\n Student Number: 220048762")
                        }
                    }
                }
            )

        }
        Column(
            Modifier
                .padding(100.dp),
            verticalArrangement = Arrangement.spacedBy(24.dp)

        ) {
            Spacer(modifier = Modifier.width(23.2.dp))
            Button(onClick = {

            },

                border= BorderStroke(10.dp, color = LightGray),
                contentPadding = PaddingValues(16.dp),
                modifier = Modifier
                    .size(width = 350.dp, height = 70.dp)
                    .background(White),

                ) {
                Text(text = "Current Modules", fontSize = 18.sp)
            }
        }
    }
@Composable
fun title(){

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.background(Black)
    ) {

        Text(text = "               My Details", color = White, fontWeight = FontWeight.Bold
            ,modifier = Modifier.padding(all = 1.6.dp), textAlign = TextAlign.Center,fontSize = 33.sp
            )
    }
}