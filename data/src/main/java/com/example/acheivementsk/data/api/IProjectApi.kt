package com.example.acheivementsk.data.api

import com.example.acheivementsk.data.model.WrappedAchievementsResponseModel
import retrofit2.http.GET

interface IProjectApi {


    @GET("/achievements")
    fun getAchievements():WrappedAchievementsResponseModel


}