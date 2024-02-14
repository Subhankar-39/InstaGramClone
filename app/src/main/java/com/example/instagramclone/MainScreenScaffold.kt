package com.example.instagramclone

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.outlined.Add
import androidx.compose.material.icons.outlined.ArrowForward
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.instagramclone.ui.theme.lobster
import com.example.instagramclone.ui.theme.mylogoFont

class MainScreenScaffold {
    @OptIn(ExperimentalMaterial3Api::class)
    //@Preview
    @Composable
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    fun MyScaffold(navController : NavController) {
        Scaffold(
            topBar = {
                // Transparent TopAppBar with title and two icons
                TopAppBar(
                    title = {
                        Text(
                            text = "Instagram",
                            color = Color.White,
                            fontFamily = lobster,
                            fontSize = 30.sp
                        )
                    },
                    colors = TopAppBarDefaults.mediumTopAppBarColors(
                        containerColor = Color.Black,
                        titleContentColor = Color.White
                    ),
                    actions = {
                        IconButton(onClick = { /* Handle action icon 1 click */ }) {
                            Icon(
                                Icons.Outlined.FavoriteBorder,
                                contentDescription = "favourite",
                                tint = Color.White
                            )
                        }
                        IconButton(onClick = { /* Handle action icon 2 click */ }) {
                            Icon(
                                Icons.Outlined.ArrowForward,
                                contentDescription = "Settings",
                                tint = Color.White
                            )
                        }
                    }
                )
            },
            bottomBar = {
                // Transparent BottomAppBar with 5 icons
                BottomAppBar(
                    contentColor = Color.White,
                    containerColor = Color.Black
                ) {
                    Row(
                        modifier = Modifier
                            .padding(5.dp)
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceEvenly
                    ) {
                        IconButton(onClick = {}) {
                            Icon(
                                Icons.Default.Home,
                                contentDescription = "Home",
                                tint = Color.White,
                                modifier = Modifier.weight(1f)
                            )
                        }
                        IconButton(onClick = {}) {
                            Icon(
                                Icons.Outlined.Search,
                                contentDescription = "Search",
                                tint = Color.White,
                                modifier = Modifier.weight(1f)
                            )
                        }
                        IconButton(onClick = {}) {
                            Icon(
                                Icons.Outlined.Add,
                                contentDescription = "add",
                                tint = Color.White,
                                modifier = Modifier.weight(1f)
                            )
                        }
                        IconButton(onClick = {}) {
                            Icon(
                                Icons.Default.PlayArrow,
                                contentDescription = "Video",
                                tint = Color.White,
                                modifier = Modifier.weight(1f)
                            )
                        }
                        IconButton(onClick = {}) {
                            Icon(
                                Icons.Default.Person,
                                contentDescription = "Person",
                                tint = Color.White,
                                modifier = Modifier.weight(1f)
                                    .clickable {
                                        navController.navigate("profile")
                                    }
                            )
                        }
                    }
                }
            },
            content = {
               status_slider().statusSlider()

            }
        )
    }


}