package com.example.administrator.coolweathertest.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;

/**
 * 对应的市
 * Created by Administrator on 2017/10/11.
 */

@Entity
public class County {
    private int id;
    private String countyName;
    private String weatherId;
    private int cityId;
    @Generated(hash = 2021791012)
    public County(int id, String countyName, String weatherId, int cityId) {
        this.id = id;
        this.countyName = countyName;
        this.weatherId = weatherId;
        this.cityId = cityId;
    }
    @Generated(hash = 1991272252)
    public County() {
    }
    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getCountyName() {
        return this.countyName;
    }
    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }
    public String getWeatherId() {
        return this.weatherId;
    }
    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }
    public int getCityId() {
        return this.cityId;
    }
    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
