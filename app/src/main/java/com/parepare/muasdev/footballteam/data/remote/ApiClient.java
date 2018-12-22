package com.parepare.muasdev.footballteam.data.remote;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.parepare.muasdev.footballteam.adapter.Contract;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {

    static Retrofit getClient(){
        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();

        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient.Builder builder = new OkHttpClient.Builder();

        builder.addInterceptor(loggingInterceptor);

        Gson gson = new GsonBuilder().setLenient().create();

        return new Retrofit.Builder().baseUrl(Contract.BASE_URL).addConverterFactory(GsonConverterFactory.create(gson)).client(builder.build()).build();
    }
}
