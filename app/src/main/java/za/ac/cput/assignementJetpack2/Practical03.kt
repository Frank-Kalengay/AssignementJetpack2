package za.ac.cput.assignementJetpack2

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ArrowBack
import androidx.compose.material.icons.outlined.Done
import androidx.compose.material.icons.outlined.ExitToApp
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat.startActivity
import za.ac.cput.assignementJetpack2.ui.theme.AssignementJetpack2Theme
import kotlin.system.exitProcess

class Practical03 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AssignementJetpack2Theme {
                var Crs1= Frank("Application Development Practice 3",
                    "Practical module", "1 year ")
                var Crs2= Frank("Application Development Theory 3",
                    "Theory module",
                    "1 year")
                var Crs3= Frank("ICT ElectiveS 3",
                    "Practical module", "Semester")
                var Crs4= Frank("Information Systems  3",
                    "Practical module", "1 year")
                var Crs5= Frank("Professional Practice 3",
                    "Theory module", "Semester")
                var Crs6= Frank("Project 3",
                    "Practical module", "1 year ")
                var Crs7= Frank("Project Management 3",
                    "Theory module", "Semester")
                var Crs8= Frank("Project Presentation3",
                    "Practical module", "1 year")

                val mod=listOf (Crs1,Crs2,Crs3,Crs4,Crs5,Crs6,Crs7,Crs8)
                Convesation(mod)
                            }
                        }
                    }
                }

                data class Frank(val moduleName:String, var moduleType: String, var moduleDuration: String)

                @Composable
                fun Greeting(module: Frank )
                {

                    Row() {

                        Image(painter = painterResource(id=R.drawable.books),
                            contentDescription ="book",
                            modifier = Modifier
                                .size(80.dp)

                        )

                        Spacer(modifier = Modifier.width(23.2.dp))

                        Column(modifier = Modifier.clickable {    })

                        {
                            Text(text = "${module.moduleName}",
                                color = Color.White,
                                style= MaterialTheme.typography.body1

                            )
                            Spacer(modifier = Modifier.width(14.2.dp))

                            Surface(shape = MaterialTheme.shapes.medium,
                                color = Color.Black, elevation = 800.dp) {
                                Text(text = "${module.moduleType}",style= MaterialTheme.typography.subtitle1,
                                    color = Color.White,
                                    modifier = Modifier.padding(all = 1.6.dp),
                                    maxLines = 1)
                            }

                            Spacer(modifier = Modifier.width(14.2.dp))

                            Surface(shape = MaterialTheme.shapes.medium,
                                color = Color.Black, elevation = 800.dp) {
                                Text(text = "${module.moduleDuration}",style= MaterialTheme.typography.subtitle2,
                                    color = Color.White,
                                    modifier = Modifier.padding(all = 1.6.dp),
                                    maxLines =  1)
                            }


                        }
                    }
                }
                @Composable
                fun Convesation (messages: List<Frank>)
                {

                    var visible: MutableState<Boolean> = remember { mutableStateOf(false) }
                    Alertt(setVisible= visible)
                    Column(
                        modifier = Modifier.background(color = Color.Black)
                    ) {

                        LazyColumn()
                        {
                            items(messages) { s -> Greeting(module = s) }
                        }
                        Button(
                            onClick = {

                            },
                            modifier = Modifier.paddingFromBaseline(top = 50.dp)
                                .size(width = 400.dp, height = 40.dp),
                            border = BorderStroke(5.dp, brush = SolidColor(Color.LightGray)),

                            colors = ButtonDefaults.buttonColors(backgroundColor = colorResource(id = R.color.purple_500))
                        )
                        {
                            Icon(
                                imageVector = Icons.Outlined.ArrowBack,
                                contentDescription = "Return",
                                modifier = Modifier.size(width = 40.dp, height = 60.dp)
                                    .background(color = Color.Transparent),

                                Color.White,
                            )

                            Text(text = "BACK", fontSize = 15.sp, color = Color.White)
                        }

                        Button(
                            onClick = {
                                visible.value = true
                            },
                            modifier = Modifier.paddingFromBaseline(top = 600.dp)
                                .size(width = 400.dp, height = 40.dp)
                                ,
                            border = BorderStroke(5.dp, brush = SolidColor(Color.LightGray)),

                            colors = ButtonDefaults.buttonColors(backgroundColor = colorResource(id = R.color.purple_500))
                        ) {
                            Icon(
                                imageVector = Icons.Outlined.ExitToApp,
                                contentDescription = "Exit",
                                modifier = Modifier.size(width = 40.dp, height = 40.dp)
                                    .background(color = Color.Transparent),

                                Color.White,
                            )

                            Text(text = "GOODBYE", fontSize = 15.sp, color = Color.White)

                        }
                    }

                    @Composable
                    fun DefaultPreview(){
                        AssignementJetpack2Theme{
                            var Crs1= Frank("Application Development Practice 3",
                                "Practical module", "1 year ")
                            var Crs2= Frank("Application Development Theory 3",
                                "Theory module",
                                "1 year")
                            var Crs3= Frank("ICT ElectiveS 3",
                                "Practical module", "Semester")
                            var Crs4= Frank("Information Systems  3",
                                "Practical module", "1 year")
                            var Crs5= Frank("Professional Practice 3",
                                "Theory module", "Semester")
                            var Crs6= Frank("Project 3",
                                "Practical module", "1 year ")
                            var Crs7= Frank("Project Management 3",
                                "Theory module", "Semester")
                            var Crs8= Frank("Project Presentation3",
                                "Practical module", "1 year")

                            val mod=listOf (Crs1,Crs2,Crs3,Crs4,Crs5,Crs6,Crs7,Crs8)
                            Convesation(mod)
                        }

                    }}
                @Composable
                fun Alertt(setVisible: MutableState<Boolean>)
                {
                    if(setVisible.value){
                        AlertDialog(
                            onDismissRequest = { setVisible.value=false },
                            dismissButton ={
                                TextButton(onClick = {setVisible.value=false}) {
                                    Text(text = "NO",color = Color.Black,style = MaterialTheme.typography.body1)
                                }
                            },

                            confirmButton = {
                                TextButton(onClick = { exitProcess(0) }) {
                                    Text(text = "YES",color = Color.Black,style = MaterialTheme.typography.body1)
                                }
                            },

                            text = { Text(text = "Do you want to exit?",color = Color.Black,style = MaterialTheme.typography.h6)}
                        )


                    }
                }




