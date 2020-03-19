package com.adarsh.mykids.Retro;

import retrofit2.GsonConverterFactory;
import retrofit2.Retrofit;

public class Api_client {
    private static Retrofit retrofit = null;

    public static Retrofit ParentRegister() {
        retrofit = new Retrofit.Builder()
                .baseUrl("http://srishti-systems.info/projects/MyKids/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit;
    }
}