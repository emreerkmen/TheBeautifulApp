package com.example.emree.thebeautifulapp;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class side extends AppCompatActivity implements View.OnClickListener{

    TextView tv_mesaj;
    GridLayout gl_kartlar;
    int random;
    int sonKart;
    final Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_side);
        tv_mesaj=(TextView) findViewById(R.id.tv_mesaj);
        gl_kartlar=(GridLayout) findViewById(R.id.gl_kartlar);
        Intent i=getIntent();
        String mesaj=i.getStringExtra("Message");
        tv_mesaj.setText(mesaj);
        ArrayList<kart> kartlar=new ArrayList<kart>();



        for (int x=0;x<16;x++)
        {
            kart kart=new kart(this,x);
            Button buttonkart=(Button) kart;
            buttonkart.setOnClickListener((View.OnClickListener) this);
            kartlar.add(kart);
        }

        for (int y=0;y<16;y++)
        {
            int b=(int) (Math.random()*16);
            Collections.swap(kartlar,b,y);
        }

        for (int x=0; x<16;x++)
        {
            gl_kartlar.addView(kartlar.get(x));
        }
    }

    @Override
    public void onClick(View view) {
        final kart k=(kart) view;
        kart tempKart= (kart) findViewById(sonKart);
        if(!k.match)
        {
            k.turn();
        }
        if(!k.isBack)
        {
            if (k.imageId==tempKart.imageId)
            {
                k.match=true;
                tempKart.match=true;
            }
            else
            {
                sonKart=k.getId();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if(!k.match)
                        {
                            k.turn();
                        }
                    }
                },1000);

            }

        }

    }

}
