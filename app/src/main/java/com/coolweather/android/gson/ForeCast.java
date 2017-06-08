package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by edazh on 2017/6/5 0005.
 * 天气预报
 */

public class ForeCast {
    /**
     * 日期
     */
    public String date;
    /**
     * 温度
     */
    @SerializedName("tmp")
    public Temperature temperature;
    /**
     * 天气状况
     */
    @SerializedName("cond")
    public More more;

    /**
     * 温度
     */
    public class Temperature {
        /**
         * 最低温度
         */
        public String min;
        /**
         * 最高温度
         */
        public String max;
    }

    /**
     * 天气状况
     */
    public class More {
        /**
         * 白天天气
         */
        @SerializedName("txt_d")
        public String info;
    }
}
