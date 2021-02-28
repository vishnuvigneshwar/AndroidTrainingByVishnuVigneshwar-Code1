package com.sguit.trainingapp1.rest;

import com.sguit.trainingapp1.rest.data.login.LoginIp;
import com.sguit.trainingapp1.rest.data.login.ProfileData;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface ApiInterface {

    @POST("login")
    Call<ProfileData> loginUser(@Body LoginIp login);


    @GET("profile")
    Call<ProfileData> getProfile(@Header("Authorization") String authHeader,@Header("companyid") int companyid);
}
