package com.example.administrator.coolweathertest.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by Administrator on 2017/10/11.
 */

public class HttpUtil {
    public static void sendOKHttpRequest(String url,okhttp3.Callback callback){
        OkHttpClient okHttpClient=new OkHttpClient();
        Request request=new Request.Builder().url(url).build();
        okHttpClient.newCall(request);
    }
}
