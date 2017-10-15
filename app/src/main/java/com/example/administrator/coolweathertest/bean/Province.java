package com.example.administrator.coolweathertest.bean;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2017/10/11.
 */

public class Province extends DataSupport{
    private int id;
    //省份名字
    private String provinceName;
    //记录省份的代号
    private int provinceCode;
    public Province(int id, String provinceName, int provinceCode) {
        this.id = id;
        this.provinceName = provinceName;
        this.provinceCode = provinceCode;
    }
    public Province() {
    }
    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getProvinceName() {
        return this.provinceName;
    }
    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }
    public int getProvinceCode() {
        return this.provinceCode;
    }
    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }

}
