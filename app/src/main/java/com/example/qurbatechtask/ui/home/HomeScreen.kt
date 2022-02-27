package com.example.qurbatechtask.ui.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.qurbatechtask.R
import com.example.qurbatechtask.data.model.Post

@Composable
fun HomeScreen() {
    HomeItems(items = Post.getDummyPosts())
}

@Composable
fun HomeItems(items: List<Post>){
    LazyColumn{
        item{
            SearchItem()
        }
        itemsIndexed(items = items){ _, item ->
            HomeItem(post = item)
        }
    }
}

@Composable
fun SearchItem(){
    Row(modifier = Modifier
        .fillMaxSize()
        .padding(10.dp)){
        Image(
            painter = painterResource(id = R.drawable.img_third_p_p),
            contentDescription = null,
            modifier = Modifier
                .clip(CircleShape)
                .size(60.dp)
                .padding(6.dp)
        )
        var textFieldState by remember {
            mutableStateOf("")
        }
        OutlinedTextField(
            modifier = Modifier
                .width(400.dp)
                .padding(6.dp),
            value = textFieldState,
            onValueChange = {
                textFieldState = it
            },
            placeholder = {
                Text(text = "Share your food experiences")
            },
            shape = RoundedCornerShape(24.dp),
        )
    }
}

@Composable
@Preview
fun HomeScreenPreview() {
    HomeScreen()
}