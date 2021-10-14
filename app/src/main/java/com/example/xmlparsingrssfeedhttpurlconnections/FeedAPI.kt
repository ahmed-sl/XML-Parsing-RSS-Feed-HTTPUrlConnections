package com.example.xmlparsingrssfeedhttpurlconnections

import com.example.xmlparsingrssfeedhttpurlconnections.model.Feed
import retrofit2.Call
import retrofit2.http.GET

interface FeedAPI {
    @get:GET("cats/.rss")
    val feed: Call<Feed?>?

    companion object {
        const val BASE_URL = "https://www.reddit.com/r/"
    }
}
