package com.sguit.trainingapp1.rest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {
    static final String new_BASE_URL = "http://eparkapi.sguit.com/api/";
    private static OkHttpClient httpClient = new OkHttpClient();
    static Gson gson = new GsonBuilder()
            .setLenient()
            .create();

    private static Retrofit.Builder builder =
            new Retrofit.Builder()
                    .baseUrl(new_BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create(gson));
    public static  <S> S createService(Class<S> serviceClass) {
        Retrofit retrofit = builder.client(httpClient).build();

        return retrofit.create(serviceClass);
    }

    private static Retrofit.Builder builderTest =
            new Retrofit.Builder()
                    .baseUrl(new_BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create());
    public static  <S> S createServiceTest(Class<S> serviceClass) {
        Retrofit retrofit = builderTest.client(httpClient).build();
        return retrofit.create(serviceClass);
    }

}
