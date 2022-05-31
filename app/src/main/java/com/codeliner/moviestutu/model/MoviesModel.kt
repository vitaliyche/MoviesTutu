package com.codeliner.moviestutu.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class MoviesModel(
    @SerializedName("copyright")
    val copyright: String,
    @SerializedName("has_more")
    val has_more: Boolean,
    @SerializedName("num_results")
    val num_results: Int,
    @SerializedName("results")
    val results: List<MovieResult>,
    @SerializedName("status")
    val status: String
): Serializable