package com.example.greshkumartharwani.getdatawithsearch.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Gresh Kumar Tharwani on 12/30/2017.
 */

public class Main {
    public Main(data data) {
        this.data = data;
    }

    public data getData() {
        return data;
    }

    public void setData(data data) {
        this.data = data;
    }

    @SerializedName("data")

    @Expose

    public data data;
}

