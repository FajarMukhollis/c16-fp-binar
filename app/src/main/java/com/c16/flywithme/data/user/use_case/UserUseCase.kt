package com.c16.flywithme.data.user.use_case

import androidx.lifecycle.LiveData
import com.c16.flywithme.data.response.LoginResponse
import com.c16.flywithme.data.result.Result
import com.c16.flywithme.data.user.model.UserDetail
import com.c16.flywithme.data.user.model.UserRegister

interface UserUseCase {
    fun loginUser(email: String, pass: String): LiveData<Result<LoginResponse>>


//    fun getDetailUser(
//        id: String
//    ): LiveData<Result<UserDetail>>

    fun registerUser(
        email: String,
        firstName: String,
        lastName: String,
        nIK: Long,
        password: String,
        phoneNumber: String
    ):
            LiveData<Result<UserRegister>>
}