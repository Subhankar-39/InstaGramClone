package com.example.instagramclone

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.outlined.Add
import androidx.compose.material.icons.outlined.AddCircle
import androidx.compose.material.icons.outlined.ArrowForward
import androidx.compose.material.icons.outlined.Face
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material.icons.outlined.Menu
import androidx.compose.material.icons.outlined.PlayArrow
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material.icons.outlined.ThumbUp
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.instagramclone.ui.theme.lobster
import com.google.android.material.tabs.TabItem

class profileScreenScaffold {
    @OptIn(ExperimentalMaterial3Api::class)
    @Preview
    @Composable
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    fun MyProfileScaffold() {
        Scaffold(
            topBar = {
                // Transparent TopAppBar with title and two icons
                TopAppBar(
                    title = {
                        Text(
                            text = "Tony_Stark_08",
                            color = Color.White,
                            fontFamily = FontFamily.SansSerif,
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
                                Icons.Outlined.AddCircle,
                                contentDescription = "favourite",
                                tint = Color.White
                            )
                        }
                        IconButton(onClick = { /* Handle action icon 2 click */ }) {
                            Icon(
                                Icons.Outlined.Menu,
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
                            )
                        }
                    }
                }
            },
            content = {
                //status_slider().statusSlider()
                Column(modifier= Modifier
                    .fillMaxSize()
                    .background(Color.Black)
                    .padding(top = 70.dp)
                    ) {
                    Row(modifier = Modifier.fillMaxWidth()) {
                        Box(modifier = Modifier.padding(start = 8.dp)) {
                            Column {
                                Box(modifier = Modifier
                                    .clickable { }
                                    .padding(start = 9.dp)) {
                                    Image(
                                        painter = painterResource(id = R.drawable.tonystark),
                                        contentDescription = "Tony Stark",
                                        modifier = Modifier
                                            .size(100.dp)
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
                                    text = "Tony_Stark_08",
                                    color = Color.White,
                                    modifier = Modifier.padding(start = 16.dp),
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 16.sp
                                )
                                Text(
                                    text = "Avenger",
                                    color = MaterialTheme.colorScheme.primary,
                                    modifier = Modifier.padding(start = 16.dp),
                                    fontSize = 16.sp

                                )
                                Text(
                                    text = "Tony_Stark_08",
                                    color = Color.White,
                                    modifier = Modifier.padding(start = 16.dp),
                                    fontSize = 16.sp
                                )
                            }
                        }
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(top = 30.dp),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                modifier = Modifier.weight(1f)
                            ) {
                                Text(
                                    text = "149",
                                    color = Color.White,
                                    fontSize = 16.sp,
                                    fontWeight = FontWeight.Bold
                                )
                                Text(text = "posts", color = Color.White, fontSize = 16.sp)
                            }
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                modifier = Modifier.weight(1f)
                            ) {
                                Text(
                                    text = "140 k",
                                    color = Color.White,
                                    fontSize = 16.sp,
                                    fontWeight = FontWeight.Bold
                                )
                                Text(text = "followers", color = Color.White, fontSize = 16.sp)
                            }
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                modifier = Modifier.weight(1f)
                            ) {
                                Text(
                                    text = "12",
                                    color = Color.White,
                                    fontSize = 16.sp,
                                    fontWeight = FontWeight.Bold
                                )
                                Text(text = "following", color = Color.White, fontSize = 16.sp)
                            }

                        }
                    }
                    Row {
                        Button(
                            onClick = { /*TODO*/ },
                            modifier = Modifier
                                .clip(RoundedCornerShape(30.dp))
                                .padding(16.dp)
                                .width(200.dp)
                                .weight(1f),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = MaterialTheme.colorScheme.onSurface
                            )
                        ) {
                            Text(text = "Edit Profile")

                        }
                        Button(
                            onClick = { /*TODO*/ },
                            modifier = Modifier
                                .clip(RoundedCornerShape(10.dp))
                                .padding(16.dp)
                                .width(200.dp)
                                .weight(1f),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = MaterialTheme.colorScheme.onSurface
                            )
                        ) {
                            Text(text = "Share Profile")

                        }
                    }
                    Row {
                    Box(modifier = Modifier
                        .padding(start = 16.dp)
                        .clickable { }) {
                        Column {
                            Image(
                                painter = painterResource(id = R.drawable.photo_03),
                                contentDescription = "Tony Stark",
                                modifier = Modifier
                                    .size(80.dp)
                                    .clip(CircleShape)
                                    .border(
                                        2.dp,
                                        Color.LightGray
                                    )

                            )
                            Text(
                                text = "Love",
                                color = Color.White,
                                modifier = Modifier.align(Alignment.CenterHorizontally)
                            )
                        }
                    }
                    Box(modifier = Modifier
                        .padding(start = 16.dp)
                        .clickable { }) {
                        Column {
                            Icon(imageVector =Icons.Outlined.Add , contentDescription ="",
                                modifier= Modifier
                                    .clip(CircleShape)
                                    .size(80.dp)
                                    .border(2.dp, Color.LightGray, CircleShape),
                                tint = Color.White)
                            Text(
                                text = "New",
                                color = Color.White,
                                modifier = Modifier.align(Alignment.CenterHorizontally)
                            )
                        }
                    }
                }
                    val tabs = listOf(
                        TabItem(title = "Tab 1", icon = Icons.Outlined.Face),
                        TabItem(title = "Tab 2", icon = Icons.Outlined.PlayArrow),
                        TabItem(title = "Tab 3", icon = Icons.Outlined.ThumbUp)
                    )
                    var selectedTabIndex by remember { mutableStateOf(0) }

                    TabbedNavigation(
                        tabs = tabs,
                        selectedTabIndex = selectedTabIndex,
                        onTabSelected = { newIndex ->
                            selectedTabIndex = newIndex
                        }
                    )

                    // Content for each tab based on selectedTabIndex
                    when (selectedTabIndex) {
                        0 -> {
                            photoPost()
                        }
                        1 -> {
                            noPost()
                        }
                        2 -> {
                            noPost()
                        }
                    }
                }


            }
        )
    }

    @Composable
    private fun photoPost() {
        LazyVerticalGrid(columns = GridCells.Fixed(3), content ={
            item {
                Image(painter = painterResource(id = R.drawable.photo_03), contentDescription ="" )
            }
            item {
                Image(painter = painterResource(id = R.drawable.photo_01), contentDescription ="" )
            }
            item {
                Image(painter = painterResource(id = R.drawable.photo_04), contentDescription ="" )
            }
            item {
                Image(painter = painterResource(id = R.drawable.tonystark), contentDescription ="" )
            }
            item {
                Image(painter = painterResource(id = R.drawable.photo_02), contentDescription ="" )
            }
            items(10){
                Image(painter = painterResource(id = R.drawable.photo_03), contentDescription ="" )
            }
        } )
    }

    @Composable
    fun TabbedNavigation(
        tabs: List<TabItem>,
        selectedTabIndex: Int,
        onTabSelected: (Int) -> Unit
    ) {
        TabRow(
            selectedTabIndex = selectedTabIndex,
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
                .background(Color.Black),
            containerColor = Color.Black,
            contentColor = Color.White
        ) {
            tabs.forEachIndexed { index, tab ->
                Tab(
                    selected = selectedTabIndex == index,
                    onClick = { onTabSelected(index) },
                    icon = {
                        tab.icon?.let { icon ->
                            Icon(
                                imageVector = icon,
                                contentDescription = tab.title,
                                modifier=Modifier.size(20.dp)
                            )
                        }
                    }
                )
            }
        }
    }

    data class TabItem(
        val title: String,
        val icon: ImageVector? = null // ImageVector for the icon
    )

    @Composable
    fun noPost(){
        Column(modifier=Modifier, verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
            Icon(imageVector =Icons.Outlined.Add , contentDescription ="",
                modifier= Modifier
                    .clip(CircleShape)
                    .size(80.dp)
                    .border(2.dp, Color.LightGray, CircleShape),
                tint = Color.White)
            Text(text = "No Posts Yet", fontSize = 40.sp, color = Color.White)
        }
    }

}
