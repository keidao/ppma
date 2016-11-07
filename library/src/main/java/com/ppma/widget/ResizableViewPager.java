package com.ppma.widget;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by keidao on 1/21/16.
 */
public class ResizableViewPager extends ViewPager {

    private float mPageWidth = 1.0f;

    public ResizableViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {

        int width = (int) (MeasureSpec.getSize(widthMeasureSpec) * mPageWidth);
        int childWidthMeasureSpec = MeasureSpec.makeMeasureSpec(width, MeasureSpec.EXACTLY);

        int height = 0;
        for(int i = 0; i < getChildCount(); i++) {
            View child = getChildAt(i);
            child.measure(childWidthMeasureSpec, MeasureSpec.makeMeasureSpec(0, MeasureSpec.UNSPECIFIED));
            int h = child.getMeasuredHeight();
            if(h > height) height = h;
        }

        heightMeasureSpec = MeasureSpec.makeMeasureSpec(height, MeasureSpec.AT_MOST);

        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    public void setPageWidth(float width) {
        mPageWidth = width;
    }

    public float getPageWidth() {
        return mPageWidth;
    }

}
