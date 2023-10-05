package com.example.myapplication;

import android.util.Pair;

import java.io.Serializable;
import java.text.DecimalFormat;

public class Weather implements Serializable {
    double temp;
    int humidity; // moisture
    double pm25;
    String tmpUrl1;
    String tmpUrl2;
    DecimalFormat df = new DecimalFormat("#.##");
    private boolean responseListener1Completed = false;
    private boolean secondRequestCompleted = false;

    public Weather(double temp, int humidity, double pm25, String tmpUrl1, String tmpUrl2) {
        this.temp = temp;
        this.humidity = humidity;
        this.pm25 = pm25;
        this.tmpUrl1 = tmpUrl1;
        this.tmpUrl2 = tmpUrl2;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public double getPm25() {
        return pm25;
    }

    public void setPm25(double pm25) {
        this.pm25 = pm25;
    }

    public String getTmpUrl1() {
        return tmpUrl1;
    }

    public void setTmpUrl1(String tmpUrl1) {
        this.tmpUrl1 = tmpUrl1;
    }

    public String getTmpUrl2() {
        return tmpUrl2;
    }

    public void setTmpUrl2(String tmpUrl2) {
        this.tmpUrl2 = tmpUrl2;
    }

    public void getWeatherDetails(){

    }

}
