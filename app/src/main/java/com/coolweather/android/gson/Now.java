package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by edazh on 2017/6/5 0005.
 * 实时天气
 */

public class Now {
    /**
     * 气温
     */
    @SerializedName("tmp")
    public String temperature;

    /**
     * 天气详情
     */
    @SerializedName("cond")
    public More more;

    /**
     * 天气状况
     */
    public class More {
        /**
         * 天气状况描述
         */
        @SerializedName("txt")
        public String info;
    }
}
