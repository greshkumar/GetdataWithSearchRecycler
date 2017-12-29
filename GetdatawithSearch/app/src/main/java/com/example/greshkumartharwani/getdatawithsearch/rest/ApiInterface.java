package com.example.greshkumartharwani.getdatawithsearch.rest;

import com.example.greshkumartharwani.getdatawithsearch.model.Main;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Gresh Kumar Tharwani on 12/30/2017.
 */

public interface ApiInterface {
    @GET("public/offers/list")
    Call<Main> getMainData();
}
