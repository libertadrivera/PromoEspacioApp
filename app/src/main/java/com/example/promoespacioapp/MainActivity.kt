package com.example.promoespacioapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.promoespacioapp.presentation.login.LoginScreen
import com.example.promoespacioapp.presentation.login.LoginViewModel
import com.example.promoespacioapp.presentation.menu.MenuViewModel
import com.example.promoespacioapp.ui.theme.PromoEspacioAppTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

         val loginViewModel: LoginViewModel by viewModels()
        val menuViewModel: MenuViewModel by viewModels()

        setContent {
            PromoEspacioAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    LoginScreen(loginViewModel)
                    if(!loginViewModel.state.token_data?.token.isNullOrEmpty())
                         {menuViewModel}
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    PromoEspacioAppTheme {
        Greeting("Android")
    }
}