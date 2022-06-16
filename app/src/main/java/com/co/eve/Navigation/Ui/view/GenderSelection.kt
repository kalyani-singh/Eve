package com.co.eve.Navigation.Ui

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.co.eve.Navigation.Ui.Component.NormalText
import com.co.eve.Navigation.Ui.Component.TitleText


@Composable
fun GenderSelection(navController: NavHostController? = null) {
    Column(
        Modifier
            .fillMaxSize()
            .padding(top = 24.dp)
            .background(Color(0xFFE7E6E9))
    ) {
        Text(
            text = "I am a",
            fontSize = 30.sp,
            color = Color(0xFF673AB7),
            fontFamily = FontFamily.Default,
            modifier = Modifier
                .padding(top = 70.dp, bottom = 12.dp, start = 30.dp, end = 20.dp)
        )
        TaskCard("FEMALE", navController)
        TaskCard("TRANS WOMAN", navController)
        TaskCard("MALE", navController)
        TaskCard("CONTINUE", navController)
    }
}

@Composable
fun TaskCard(task: String, navController: NavHostController? = null) {
    Card(
        elevation = 4.dp,
        shape = RoundedCornerShape(25.dp),
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .padding(top = 30.dp,bottom = 10.dp, start =20.dp, end =20.dp)
            .clickable {
                navController?.navigate("genderSelected?item=$task")
            }
    ) {
        Row(
            modifier = Modifier.background(Color(0xFFE7E6E9)),
            horizontalArrangement = Arrangement.Center,

        ) {

            Text(
                text = task,
                fontSize = 20.sp,
                color = Color(0xFF75717E),
                fontFamily = FontFamily.Serif,
                modifier = Modifier
                    .padding(top = 10.dp, bottom = 10.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GenderSelectionPreview() {
    GenderSelection()
}