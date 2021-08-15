package com.juaracoding.ujiancracker.service;

import com.juaracoding.ujiancracker.entity.PostSubsmission;
import com.juaracoding.ujiancracker.entity.ResponseEntity;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiInterface {

    @GET("submissions/{token}")
    Call<ResponseEntity> getSubmission(@Path("token") String token);

    @POST("submissions")
    Call<PostSubsmission> postSubmission(@Query("base64_encoded") String base64,
                                         @Query("fields") String fields,
                                         @Body RequestBody jsonCode);

}
