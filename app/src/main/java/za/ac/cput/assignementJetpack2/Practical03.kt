package za.ac.cput.assignementJetpack2

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import za.ac.cput.assignementJetpack2.ui.theme.AssignementJetpack2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AssignementJetpack2Theme {
                var show: MutableState<Boolean> = remember { mutableStateOf(false) }
                ShowDialog(visible = show)

                var m =TextView("Welcome to My Jetpack Compose Journey" )
                main(m)
                Column(
                    verticalArrangement= Arrangement.SpaceEvenly,
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.fillMaxSize()
                ) {
                    Image(painter = painterResource(id = R.drawable.fr), contentDescription = null,
                        modifier = Modifier.width(500.dp).height(480.dp))
                    val context= LocalContext.current
                    Button(onClick = {
                        show.value=true},
                        border= BorderStroke(10.dp, Color.LightGray),
                        contentPadding = PaddingValues(16.dp),
                        modifier = Modifier.size(width = 330.dp,height = 80.dp).background(Color.White),

                    ) {

                        Icon(

                            imageVector = Icons.Filled.Info,
                            contentDescription = "Info description",
                            Modifier.padding(end = 5.dp)
                        )
                        Text(text = "Info",
                            style= MaterialTheme.typography.body1,
                            modifier= Modifier.padding(2.dp))
                    }

                    Box()

                    {
                        Button(onClick = {
                            val navigate= Intent(this@MainActivity, Practical02::class.java)
                            startActivity(navigate)
                        },

                            border= BorderStroke(10.dp, color = Color.LightGray),
                            contentPadding = PaddingValues(16.dp),
                            modifier = Modifier.size(width = 350.dp,height = 70.dp).background(Color.White),

                            ) {

                            Icon(
                                imageVector = Icons.Filled.Person,
                                contentDescription = "Info person",
                                Modifier.padding(end = 5.dp))

                            Text(text = "Start Journey \n", fontSize = 22.sp)
                        }
                    }
            }
        }
    }
}
data class TextView(var title:String)

@Composable
fun main(text: TextView)
{
    Column(modifier= Modifier
        .background(Color.White)
        ){
        Text(text ="${text.title}",
            color= Color.Blue,
            style= MaterialTheme.typography.body1,
            modifier = Modifier
                .fillMaxSize()
                .padding(10.dp), textAlign = TextAlign.Center)}
}

@Composable
fun ShowDialog(visible: MutableState<Boolean>)
{

    if(visible.value){
        AlertDialog(
            onDismissRequest = { visible.value=false },

            confirmButton = {
                TextButton(onClick = {visible.value=false}) {
                    Text(text = "Back")
                }
            },
            title = { Text(text = "My Journey")},
            text = { Text(text = "My journey thus far has been a long and hard one because I registered on the March 3rd and was extremely behind with both lectures and assignments.\n" +
                    "\n" +
                    "As I was catching up with Mobile Programming II lectures, I realized through the lecture's explanations and through my individual coding practice that Kotlin is not that different from Java and that through the library Jetpack compose, building Android applications have become shorter and must faster. Its performance is great.\n" +
                    "\n" +
                    "As a third year student, I have learnt a lot and I aspire even more as I continue to walk on this Jetpack compose journey.",
                      textAlign = TextAlign.Justify)
            }
        )

    }}}
