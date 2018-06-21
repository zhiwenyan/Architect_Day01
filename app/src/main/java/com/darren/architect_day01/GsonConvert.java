package com.darren.architect_day01;

import com.darren.architect_day01.simple7.Converter;
import com.google.gson.Gson;

/**
 * Created by hcDarren on 2017/12/24.
 */

public class GsonConvert implements Converter{
    @Override
    public <T> T convert(String value, Class<T> type){
        return new Gson().fromJson(value,type);
    }
}
