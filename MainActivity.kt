package com.example.firstkotlin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.firstkotlin.ui.theme.FirstKotlinTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
                  MainBody()
            }
        }
    }
@Composable
fun MainBody(){
    Column(

        modifier = Modifier
            .fillMaxSize()
            .background(color= colorResource(R.color.white))
    ){
        Text("Hello",
            modifier = Modifier.fillMaxWidth(),
            style= TextStyle(
                fontSize = 40.sp,
                textDecoration = TextDecoration.Underline,
                color = Color.Yellow,
                fontStyle = FontStyle.Italic,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center
            ))
        Text("world")
        Image(
            painter = painterResource(R.drawable.tiger),
            contentDescription = null,
            modifier= Modifier.size(200.dp)
                .align(Alignment.CenterHorizontally)

        )
    }
}
@Preview
@Composable
fun MainPreview(){
    MainBody()
}