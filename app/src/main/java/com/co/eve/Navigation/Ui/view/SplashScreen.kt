package com.co.eve.Navigation.Ui


import android.annotation.SuppressLint
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.co.eve.Navigation.Ui.viewModel.EveViewModel
import kotlinx.coroutines.launch

@SuppressLint("CoroutineCreationDuringComposition")
@Composable
fun SplashScreen(navController: NavHostController? = null) {
    val scope = rememberCoroutineScope()
    val viewModel =EveViewModel()
    val context = LocalContext.current


    Column(
        Modifier
            .fillMaxSize()
            .padding(top = 24.dp)
            .background(Color(0xFF673AB7))
            .clickable {
                scope.launch{
                    viewModel.getGenderList()
                    Toast.makeText(context, "Fetching data success!", Toast.LENGTH_SHORT).show()
                }
                navController?.navigate("genderSelection")
            }
    ) {
        Text(
            text = "COTO",
            fontSize = 50.sp,
            color = Color.White,
            fontFamily = FontFamily.Cursive,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(top = 200.dp, bottom = 12.dp, start = 20.dp, end = 20.dp)
                .align(alignment = Alignment.CenterHorizontally))
        Text(
            text = "A World built on the ",
            fontSize = 30.sp,
            color = Color.White,
            fontFamily = FontFamily.Serif,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(top = 30.dp, bottom = 12.dp, start = 20.dp, end = 20.dp)
                .align(alignment = Alignment.CenterHorizontally))
        Text(
            text = "pillars of",
            fontSize = 30.sp,
            color = Color.White,
            fontFamily = FontFamily.Serif,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(top = 10.dp, bottom = 12.dp, start = 20.dp, end = 20.dp)
                .align(alignment = Alignment.CenterHorizontally))
        Text(
            text = "empowerment &",
            fontSize = 30.sp,
            color = Color.White,
            fontFamily = FontFamily.Serif,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(top = 10.dp, bottom = 12.dp, start = 20.dp, end = 20.dp)
                .align(alignment = Alignment.CenterHorizontally))
        Text(
            text = "sisterhood",
            fontSize = 30.sp,
            color = Color.White,
            fontFamily = FontFamily.Serif,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(top = 10.dp, bottom = 12.dp, start = 20.dp, end = 20.dp)
                .align(alignment = Alignment.CenterHorizontally))
    }



}


@Preview(showBackground = true)
@Composable
fun SplashScreenPreview() {
    SplashScreen()
}