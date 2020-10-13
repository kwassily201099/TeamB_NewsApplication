package com.example.newsappinkotlin.Model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName


@Entity(
    tableName = "news"
)

data class News (
    @PrimaryKey val id: Int,
    @SerializedName("author") var author :String?,
    @SerializedName("title") var title :String?,
    @SerializedName("description") var description :String?,
    @SerializedName("url") var url :String?,
    @SerializedName("urlToImage") var image :String?
)