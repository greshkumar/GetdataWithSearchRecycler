package com.example.greshkumartharwani.getdatawithsearch.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Gresh Kumar Tharwani on 12/30/2017.
 */

public class thumbnail {

    @SerializedName("link")
    @Expose
    public String link;

    public thumbnail(String link) {
        this.link = link;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}

