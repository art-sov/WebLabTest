package com.weblab.service.retrofit;

import com.weblab.model.User;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface ApiService
{

    @GET("register")
    Call<User> performRegistration(@Query("name") String name,
                                   @Query("email") String email,
                                   @Query("password") String password);

    @GET("login")
    Call<User> performUserLogin(@Query("email") String email,
                                @Query("password") String password);

    @POST("post")
    Call<Object> postData(@Body Object data);
}
