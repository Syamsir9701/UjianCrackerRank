package com.juaracoding.ujiancracker.service;

import android.widget.SimpleCursorAdapter;

import com.google.android.gms.common.server.converter.StringToIntConverter;
import com.google.gson.GsonBuilder;

import org.jetbrains.annotations.NotNull;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {
    public static String BASE_URL ="http://103.157.81.54:2358/submissions";
    public static String API_KEY ="dewaganteng";
    public static Retrofit retrofit = null;


    public  static Retrofit getRetrofit(){

            Interceptor interceptor = new Interceptor() {
                @NotNull
                @Override
                public Response intercept(@NotNull Chain chain) throws IOException {
                    Request newRequest = chain.request().newBuilder().addHeader("dewaganteng", ApiClient.API_KEY).build();
                    return chain.proceed(newRequest);
                }
            };

        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(interceptor).build();
        GsonBuilder gb = new GsonBuilder();
//        gb.registerTypeAdapter(String.class, new Strin{
//        });
        gb.serializeNulls();

        if(retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(client)
                    .build();
        }
        return retrofit;
    }
}
