package com.restapi.javaapi;

import java.net.HttpURLConnection;
import java.net.URL;

public class JavaAPI {

    public String SendSms(String phoneNumer, String message){

        try{

            HttpURLConnection urlConn;
            URL url=new URL("http://localhost:8080/sendsms");
            urlConn= (HttpURLConnection) url.openConnection();
            urlConn.setDoOutput(true);
            System.out.println(phoneNumer);
            System.out.println(message);

        }catch (Exception e){
            e.printStackTrace();
        }

        return "";
    }

}
