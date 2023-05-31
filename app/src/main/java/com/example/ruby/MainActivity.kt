package com.example.ruby

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ruby.ui.theme.RubyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RubyTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Column(modifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally)
    {
        Text(text = "作者:資管二A 陳柔涵")
        Image(
            painter = painterResource(id = R.drawable.map),
            contentDescription = "map",
            alpha = 0.7f,
            modifier = Modifier
        )
    }
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Canvas(
            modifier = Modifier
                .size(90.dp)

        ) {
            drawRect(
                color = Color.Blue,
                topLeft = Offset(-100f, -230f),
                size = Size(40f, 40f)
            )
            drawRect(
                color = Color.Blue,
                topLeft = Offset(690f, 450f),
                size = Size(40f, 40f)
            )
        }
    }
}
@Composable
fun SecondScreen(onBackPressed: () -> Unit) {
    // 在這裡放置第二個視窗的內容
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text("第二個視窗")
        Button(
            onClick = onBackPressed,
            modifier = Modifier.padding(top = 16.dp)
        ) {
            Text("返回")
        }
    }
}




    @Preview(showBackground = true)
    @Composable
    fun DefaultPreview() {
        RubyTheme {
            Greeting("Android")
        }
    }