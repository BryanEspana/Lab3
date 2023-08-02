package com.example.app1
import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.app1.ui.theme.App1Theme

class MainActivity : ComponentActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContent {
            App1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.White
                ) {
                    TextPrincipal(name = "Bryan España", carne = "21550" )

                }
            }
        }
    }
}

@Composable
fun TextPrincipal(name: String, carne: String) {
        Surface(color = Color(0xFF10315F)) {
            Column {
                Text("Nombre: $name", style = TextStyle(color = Color.White, fontSize = 24.sp,), modifier = Modifier.padding(15.dp))
                Text("Carné: $carne", style = TextStyle(color = Color.White, fontSize = 18.sp), modifier = Modifier.padding(15.dp))
            }

        }



}

