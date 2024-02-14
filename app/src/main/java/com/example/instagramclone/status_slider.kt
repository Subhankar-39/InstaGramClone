package com.example.instagramclone

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.outlined.Edit
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material.icons.outlined.Send
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class status_slider {
    @OptIn(ExperimentalMaterial3Api::class)
    @Preview
    @Composable
    fun statusSlider() {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Black)
                .padding(top = 70.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            LazyRow(modifier = Modifier, horizontalArrangement = Arrangement.SpaceBetween) {
                item {
                    Box(modifier = Modifier.padding(end = 16.dp, start = 8.dp)) {
                        Column {
                            Box(modifier = Modifier.clickable { }) {
                                Image(
                                    painter = painterResource(id = R.drawable.tonystark),
                                    contentDescription = "Tony Stark",
                                    modifier = Modifier
                                        .size(80.dp)
                                        .clip(CircleShape)
                                )
                                IconButton(
                                    onClick = { /*TODO*/ }, modifier = Modifier
                                        .clip(CircleShape)
                                        .size(25.dp)
                                        .background(Color.Blue)
                                        .align(Alignment.BottomEnd)
                                ) {
                                    Icon(
                                        imageVector = Icons.Default.Add,
                                        contentDescription = "",
                                        tint = Color.White,
                                    )
                                }
                            }
                            Text(
                                text = "my story",
                                color = Color.LightGray,
                                modifier = Modifier.align(Alignment.CenterHorizontally)
                            )
                        }
                    }
                }
                item {
                    Box(modifier = Modifier.padding(end = 16.dp)) {
                        Column {
                            Image(
                                painter = painterResource(id = R.drawable.photo_04),
                                contentDescription = "Tony Stark",
                                modifier = Modifier
                                    .size(80.dp)
                                    .clip(CircleShape)
                                    .border(
                                        4.dp,
                                        Brush.linearGradient(
                                            listOf(
                                                Color.Red,
                                                Color.Yellow,
                                                Color.Red,
                                                Color.Magenta
                                            )
                                        ),
                                        CircleShape
                                    ),
                                //contentScale = ContentScale.Crop
                            )
                            Text(
                                text = "inshan",
                                color = Color.White,
                                modifier = Modifier.align(Alignment.CenterHorizontally)
                            )
                        }
                    }
                }
                item {
                    Box(modifier = Modifier
                        .padding(end = 16.dp)
                        .clickable { }) {
                        Column {
                            Image(
                                painter = painterResource(id = R.drawable.photo_03),
                                contentDescription = "Tony Stark",
                                modifier = Modifier
                                    .size(80.dp)
                                    .clip(CircleShape)
                                    .border(
                                        4.dp,
                                        Brush.linearGradient(
                                            listOf(
                                                Color.Red,
                                                Color.Yellow,
                                                Color.Red,
                                                Color.Magenta
                                            )
                                        ),
                                        CircleShape
                                    ),
                            )
                            Text(
                                text = "ashis",
                                color = Color.White,
                                modifier = Modifier.align(Alignment.CenterHorizontally)
                            )
                        }
                    }
                }
                item {
                    Box(modifier = Modifier
                        .padding(end = 16.dp)
                        .clickable { }) {
                        Column {
                            Image(
                                painter = painterResource(id = R.drawable.photo_01),
                                contentDescription = "Tony Stark",
                                modifier = Modifier
                                    .size(80.dp)
                                    .clip(CircleShape)
                                    .border(
                                        4.dp,
                                        Brush.linearGradient(
                                            listOf(
                                                Color.Red,
                                                Color.Yellow,
                                                Color.Red,
                                                Color.Magenta
                                            )
                                        ),
                                        CircleShape
                                    ),
                            )
                            Text(
                                text = "inshan",
                                color = Color.White,
                                modifier = Modifier.align(Alignment.CenterHorizontally)
                            )
                        }
                    }
                }
                item {
                    Box(modifier = Modifier
                        .padding(end = 16.dp)
                        .clickable { }) {
                        Column {
                            Image(
                                painter = painterResource(id = R.drawable.photo_02),
                                contentDescription = "Tony Stark",
                                modifier = Modifier
                                    .size(80.dp)
                                    .clip(CircleShape)
                                    .border(
                                        4.dp,
                                        Brush.linearGradient(
                                            listOf(
                                                Color.Red,
                                                Color.Yellow,
                                                Color.Red,
                                                Color.Magenta
                                            )
                                        ),
                                        CircleShape
                                    ),
                            )
                            Text(
                                text = "peter",
                                color = Color.White,
                                modifier = Modifier.align(Alignment.CenterHorizontally)
                            )
                        }
                    }
                }
                item {
                    Box(modifier = Modifier
                        .padding(end = 16.dp)
                        .clickable { }) {
                        Column {
                            Image(
                                painter = painterResource(id = R.drawable.photo_03),
                                contentDescription = "Tony Stark",
                                modifier = Modifier
                                    .size(80.dp)
                                    .clip(CircleShape)
                                    .border(
                                        4.dp,
                                        Brush.linearGradient(
                                            listOf(
                                                Color.Red,
                                                Color.Yellow,
                                                Color.Red,
                                                Color.Magenta
                                            )
                                        ),
                                        CircleShape
                                    ),
                            )
                            Text(
                                text = "inshan",
                                color = Color.White,
                                modifier = Modifier.align(Alignment.CenterHorizontally)
                            )
                        }
                    }
                }


            }

            //photoes and videos
            my_Contents().containScreen()
        }
    }
}