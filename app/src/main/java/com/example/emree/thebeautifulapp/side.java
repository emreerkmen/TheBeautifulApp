package com.example.emree.thebeautifulapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.GridLayout;
import android.widget.TextView;

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
        gl_kartlar.addView(new kart(this));

        random=(int) Math.random()*8;


    }
}
