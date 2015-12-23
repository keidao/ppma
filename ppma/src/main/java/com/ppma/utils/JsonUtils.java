package com.ppma.utils;

import org.json.JSONException;
import org.json.JSONObject;

public class JsonUtils {
	
	public static JSONObject getJSONObject(JSONObject object, String name) {
		try {
			return (JSONObject) object.get(name);
		} catch (JSONException e) {
			e.printStackTrace();
            throw new NullPointerException(name + " JSONException");
		}
	}

	public static String get(JSONObject object, String name) {
		return getString(object, name);
	}
	
	public static String getString(JSONObject object, String name) {
		try {
			return object.getString(name);
		} catch (JSONException e) {
			e.printStackTrace();
            throw new NullPointerException(name + " JSONException");
		}
	}
	
	public static boolean getBoolean(JSONObject object, String name) {
		try {
			return object.getBoolean(name);
		} catch (JSONException e) {
			e.printStackTrace();
            throw new NullPointerException(name + " JSONException");
		}
	}

	public static int getInt(JSONObject object, String name) {
		try {
			return object.getInt(name);
		} catch (JSONException e) {
			e.printStackTrace();
            throw new NullPointerException(name + " JSONException");
		}
	}
}
