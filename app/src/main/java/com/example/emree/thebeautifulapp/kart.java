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
    boolean isFront=true;
    int imageId;
    int backgroundId;

    @SuppressLint("RestrictedApi")
    public kart(Context context, int image) {
        super(context);
        backgroundId=R.drawable.aglobal;
        @SuppressLint("RestrictedApi") Drawable d;


        if(image==1)
        {
            imageId=R.drawable.a1;
        }
        if(image==2)
        {
            imageId=R.drawable.a2;
        }
        if(image==3)
        {
            imageId=R.drawable.a3;
        }
        if(image==4)
        {
            imageId=R.drawable.a4;
        }
        if(image==5)
        {
            imageId=R.drawable.a5;
        }
        if(image==6)
        {
            imageId=R.drawable.a6;
        }
        if(image==7)
        {
            imageId=R.drawable.a7;
        }
        if(image==8)
        {
            imageId=R.drawable.a8;
        }


        if(isFront)
        {
            d = AppCompatDrawableManager.get().getDrawable(context,imageId);
            setBackground(d);
        }
        else
        {
            d = AppCompatDrawableManager.get().getDrawable(context,backgroundId);
            setBackground(d);
        }


    }

    public void turn()
    {
        if(isFront)
            this.isFront=false;
        else
            this.isFront=true;
    }
}
