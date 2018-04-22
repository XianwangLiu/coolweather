package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Nick on 2018/4/22.
 */

public class County extends DataSupport {
    private int id, cityId;
    private String countyName, weatherId;

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public String getCountyName(){
        return countyName;
    }

    public  void setCountyName(String countyName){
        this.countyName = countyName;
    }

    public String getWeatherId(){
        return weatherId;
    }

    public void setWeatherId(){
        this.weatherId = weatherId;
    }

    public int getCityId(){
        return cityId;
    }

    public void setCityId(int cityId){
        this.cityId = cityId;
    }
}
