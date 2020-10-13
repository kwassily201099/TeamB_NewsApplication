package com.example.newsappinkotlin.db
import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.newsappinkotlin.Model.News

@Database(
    entities = [News::class],
    version = 1,
    exportSchema = false
)

abstract class NewsDatabase : RoomDatabase() {


    companion object{
        @Volatile
         var newsDataBase: NewsDatabase? = null
         fun getDataBase(context: Context): NewsDatabase{
             if (newsDataBase == null)
                 newsDataBase =
                     Room.databaseBuilder(context, NewsDatabase::class.java, "NewsDB")
                         .build()

             return newsDataBase!!



         }

    }

    abstract fun getNewsDaoImpl(): NewsDao

}