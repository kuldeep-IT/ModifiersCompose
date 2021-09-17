 package com.peerbitskuldeep.modifiersincompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.peerbitskuldeep.modifiersincompose.ui.theme.ModifiersInComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                modifier = Modifier
                    .background(Color.Gray)
                    .fillMaxWidth()
                    .fillMaxHeight(0.5f)
                    .padding(top = 10.dp)
                    .border(5.dp, Color.Green)
                    .padding(10.dp)
                    .border(5.dp, Color.Blue)
                    .padding(10.dp)
                    .border(10.dp, Color.Red)
                    .padding(10.dp)


            ) {
                Text(text = "Hey", modifier = Modifier
                    .offset(10.dp ,20.dp)
                    .border(5.dp,Color.White)
                    .padding(5.dp)
                    .border(15.dp,Color.Yellow)
                    .padding(15.dp)
                    .clickable {

                    }
                    .background(Color.White)

                )

                            //left , top
                
                Spacer(modifier = Modifier.height(50.dp))
                
                Text(text = "Rudrax", Modifier.padding(start = 10.dp))
            }
        }
    }
}

