package com.example.tentativan1001;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public interface UserApi {
        @GET("1")
        Call<List<User>> getUsers();

}
