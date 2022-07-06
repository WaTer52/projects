package com.softcup.utils;

public class DateTransfer {
    public static String transfer(String initStr) {
        /*
         @initStr:初始字符串
         将形如2022-07-02的日期格式改为20220702
        */
        return initStr.replace("-", "");
    }
}
