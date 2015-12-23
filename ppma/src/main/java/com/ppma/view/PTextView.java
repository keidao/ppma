package com.ppma.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;

import com.ppma.R;
import com.ppma.graphics.Typefaces;

public class PTextView extends TextView {

	public PTextView(Context context) {
		super(context);
	}

	public PTextView(Context context, AttributeSet attrs) {
		super(context, attrs);
		
		TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.PTextView);

		String fontName = a.getString(R.styleable.PTextView_typeface);
		Typefaces.setTypeface(this, fontName);
		
		a.recycle();
	}

	public PTextView(Context context, AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
	}

	@SuppressLint("NewApi")
	public PTextView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
		super(context, attrs, defStyleAttr, defStyleRes);
	}
}
