package com.example.acheivementsk.data.model


import com.google.gson.annotations.SerializedName

data class WrappedAchievementsResponseModel(
    @SerializedName("data")
    val `data`: List<Data?>?
)