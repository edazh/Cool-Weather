package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by edazh on 2017/6/5 0005.
 * 建议、提示
 */

public class Suggestion {
    /**
     * 洗车指数
     */
    @SerializedName("cw")
    public CarWash carWash;
    /**
     *舒适度
     */
    @SerializedName("comf")
    public Comfort comfort;

    /**
     * 运动指数
     */
    public Sport sport;

    /**
     * 洗车
     */
    public class CarWash {
        /**
         * 详细描述
         */
        @SerializedName("txt")
        public String info;
    }

    /**
     * 舒适
     */
    public class Comfort {
        /**
         * 详细描述
         */
        @SerializedName("txt")
        public String info;
    }

    /**
     * 运动
     */
    public class Sport {
        /**
         * 详细描述
         */
        @SerializedName("txt")
        public String info;
    }
}
