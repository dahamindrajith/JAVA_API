package com.restapi.javaapi;

public class CallAPIModel {

    String phoneNumer;
    String message;

    public CallAPIModel(String phoneNumer, String message) {
        this.phoneNumer = phoneNumer;
        this.message = message;
    }

    public String getPhoneNumer() {
        return phoneNumer;
    }

    public void setPhoneNumer(String phoneNumer) {
        this.phoneNumer = phoneNumer;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public CallAPIModel() {

    }
}
