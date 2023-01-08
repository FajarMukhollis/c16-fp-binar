package com.c16.flywithme.data.remote

import com.c16.flywithme.data.request.BookingRequest
import com.c16.flywithme.data.request.HistoriesRequest
import com.c16.flywithme.data.request.LoginRequest
import com.c16.flywithme.data.request.RegisterRequest
import com.c16.flywithme.data.response.*
import retrofit2.*
import retrofit2.http.*

interface ApiService {

//    @FormUrlEncoded
    @POST("api/login")
    suspend fun loginUser(
    @Body loginRequest: LoginRequest,
//        @Field("email") email: String,
//        @Field("password") password: String
    ): Response<LoginResponse>

    @POST("api/register")
    suspend fun registerUser(
        @Body registerRequest: RegisterRequest,
    ) : Response<RegisterResponse>


    @GET("api/users/findById/{id}")
    fun detailUser(
        @Path("id") id: String
    ): Call<UserDetailResponse>

    @GET("api/airports/findAll")
    fun getAllAirports(): Call<AirportResponse>

    @GET("api/flights/findAll")
    fun getAllFlights(): Call<FlightResponse>

    @POST("api/bookings/add")
    fun addBooking(
        @Body bookingRequest: List<BookingRequest>
    ): Call<AddBookingResponse>

    @POST("api/Histories")
    fun histories(
        @Body historiesRequest: HistoriesRequest
    ): Call<HistoryResponse>
}