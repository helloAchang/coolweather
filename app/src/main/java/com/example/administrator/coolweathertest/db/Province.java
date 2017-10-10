package com.example.administrator.coolweathertest.db;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by Administrator on 2017/10/11.
 */

@Entity
public class Province {
    private int id;
    //省份名字
    private String provinceName;
    //记录省份的代号
    private int provinceCode;
    @Generated(hash = 87637210)
    public Province(int id, String provinceName, int provinceCode) {
        this.id = id;
        this.provinceName = provinceName;
        this.provinceCode = provinceCode;
    }
    @Generated(hash = 1309009906)
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
