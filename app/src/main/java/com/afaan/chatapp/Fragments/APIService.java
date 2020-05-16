package com.afaan.chatapp.Fragments;

import com.afaan.chatapp.Notifications.MyResponse;
import com.afaan.chatapp.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAARCELdJs:APA91bF9l_0nMN5XNV7Mu-pDc41iIEcC7-joVBrsIB7BuohJK0lB3OlnJ3xCx8mhwX4tAU8u0-pKtveVOI6QhTPGMSc6NHaq0hCQEFcWicNjC2rM26zHstePMkXyfEpZWnLNbjGJ4c3t"
            }
    )

    @POST("fcm/send")
   Call<MyResponse> sendNotification(@Body Sender body);
}
