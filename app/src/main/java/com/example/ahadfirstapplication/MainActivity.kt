package com.example.ahadfirstapplication

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.ahadfirstapplication.ui.theme.AhadFirstApplicationTheme

class MainActivity : ComponentActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("MainActivityLifecycle", "onCreate: App is created") // 🔹 Added Log

        enableEdgeToEdge()
        setContent {
            AhadFirstApplicationTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("MainActivityLifecycle", "onStart: App is visible") // Logging onStart
    }

    override fun onResume() {
        super.onResume()
        Log.d("MainActivityLifecycle", "onResume: App is in foreground") // Logging onResume
    }

    override fun onPause() {
        super.onPause()
        Log.d("MainActivityLifecycle", "onPause: App is paused") // Logging onPause
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MainActivityLifecycle", "onDestroy: App is destroyed") // Logging onDestroy
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AhadFirstApplicationTheme {
        Greeting("Android")
    }
}
