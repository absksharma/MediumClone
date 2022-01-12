package io.realworld.api.services

import io.realworld.api.models.entities.SignupData
import io.realworld.api.models.requests.LoginRequest
import io.realworld.api.models.responses.ArticlesResponse
import io.realworld.api.models.responses.UserResponse
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface ConduitAPI {
    @GET("articles")
    suspend fun getArticles(): Call<ArticlesResponse>

    @POST("users")
    suspend fun signupUser(@Body userCred: SignupData): Response<UserResponse>

    @POST("users")
    suspend fun loginUser(@Body userCred: LoginRequest): Response<UserResponse>

}