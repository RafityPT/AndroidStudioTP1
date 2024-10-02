package com.example.greetingcard

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.greetingcard.ui.theme.GreetingCardTheme
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GreetingCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("onCreate", "onCreateAinda")
                    Log.d("TAG", "Error 1")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, from: String, modifier: Modifier = Modifier) {
    Column (verticalArrangement = Arrangement.Center,
            modifier = modifier.padding(18.dp)) {
        Text(
                text = "$name!",
                fontSize = 50.sp,
                lineHeight = 11.sp,
                color = Color.Red,
                modifier = modifier //.padding(14.dp)
            )
        Text(
            text = "$from",
            fontSize = 40.sp,
            lineHeight = 11.sp,
            color = Color.Gray,
            modifier = modifier //.padding(14.dp)
        )
    }
}

@Preview(showBackground = false)
@Composable
fun GreetingPreview() {
    GreetingCardTheme {
        Greeting("olaa", "alo1")
    }
}