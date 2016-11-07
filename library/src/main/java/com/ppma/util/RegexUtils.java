package com.ppma.util;

import java.util.regex.Pattern;

/**
 * Created by keidao on 9/20/15.
 */
public class RegexUtils {

    public static final String TYPE_NUM = "TYPE_NUM";
    public static final String TYPE_EMAIL = "TYPE_EMAIL";
    public static final String TYPE_TEL = "TYPE_TEL";
    public static final String TYPE_PHONE = "TYPE_PHONE";

    public static String removeNonDigits(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        return str.replaceAll("[^0-9]+", "");
    }

    public static boolean checkPattern(String type, String str){
        boolean okPattern = false;
        String regex = null;

        type = type.trim();

        //숫자 체크
        if(type.equals(TYPE_NUM)){
            regex = "^[0-9]*$";
        }

        //이메일 체크
        if(type.equals(TYPE_EMAIL)){
            regex = "^[_a-z0-9-]+(.[_a-z0-9-]+)*@(?:\\w+\\.)+\\w+$";
        }

        //전화번호 체크
        if(type.equals(TYPE_TEL)){
            regex = "^\\d{2,3}-\\d{3,4}-\\d{4}$";
        }

        //휴대폰번호 체크
        if(type.equals(TYPE_PHONE)){
            regex = "^01(?:0|1[6-9])-(?:\\d{3}|\\d{4})-\\d{4}$";
        }

        okPattern = Pattern.matches(regex, str);
        return okPattern;
    }
}
