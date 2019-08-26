package com.example.foodrecipe.model;

import com.google.gson.annotations.SerializedName;

public class User {

    public static User user;
    @SerializedName("email")
    private String email;
    @SerializedName("latlng")
    private String latlng;
    @SerializedName("name")
    private  String name;

    public User(String email, String latlng, String name) {
        this.email = email;
        this.latlng = latlng;
        this.name = name;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLatlng() {
        return latlng;
    }

    public void setLatlng(String latlng) {
        this.latlng = latlng;
    }

    public String getName() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }
}
