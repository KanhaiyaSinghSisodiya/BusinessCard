package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
                    Spacer(modifier = Modifier.height(170.dp))
                    CenterPart()
                    Spacer(modifier = Modifier.height(170.dp))
                    LowerPart()
                }
            }
        }
    }
}

@Composable
fun CenterPart() {
    Column(Modifier.padding(16.dp), horizontalAlignment = Alignment.CenterHorizontally){
        Image(painter = painterResource(id = R.drawable.luffy), contentDescription = null, Modifier.height(150.dp))
        Text(text = "Monkey D. Luffy", fontSize = 32.sp, fontWeight = FontWeight.W300)
        Text(text = "Straw Hat Pirates", fontSize = 15.sp, color = colorResource(id = R.color.grn))
    }
}

@Composable
fun LowerPart() {
    Column(Modifier.padding(16.dp), horizontalAlignment = Alignment.CenterHorizontally){
        Detail("+11 (12345) 444 555 666", R.drawable.baseline_call_24)
        Detail(text = "straw.hat@onepiece.com", jk = R.drawable.baseline_email_24)
        Detail("+11 (12345) 444 555 666", R.drawable.baseline_call_24)

    }
}

@Composable
fun Detail(text: String, @DrawableRes jk: Int) {
    Row {
        Icon(painter = painterResource(id = jk), contentDescription = null, tint = colorResource(id = R.color.grn))
        Spacer(modifier = Modifier.width(16.dp))
        Text(text = text)
    }
}

@Preview
@Composable
fun cntrPreview() {
    CenterPart()
}