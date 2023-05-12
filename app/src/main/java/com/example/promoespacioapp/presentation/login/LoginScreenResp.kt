package com.example.promoespacioapp.presentation.login



import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.runtime.*
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.promoespacioapp.R
import com.example.promoespacioapp.domain.model.UserToken
import com.example.promoespacioapp.ui.theme.BlueBackground
import com.example.promoespacioapp.ui.theme.Purple200
import com.example.promoespacioapp.ui.theme.WhiteFont

/*
@Composable
fun LoginScreen(loginViewModel: LoginViewModel){

    Box(
        Modifier
            .fillMaxSize()
            .padding(8.dp)
            .background(color = BlueBackground)
    ){
        HeaderLogin()
        BodyLogin(
            Modifier.align(Alignment.Center), loginViewModel
        )
    }
}

@Composable
fun BodyLogin(modifier: Modifier, loginViewModel: LoginViewModel) {


    val user_email :String by loginViewModel.user_email.observeAsState(initial = "")
    val password :String by loginViewModel.password.observeAsState(initial = "")
    val  isValidUserAndPassword :Boolean by loginViewModel.isValidUserAndPassword.observeAsState(initial = false)
    val usertoken :String by loginViewModel.usertoken.observeAsState(initial = "")
    val state = loginViewModel.state


    Column(modifier = modifier) {
         Spacer(modifier = Modifier.size(16.dp))
        LoginTitle(Modifier.align(Alignment.Start))
        Spacer(modifier = Modifier.size(8.dp))
        UserEmail(user_email) {
            loginViewModel.onLoginChanged(user_email=it, password=password)
        }
        Spacer(modifier = Modifier.size(4.dp))
        Password(password = password ){
            loginViewModel.onLoginChanged(user_email= user_email,password=it)
        }
        Spacer(modifier = Modifier.size(8.dp))
        ForgotPassword(Modifier.align(Alignment.End))
        Spacer(modifier = Modifier.size(8.dp))
        LoginButton (Modifier.align(Alignment.CenterHorizontally), isValidUserAndPassword, loginViewModel)

        //if(loginViewModel.state.isLoading!!)  LoadingWheel()
    }
}

@Composable
fun LoginButton( modifier: Modifier, loginEnable: Boolean, loginViewModel: LoginViewModel) {
        Button(
                modifier = modifier,
                onClick = {  loginViewModel.doLogin("","")
                   },
                shape = RoundedCornerShape(5.dp),
                border = BorderStroke(1.dp, Color.White),
                enabled = loginEnable,
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = BlueBackground,
                    disabledBackgroundColor = Purple200,
                    contentColor =  WhiteFont,
                    disabledContentColor =  WhiteFont
                )

        )
                {
            Text(
                text= stringResource(R.string.login_button),
                fontSize = 12.sp,
                fontWeight = FontWeight.Bold
                //,color = WhiteFont
            )
        }

}


@Composable
fun LoginTitle(modifier: Modifier) {
    Text(
        text= stringResource(R.string.login),
        fontSize = 18.sp,
        fontWeight = FontWeight.Bold,
        color = Color(0xFFE3EBFE),
        modifier = modifier
    )
}

@Composable
fun ForgotPassword(modifier: Modifier) {
    Text(
        text= stringResource(R.string.forgot_password),
        fontSize = 12.sp,
        color = WhiteFont,
        modifier = modifier
    )
}

@Composable
fun UserEmail(user_email: String, onTextChanged: (String) -> Unit) {
    TextField(value = user_email,
        onValueChange = {onTextChanged(it)},
        modifier = Modifier
            .fillMaxWidth()
            .padding(5.dp)
            .border(1.dp, Color.White, RoundedCornerShape(3.dp)),
        shape = RoundedCornerShape(5.dp),

                placeholder = { Text(
                                    text = stringResource(R.string.user_email_placeholder),
                                    color = Color.Gray
                                    )},
        maxLines = 1,
        singleLine = true,
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
        colors = TextFieldDefaults.textFieldColors(
                        textColor = WhiteFont,
                        focusedIndicatorColor = Color.Transparent,
                        unfocusedIndicatorColor = Color.Transparent)


    )
}

    @Composable
    fun Password(password: String, onTextChanged: (String) -> Unit) {
        var passwordVisibility by remember { mutableStateOf(false)}

        TextField(
            value = password,
            onValueChange = {onTextChanged(it)},
            modifier = Modifier
                .fillMaxWidth()
                .padding(5.dp)
                .border(1.dp, Color.White, RoundedCornerShape(3.dp)),
            placeholder = { Text(
                text = stringResource(R.string.password),
                color = Color.Gray
            )},
            maxLines = 1,
            singleLine = true,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            colors = TextFieldDefaults.textFieldColors(
                textColor = WhiteFont,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent),
            trailingIcon = {
                val imagen = if(passwordVisibility){
                    Icons.Filled.VisibilityOff
                }else {
                    Icons.Filled.Visibility
                }
                IconButton(onClick = { passwordVisibility = !passwordVisibility  }) {
                        Icon(imageVector = imagen, contentDescription = stringResource(R.string.content_descrip_password), tint= WhiteFont)
                }
            },
            visualTransformation = if(passwordVisibility){
                VisualTransformation.None
            } else{
                PasswordVisualTransformation()
            }
        )
    }

@Composable
fun ImageHeader(){
    Image( painter = painterResource(id = R.drawable.logo_promo_espacio), contentDescription = "logo")
}


@Composable
fun HeaderLogin() {
    ImageHeader()
}

@Composable
fun LoadingWheel(){
    Box(modifier = Modifier
        .fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        CircularProgressIndicator(
            color = Color.Black
        )
    }
}


*/


