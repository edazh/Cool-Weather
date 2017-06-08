package com.coolweather.android.gson;


import com.google.gson.annotations.SerializedName;

/**
 * Created by edazh on 2017/6/5 0005.
 * 空气质量
 */

public class AQI {
    /**
     * 城市空气质量
     */

    @SerializedName("city")
    public AQICity aqiCity;

    /**
     * 城市空气质量
     */
    public class AQICity {
        /**
         * 空气质量指数
         */
        public String aqi;
        /**
         * pm2.5一小时平均值
         */
        public String pm25;
        /**
         * 空气质量类别，共六个级别，分别：优，良，轻度污染，中度污染，重度污染，严重污染
         */
        @SerializedName("qlty")
        public String quality;
    }
}
