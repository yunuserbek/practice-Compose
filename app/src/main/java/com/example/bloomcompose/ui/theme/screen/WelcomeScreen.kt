package com.example.bloomcompose.ui.theme.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.bloomcompose.R

@Composable
fun WelcomeScreen(){
    androidx.compose.material.Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colors.primary
    ) {

     background()
    }

}
@Composable
fun background(){
    Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
        Box(modifier = Modifier.fillMaxSize()){
            Image(
                modifier =Modifier,painter = painterResource(id = R.drawable.bloom1), contentDescription =null, contentScale =ContentScale.FillHeight  )
        }


    }
}