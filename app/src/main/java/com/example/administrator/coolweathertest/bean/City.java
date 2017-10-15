package com.example.administrator.coolweathertest.bean;


import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2017/10/11.
 */

public class City extends DataSupport{
    private int id;
    private String cityName;
    private int cityCode;
    private int cityceId;
    public City(int id, String cityName, int cityCode, int cityceId) {
        this.id = id;
        this.cityName = cityName;
        this.cityCode = cityCode;
        this.cityceId = cityceId;
    }
    public City() {
    }
    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getCityName() {
        return this.cityName;
    }
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
    public int getCityCode() {
        return this.cityCode;
    }
    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }
    public int getCityceId() {
        return this.cityceId;
    }
    public void setCityceId(int cityceId) {
        this.cityceId = cityceId;
    }

}
