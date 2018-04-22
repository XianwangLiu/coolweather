package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Nick on 2018/4/22.
 */

public class City extends DataSupport{
    private int id, cityCode, provinceId;
    private String cityName;

    public int getId(){
        return id;
    }

    public void setId(int id ){
        this.id = id;
    }

    public String getCityNameName(){
        return cityName;

    }
    public void setCityName(String cityName){
        this.cityName = cityName;
    }

    public int getCityCode(){
        return cityCode;
    }

    public void setCityCode(int cityCode){
        this.cityCode = cityCode;
    }

    public int getProvinceId(){
        return provinceId;
    }

    public void setProvinceId(int provinceId){
        this.provinceId = provinceId;
    }
}
