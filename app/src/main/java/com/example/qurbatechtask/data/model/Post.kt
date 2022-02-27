package com.example.qurbatechtask.data.model

import com.example.qurbatechtask.R

data class Post(
    var profilePicture: Int,
    var profileName: String? = null,
    var date: String? = null,
    var icon: Int,
    var description: String? = null,
    var image: Int,
    var likes: String? = null,
    var comments: String? = null,
    var shares: String? = null
){
    companion object {
        fun getDummyPosts() : List<Post>{
            return listOf(
                Post(
                    R.drawable.img_first_p_p,
                    "Chicken Chester",
                    "2 days ago",
                    R.drawable.ic_food,
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam eros est, blandit eu nunc sit amet",
                    R.drawable.img_food,
                    "32K",
                    "597",
                    "12.3K"
                ),
                Post(
                    R.drawable.img_second_p_p,
                    "Rayna Rosser",
                    "2 days ago",
                    R.drawable.ic_official,
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam eros est, blandit eu nunc sit amet",
                    R.drawable.img_food,
                    "32K",
                    "597",
                    "12.3K"
                )
            )
        }
    }
}