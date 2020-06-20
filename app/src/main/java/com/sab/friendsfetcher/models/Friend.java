package com.sab.friendsfetcher.models;

public class Friend {
    private String name;
    private String surname;
    private String city;
    private String country;
    private String avatarUrl;
    private boolean isOnline;

    public Friend(String name, String surname, String city, String country, String avatarUrl, boolean isOnline) {
        this.name = name;
        this.surname = surname;
        this.city = city;
        this.country = country;
        this.avatarUrl = avatarUrl;
        this.isOnline = isOnline;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public boolean isOnline() {
        return isOnline;
    }

    public void setOnline(boolean online) {
        isOnline = online;
    }
}
