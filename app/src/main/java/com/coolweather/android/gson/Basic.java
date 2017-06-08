package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by edazh on 2017/6/5 0005.
 * 基本信息
 */

public class Basic {
    /**
     * 城市名称
     */
    @SerializedName("city")
    public String cityName;

    /**
     * 城市ID
     */
    @SerializedName("id")
    public String cityId;

    /**
     * 更新时间
     */
    public Update update;

    /**
     * 更新时间
     */
    public class Update {

        /**
         * 当地时间
         */
        @SerializedName("loc")
        public String updateTime;
    }
}
