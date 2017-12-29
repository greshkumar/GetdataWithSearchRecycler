package com.example.greshkumartharwani.getdatawithsearch.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Gresh Kumar Tharwani on 12/30/2017.
 */

public class offers {
    @SerializedName("offer_title")
    @Expose
    String offer_title;

    @SerializedName("offer_description")
    @Expose
    String offer_description;

    @SerializedName("thumbnail")
    @Expose
    thumbnail thumbnail;

    public offers(String offer_title, String offer_description, com.example.greshkumartharwani.getdatawithsearch.model.thumbnail thumbnail) {
        this.offer_title = offer_title;
        this.offer_description = offer_description;
        this.thumbnail = thumbnail;
    }

    public String getOffer_title() {
        return offer_title;
    }

    public void setOffer_title(String offer_title) {
        this.offer_title = offer_title;
    }

    public String getOffer_description() {
        return offer_description;
    }

    public void setOffer_description(String offer_description) {
        this.offer_description = offer_description;
    }

    public com.example.greshkumartharwani.getdatawithsearch.model.thumbnail getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(com.example.greshkumartharwani.getdatawithsearch.model.thumbnail thumbnail) {
        this.thumbnail = thumbnail;
    }
}
