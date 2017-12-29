package com.example.greshkumartharwani.getdatawithsearch.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by Gresh Kumar Tharwani on 12/30/2017.
 */

public class data {
    @SerializedName("offers")
    @Expose
    public ArrayList<offers> offers;

    public ArrayList<offers> getOffers() {
        return offers;
    }

    public void setOffers(ArrayList<offers> offers) {
        this.offers = offers;
    }

    public data(ArrayList<offers> offers) {
        this.offers = offers;

    }
}

