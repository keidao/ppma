package com.ppma.content;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;

public class AppUtils {
	
	public static PackageInfo getPackageInfo(Context context) {
		PackageInfo pi = null;
	    try {
	        pi = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
	    } catch (NameNotFoundException e) {
	    }
	    return pi;
	}
	
}
