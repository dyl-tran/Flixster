package com.example.project3

import com.google.gson.annotations.SerializedName

class Movie {

    @JvmField
    @SerializedName("original_title")
    var title: String? = null

    @SerializedName("overview")
    var description: String? = null

    //bookImageUrl
    @SerializedName("poster_path")
    var movieImageUrl: String? = null

}