package com.example.newsappinkotlin.db
import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.newsappinkotlin.Model.News


@Dao
interface NewsDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertNews(news: List<News>)


    @Query("SELECT * FROM News")
    fun getAllNews(): List<News>


}


