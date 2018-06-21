package com.darren.architect_day01.simple7;

/**
 * Created by hcDarren on 2017/12/24.
 */

public interface Converter {
    Converter DEFAULT_CONVERTER = new Converter() {
        @Override
        public <T> T convert(String value, Class<T> type){
            return (T) value;
        }
    };

    <T> T convert(String value, Class<T> type);
}
