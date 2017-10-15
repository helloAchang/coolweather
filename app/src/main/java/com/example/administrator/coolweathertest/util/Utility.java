package com.example.administrator.coolweathertest.util;

import android.text.TextUtils;

import com.example.administrator.coolweathertest.bean.City;
import com.example.administrator.coolweathertest.bean.County;
import com.example.administrator.coolweathertest.bean.Province;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Administrator on 2017/10/15.
 */

public class Utility {
    //解析返回的省级数据
    public static boolean handleProvineceResponse(String response){
        if(!TextUtils.isEmpty(response)){
            //不为空
            try {
                JSONArray jsonArray=new JSONArray(response);
                for(int i=0; i<jsonArray.length();i++){
                    JSONObject jsonObject = jsonArray.getJSONObject(i);
                    Province province = new Province();
                    province.setProvinceCode(jsonObject.getInt("id"));
                    province.setProvinceName(jsonObject.getString("name"));
                    province.save();
                }
                return true;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    //返回解析的市级数据
    public static  boolean handleCityResponse(String response,int provinceId){
        if(!TextUtils.isEmpty(response)){
            try {
                JSONArray jsonArray=new JSONArray(response);
                for (int x=0; x<jsonArray.length(); x++){
                    JSONObject jsonObject=jsonArray.getJSONObject(x);
                    City city=new City();
                    city.setCityCode(jsonObject.getInt("id"));
                    city.setCityName(jsonObject.getString("name"));
                    city.setCityceId(provinceId);
                    city.save();
                }
                return true;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return false;
    }
    //返回解析的县级数据
    public static boolean handleCounty(String response, int cityId){
        if(!TextUtils.isEmpty(response)){
            try {
                JSONArray jsonArray=new JSONArray(response);
                for(int n=0;n<jsonArray.length(); n++){
                    JSONObject jsonObject = jsonArray.getJSONObject(n);
                    County county=new County();
                    county.setCountyName(jsonObject.getString("name"));
                    county.setWeatherId(jsonObject.getString("id"));
                    county.setCityId(cityId);
                    county.save();
                }
                return true;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        return false;
    }
}
