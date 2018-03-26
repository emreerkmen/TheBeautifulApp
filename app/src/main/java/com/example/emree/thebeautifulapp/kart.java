package com.example.emree.thebeautifulapp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.Button;
import android.support.v7.widget.AppCompatDrawableManager;
import android.support.v7.widget.AppCompatButton;


/**
 * Created by emree on 26.03.2018.
 */

public class kart extends android.support.v7.widget.AppCompatButton {
    boolean isFront;
    int imageId;
    int backgroundId;

    public kart(Context context) {
        super(context);
        backgroundId=R.drawable.aglobal;
        @SuppressLint("RestrictedApi") Drawable d = AppCompatDrawableManager.get().getDrawable(context,backgroundId);
        setBackground(d);

    }
}
