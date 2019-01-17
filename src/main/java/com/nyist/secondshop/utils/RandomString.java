package com.nyist.secondshop.utils;

/**
 * Created by chao on 2018/4/9.
 */
public class RandomString {
    public String getRandomString(int m){
        String str = "";
        for (int i = 0; i < m; i++){
            String STR = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
            int n = (int) (Math.random()*(STR.length() - 1));
            str += STR.charAt(n);
        }
        return str;
    }
}
