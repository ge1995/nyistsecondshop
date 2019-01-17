package com.nyist.secondshop.utils;

import java.util.regex.Pattern;

/**
 * Created by chao on 2018/5/3.
 */
public class InfoCheck {
    public static String CHECK_MOBILE = "^((13[0-9])|(15[^4,\\D])|(18[0,5-9]))\\d{8}$";
    public static String CHECK_EMAIL = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";

    public boolean isEmail(String email){
        return Pattern.matches(CHECK_EMAIL, email);
    }

    public boolean isMobile(String mobile){
        return Pattern.matches(CHECK_MOBILE, mobile);
    }

//    public static void main(String[] args) {
//        InfoCheck infoCheck = new InfoCheck();
//        System.out.println(infoCheck.isMobile("15518959808"));
//        System.out.println(infoCheck.isEmail("15518959808@163.com"));
//    }

}
