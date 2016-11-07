package com.ppma.widget;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;

/**
 * Created by keidao on 6/8/16.
 */
public class ViewUtils {

    public static View blankView(Context context, int heightPixels) {
        View blankView = new View(context);
        blankView.setLayoutParams(new AbsListView.LayoutParams(
                context.getResources().getDisplayMetrics().widthPixels, heightPixels));
        return blankView;
    }

    public static void setMargins (View v, int l, int t, int r, int b) {
        if (v.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams p = (ViewGroup.MarginLayoutParams) v.getLayoutParams();
            p.setMargins(l, t, r, b);
            v.requestLayout();
        }
    }

    public static void toggle(View view) {
        if (view.getVisibility() == View.GONE) {
            view.setVisibility(View.VISIBLE);
        } else {
            view.setVisibility(View.GONE);
        }
    }

    public static void setVisibled(View view, boolean flag) {
        if (flag) {
            view.setVisibility(View.VISIBLE);
        } else {
            view.setVisibility(View.GONE);
        }
    }

    public static void toggleSelect(View view) {
        if (view.isSelected()) {
            view.setSelected(false);
        } else {
            view.setSelected(true);
        }
    }
}
