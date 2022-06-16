package com.co.eve.Navigation.Ui

import android.widget.Toast
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.co.eve.Navigation.Ui.Component.TitleText

@Composable
fun GenderSelected(navController: NavHostController? = null, item: String? = null) {
    val context = LocalContext.current
    Toast.makeText(context, item, Toast.LENGTH_LONG).show()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(12.dp)
    ) {
        TitleText(title = "Task Details")
        LazyColumn{
            var i = 0
            items((0..5).toList()){
                TaskCard("Detail Item ${++i}")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GenderSelectedPreview(){
    GenderSelected()
}