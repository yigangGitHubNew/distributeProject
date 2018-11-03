package com.didispace.utils;

import org.springframework.util.StringUtils;

import java.util.Calendar;

/**
 * 时间工具类
 */
public class DateUtil {

    public static void main(String[] args) {
        String dateStr = "8:1:2";
        String[] dateStrs = dateStr.split(":");
        if(dateStrs.length != 3){
            System.out.println("该日期格式数据有问题");
        }else{
            String hourStr = dateStrs[0];
            String minuteStr = dateStrs[1];
            String secondStr = dateStrs[2];
            if(hourStr.length() == 1){
                hourStr = "0".concat(hourStr);
                System.out.println(hourStr);
            }
            if(minuteStr.length() == 1){
                minuteStr = "0".concat(minuteStr);
                System.out.println(minuteStr);
            }
            if(secondStr.length() == 1){
                secondStr = "0".concat(secondStr);
                System.out.println(secondStr);
            }
            System.out.println(hourStr.concat(":"+minuteStr+":"+secondStr));
        }
    }
}
