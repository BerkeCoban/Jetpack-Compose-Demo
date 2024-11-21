package com.berke.composedemo

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun DetailScreen() {

    // navcontroller.popbackstack()
    Card(
        modifier = Modifier.padding(10.dp),
        elevation =  CardDefaults.cardElevation(defaultElevation = 10.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color(0xFFF7F2F9),
        )
    ) {
        var expanded by rememberSaveable { mutableStateOf(false) }

        val smallString = "It consists of a reactive programming model with conciseness and ease of Kotlin programming language. It is fully declarative so that you can describe your UI by calling some series of functions that will transform your data into a UI hierarchy..."
        val expandedString = "It consists of a reactive programming model with conciseness and ease of Kotlin programming language. It is fully declarative so that you can describe your UI by calling some series of functions that will transform your data into a UI hierarchy. When the data changes or is updated then the framework automatically recalls these functions and updates the view for you.\n" +
                "\n" +
                "Composable Function is represented in code by using @Composable annotation to the function name. This function will let you define your app’s UI programmatically by describing its shape and data dependencies rather than focusing on the UI construction process. "
        Column(
            modifier = Modifier
                .padding(10.dp)
                .background(color = Color(0xFFF7F2F9))
        ) {
            Text(
                text = "Jetpack Compose",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
            )
            Text(
                text = "Modern UI toolkit  to build native Android UI", fontSize = 16.sp,
                modifier = Modifier.padding(top = 8.dp),
                fontWeight = FontWeight.Bold
            )

            Text(
                fontSize = 12.sp,
                modifier = Modifier.padding(top = 8.dp),
                text =  if (expanded) expandedString else smallString
            )

            ClickableText(
                modifier = Modifier.align(Alignment.End),
                text = if (expanded) AnnotatedString("Show less") else AnnotatedString("Show more"),
                onClick = {
                    expanded = !expanded
                })
        }
    }
}