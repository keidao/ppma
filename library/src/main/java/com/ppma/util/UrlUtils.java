package com.ppma.util;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by keidao on 6/8/16.
 */
public class UrlUtils {

    public static Map<String, String> getQueryMap(String query, String delimeter) {

        String[] params = query.split(delimeter);
        Map<String, String> map = new HashMap<String, String>();
        for (String param : params) {
            String name = param.split("=")[0];
            String value = "";
            if (param.split("=").length == 2) {
                value = param.split("=")[1];
            }
            map.put(name, value);
        }
        return map;
    }
}
