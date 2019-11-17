package com.weblab.service.retrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient
{

    //replace for your server
    private static final String API_BASE_URL = "http://localhost:8080/weblab/";

    private static Retrofit retrofit = null;

    public static Retrofit getApiClient()
    {
        if (retrofit == null)
        {
            retrofit = new Retrofit.Builder()
                    .baseUrl(API_BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
