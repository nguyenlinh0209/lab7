package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material.*
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable

import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color


import androidx.compose.ui.text.style.TextAlign


import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import com.example.myapplication.ui.theme.MyApplicationTheme
import com.example.myapplication.ui.theme.greenColor


class MainActivity : ComponentActivity() {
    @SuppressLint("UnrememberedMutableState")
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                Surface(
                    // on below line we are specifying modifier and color for our app
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    // on the below line we are specifying
                    // the theme as the scaffold.

                    // on below line we are specifying theme as scaffold.
                    Scaffold(
                        // in scaffold we are specifying top bar.
                        topBar = {
                            // inside top bar we are specifying background color.
                            TopAppBar(backgroundColor = greenColor,
                                // along with that we are specifying title for our top bar.
                                title = {
                                    // in the top bar we are specifying tile as a text
                                    Text(
                                        // on below line we are specifying
                                        // text to display in top app bar.
                                        text = "Image From URL",

                                        // on below line we are specifying
                                        // modifier to fill max width.
                                        modifier = Modifier.fillMaxWidth(),

                                        // on below line we are
                                        // specifying text alignment.
                                        textAlign = TextAlign.Center,

                                        // on below line we are
                                        // specifying color for our text.
                                        color = Color.White
                                    )
                                }
                            )
                        }
                    )
                    { innerPadding ->
                        Text(
                            modifier = Modifier.padding(innerPadding),
                            text = "Cap nhat du lieu."
                        )
                        // on below line we are calling
                        // method to display UI
                        imageFromURL()
                    }


                }
            }
        }
    }

    @Composable
    fun imageFromURL() {
        // on below line we are creating a column,
        Column(
            // in this column we are adding modifier
            // to fill max size, mz height and max width
            modifier = Modifier
                .fillMaxSize()
                .fillMaxHeight()
                .fillMaxWidth()
                // on below line we are adding
                // padding from all sides.
                .padding(10.dp),
            // on below line we are adding vertical
            // and horizontal arrangement.
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // on below line we are adding image for our image view.
            Image(
                // on below line we are adding the image url
                // from which we will  be loading our image.
                painter = rememberAsyncImagePainter("https://www.elle.vn/wp-content/uploads/2016/06/29/dien-vien-viet-nam-trien-vong-1.jpg"),

                // on below line we are adding content
                // description for our image.
                contentDescription = "gfg image",

                // on below line we are adding modifier for our
                // image as wrap content for height and width.
                modifier = Modifier
                    .wrapContentSize()
                    .wrapContentHeight()
                    .wrapContentWidth()
            )
        }
    }
}