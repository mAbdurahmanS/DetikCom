package com.princeabdurrahman.detikcom.NewsAdapter

import com.princeabdurrahman.detikcom.R

data class news (var title: String, var desc:String, var detail: String, var photo: Int)

object NewsModel {
    val newslist = listOf<news>(
        news("contoh 1",
        "Detik.com | 1 jam yang lalu",
        "ini adalah hasil detail",
        R.drawable.img_news1),

        news("contoh 2",
            "Detik.com | 1 jam yang lalu",
            "ini adalah hasil detail 2",
            R.drawable.img_news2),

        news("contoh 3",
            "Detik.com | 1 jam yang lalu",
            "ini adalah hasil detail 3",
            R.drawable.img_news3),

        news("contoh 4",
            "Detik.com | 1 jam yang lalu",
            "ini adalah hasil detail 4",
            R.drawable.img_news4)
    )
}