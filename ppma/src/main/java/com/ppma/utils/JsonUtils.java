package com.ppma.utils;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;

public class JsonUtils {

	public static ArrayList<Map<String, String>> getList(String json) {
		ArrayList<Map<String, String>> list = new ArrayList<>();

		try {
			JSONArray jsonArray = new JSONArray(json);
			for (int i = 0; i < jsonArray.length(); i++) {
				JSONObject object = (JSONObject) jsonArray.get(i);
				Gson gson = new Gson();
				Type stringStringMap = new TypeToken<Map<String, String>>(){}.getType();
				Map<String,String> map = gson.fromJson(object.toString(), stringStringMap);
				list.add(map);
			}

		} catch (JSONException e) {
			e.printStackTrace();
			throw new NullPointerException(e.getMessage());
		}

		return list;
	}
	
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
