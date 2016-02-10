package com.ppma.utils;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.view.View;

/**
 * Created by keidao on 1/10/16.
 */
public class DisplayUtils {
    public static int dpToPx(Context context, int dps) {
        return Math.round(context.getResources().getDisplayMetrics().density * dps);
    }

    public static void setFullScreen(Activity activity, boolean enabled) {
        int visibility;
        if (enabled) {
            visibility = View.SYSTEM_UI_FLAG_LAYOUT_STABLE;
        } else {
            visibility = View.SYSTEM_UI_FLAG_FULLSCREEN;
        }

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
            activity.getWindow().getDecorView().setSystemUiVisibility(visibility);
        }
    }

    public static void setStatusBarColorResId(Activity activity, int colorId) {
        setStatusBarColor(activity, activity.getResources().getColor(colorId));
    }

    public static void setStatusBarColorResId(Activity activity, String colorString) {
        setStatusBarColor(activity, Color.parseColor(colorString));
    }

    public static void setStatusBarColor(Activity activity, int color) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            activity.getWindow().setStatusBarColor(color);
        }
    }

    public static int getColor(int colorPrimary, float alpha) {
        int colorPrimaryDark = Color.rgb((int) (Color.red(colorPrimary) * alpha),
                (int) (Color.green(colorPrimary) * alpha),
                (int) (Color.blue(colorPrimary) * alpha));
        return colorPrimaryDark;
    }
}