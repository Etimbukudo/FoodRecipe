package com.example.foodrecipe.model;

import com.google.gson.annotations.SerializedName;

public class User {

    public static User user;
    @SerializedName("email")
    private String email;
    @SerializedName("latlng")
    private String latlng;
    @SerializedName("name")
    private static String name;

    public User(String email, String latlng, String name) {
        this.email = email;
        this.latlng = latlng;
        User.name = name;
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

    static String getname() {
        return name;
    }

    public void setName(String name) {
        User.name = name;
    }
}
