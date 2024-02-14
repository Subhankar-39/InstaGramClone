package com.example.instagramclone

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.outlined.Edit
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material.icons.outlined.Send
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class my_Contents {
    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun myConetnts(){
        var isComment = remember {
            mutableStateOf("")
        }
        Column(modifier = Modifier.padding(top = 16.dp)) {
            Column(modifier = Modifier.padding(start = 16.dp)) {
                Row(modifier = Modifier.fillMaxWidth()) {
                    Image(
                        painter = painterResource(id = R.drawable.tonystark),
                        contentDescription = "Tony Stark",
                        modifier = Modifier
                            .size(40.dp)
                            .clip(CircleShape)
                            .clickable { }
                    )
                    Column(modifier = Modifier.height(40.dp)) {
                        Text(
                            text = "Tony_Stark_08",
                            color = Color.White,
                            modifier = Modifier
                                .padding(start = 16.dp)
                                .weight(1f)
                                .clickable { }
                        )
                        Text(
                            text = "Tony_Stark_08",
                            color = Color.White,
                            fontSize = 12.sp,
                            modifier = Modifier
                                .padding(start = 16.dp)
                                .weight(1f)
                                .clickable { }
                        )
                    }
                    Box(modifier = Modifier,)
                    Icon(
                        imageVector = Icons.Default.MoreVert,
                        contentDescription = "",
                        modifier = Modifier
                            .padding(start = 185.dp, top = 2.dp)
                            .clickable { },
                        tint = Color.White
                    )
                }
            }

            Image(painter = painterResource(id = R.drawable.photo_03), contentDescription = "",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(400.dp)
                    .padding(start = 4.dp, end = 4.dp, bottom = 10.dp)
                    .clickable { })

            interact()
            Row {
                Text(
                    text = "16,657 likes", color = Color.White,
                    modifier = Modifier.padding(start = 16.dp, top = 4.dp))
            }
            Row {
                Text(
                    text = "Tony_Stark_08", color = Color.White, fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(start = 16.dp, top = 4.dp))
                Text(
                    text = "feel happy with sun ", color = Color.White,
                    modifier = Modifier.padding(start = 6.dp, top = 4.dp))
            }
            Row {
                Text(
                    text = "View all 7 comments", color = Color.LightGray,
                    modifier = Modifier.padding(start = 16.dp, top = 4.dp))
            }

        }
    }

    @Composable
    fun interact() {
        Row(modifier= Modifier.fillMaxWidth()){
            Icon(imageVector = Icons.Outlined.FavoriteBorder, contentDescription ="like",
                modifier= Modifier
                    .clickable { }
                    .padding(start = 16.dp, end = 10.dp)
                    .size(30.dp), tint = Color.White
            )
            Icon(imageVector = Icons.Outlined.Edit, contentDescription ="like",
                modifier= Modifier
                    .clickable { }
                    .padding(end = 10.dp)
                    .size(30.dp), tint = Color.White)
            Icon(imageVector = Icons.Outlined.Send, contentDescription ="like",
                modifier= Modifier
                    .clickable { }
                    .padding(end = 10.dp)
                    .size(30.dp), tint = Color.White)
        }
    }
    @Preview
    @Composable
    fun containScreen() {
        LazyColumn(content = {
            item {
                myConetnts()
            }
            item {
                myConetnts()
            }
        })

    }
}