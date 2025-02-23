package com.pedroabreudev.superapp.presentation.screens.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.pedroabreudev.superapp.presentation.components.AppToolbar
import com.pedroabreudev.superapp.presentation.components.BannerContent
import com.pedroabreudev.superapp.presentation.ui.theme.whiteColor

@Composable
fun HomeScreen() {
    Scaffold(
        topBar = {
            AppToolbar()
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .wrapContentSize(Alignment.TopStart)
                .background(whiteColor)
                .padding(innerPadding)
        ) {
            BannerContent(
                title = "Hello world",
                description = "This is a Description",
                imageUrl = "https://www.jrebel.com/sites/default/files/image/2021-01/what%20is%20kotlin%20banner%20image.png"
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun HomeScreenPreview() {
    HomeScreen()

}