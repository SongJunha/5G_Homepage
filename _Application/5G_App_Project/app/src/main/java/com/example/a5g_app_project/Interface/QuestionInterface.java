package com.example.a5g_app_project.Interface;

import java.util.HashMap;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface QuestionInterface {
    @POST("/test/question")
    Call<HashMap<String, String>> setQuestion(@Body HashMap<String, String> user);
}
