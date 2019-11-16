package com.weblab.retrofit;

import com.weblab.model.User;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {

    @GET("register")
    Call<User> performRegistration(@Query("name") String name,
                                   @Query("email") String email,
                                   @Query("password") String password);

    @GET("login")
    Call<User> performUserLogin(@Query("email") String email,
                                @Query("password") String password);
}
