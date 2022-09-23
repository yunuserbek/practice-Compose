package com.example.bloomcompose.ui.theme.componet

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.ScaffoldState
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import java.lang.reflect.Modifier

@Composable
fun CustomScaffold(
    modifier: androidx.compose.ui.Modifier,
    scaffoldState: ScaffoldState = rememberScaffoldState(),
    topBar: @Composable () -> Unit  ={},
    bottomBar: @Composable () -> Unit={},
    content: @Composable (PaddingValues) -> Unit={},
    backgroundColor: Color = MaterialTheme.colors.background
) {
    Scaffold(
        modifier = modifier,
        scaffoldState = scaffoldState,
        topBar = topBar,
        bottomBar = bottomBar,
        backgroundColor = backgroundColor,
        content = content
    )
}