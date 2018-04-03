package com.example.emree.thebeautifulapp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.widget.Button;
import android.support.v7.widget.AppCompatDrawableManager;
import android.support.v7.widget.AppCompatButton;


/**
 * Created by emree on 26.03.2018.
 */

public class kart extends android.support.v7.widget.AppCompatButton {
    public boolean isBack=true;
    public int imageId;
    public int backgroundId;
    public boolean match=false;
    public @SuppressLint("RestrictedApi") Drawable imageD;
    public @SuppressLint("RestrictedApi") Drawable backgroundD;

    @SuppressLint("RestrictedApi")
    public kart(Context context, int image) {
        super(context);
        this.backgroundId=R.drawable.aglobal;
        setId(image);



        if(image%8==0)
        {
            this.imageId=R.drawable.a1;
        }
        if(image%8==1)
        {
            this.imageId=R.drawable.a2;
        }
        if(image%8==2)
        {
            this.imageId=R.drawable.a3;
        }
        if(image%8==3)
        {
            this.imageId=R.drawable.a4;
        }
        if(image%8==4)
        {
            this.imageId=R.drawable.a5;
        }
        if(image%8==5)
        {
            this.imageId=R.drawable.a6;
        }
        if(image%8==6)
        {
            this.imageId=R.drawable.a7;
        }
        if(image%8==7)
        {
            this.imageId=R.drawable.a8;
        }

        this.imageD = AppCompatDrawableManager.get().getDrawable(context,this.imageId);
        this.backgroundD = AppCompatDrawableManager.get().getDrawable(context,this.backgroundId);
        setBackground(this.backgroundD);

    }

    @SuppressLint("RestrictedApi")
    public kart(Context context, int image, boolean isBack, boolean match) {
        super(context);
        this.isBack=isBack;
        this.match=match;
        this.backgroundId=R.drawable.aglobal;
        setId(image);



        if(image%8==0)
        {
            this.imageId=R.drawable.a1;
        }
        if(image%8==1)
        {
            this.imageId=R.drawable.a2;
        }
        if(image%8==2)
        {
            this.imageId=R.drawable.a3;
        }
        if(image%8==3)
        {
            this.imageId=R.drawable.a4;
        }
        if(image%8==4)
        {
            this.imageId=R.drawable.a5;
        }
        if(image%8==5)
        {
            this.imageId=R.drawable.a6;
        }
        if(image%8==6)
        {
            this.imageId=R.drawable.a7;
        }
        if(image%8==7)
        {
            this.imageId=R.drawable.a8;
        }

        this.imageD = AppCompatDrawableManager.get().getDrawable(context,this.imageId);
        this.backgroundD = AppCompatDrawableManager.get().getDrawable(context,this.backgroundId);

        if(isBack)
        {
            setBackground(this.imageD);
            isBack=false;
        }
        else
        {
            setBackground(this.backgroundD);
            isBack=true;
        }

    }

    @SuppressLint("RestrictedApi")
    public void turn()
    {
        if(isBack)
        {
            setBackground(this.imageD);
            isBack=false;
        }
        else
        {
            setBackground(this.backgroundD);
            isBack=true;
        }

    }

    public void back()
    {
        setBackground(this.backgroundD);
        this.isBack=true;
    }

    public void front()
    {
        setBackground(this.imageD);
        this.isBack=false;
    }

}
