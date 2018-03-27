package com.example.emree.thebeautifulapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.GridLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class side extends AppCompatActivity {

    TextView tv_mesaj;
    GridLayout gl_kartlar;
    int random;

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
            int b=(int) ((Math.random()*16)%8);
            kart kart=new kart(this,b);
            kartlar.add(kart);
        }
        for (int x=0; x<16;x++)
        {
            gl_kartlar.addView(kartlar.get(x));
        }
    }
}
