package com.example.qurbatechtask.ui.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.qurbatechtask.R
import com.example.qurbatechtask.data.model.Post

@Composable
fun HomeItem(post: Post){
    Column() {
        Row(modifier = Modifier
            .fillMaxSize()
            .padding(10.dp)){
            Image(
                painter = painterResource(id = post.profilePicture),
                contentDescription = null,
                modifier = Modifier
                    .clip(CircleShape)
                    .size(60.dp)
                    .padding(6.dp)
            )
            Column(modifier = Modifier.padding(6.dp)) {
                Row(){
                    Text(post.profileName.toString(),
                        color = colorResource(id = R.color.app_text_color),fontWeight = FontWeight.Bold)
                    Icon(painter = painterResource(id = post.icon), contentDescription = null,
                        modifier = Modifier.padding(start = 6.dp), tint = colorResource(id = R.color.blue))
                    Icon(painter = painterResource(id = R.drawable.ic_options), contentDescription = null,
                        modifier = Modifier.padding(start = 160.dp), tint = colorResource(id = R.color.blue))

                }
                Text(post.date.toString(),color = colorResource(id = R.color.grey))
            }
        }
        Text(post.description.toString(),modifier = Modifier.padding(16.dp),color = colorResource(id = R.color.app_text_color))
        Image(painter = painterResource(id = post.image),contentDescription = null,
            contentScale = ContentScale.FillWidth, modifier = Modifier.fillMaxWidth())
        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp) ,
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Box(contentAlignment = Alignment.CenterStart) {
                Row {
                    Text(post.likes.toString(),color = colorResource(id = R.color.app_text_color),
                        fontWeight = FontWeight.Bold)
                    Icon(painter = painterResource(id = R.drawable.ic_like), contentDescription = null,
                         modifier = Modifier.padding(start = 4.dp), tint = colorResource(id = R.color.blue))
                }
            }
            Box() {
                Row {
                    Text(post.comments.toString(),color = colorResource(id = R.color.app_text_color)
                        ,fontWeight = FontWeight.Bold)
                    Icon(painter = painterResource(id = R.drawable.ic_comment), contentDescription = null,
                        modifier = Modifier.padding(start = 4.dp), tint = colorResource(id = R.color.blue))
                }
            }
            Box(contentAlignment = Alignment.CenterEnd) {
                Row {
                    Text(post.shares.toString(),color = colorResource(id = R.color.app_text_color)
                        ,fontWeight = FontWeight.Bold)
                    Icon(painter = painterResource(id = R.drawable.ic_share), contentDescription = null,
                        modifier = Modifier.padding(start = 4.dp), tint = colorResource(id = R.color.blue))
                }
            }
        }
    }
}

@Composable
@Preview
fun HomeItemPreview() {
    HomeItem(Post.getDummyPosts()[0])
}