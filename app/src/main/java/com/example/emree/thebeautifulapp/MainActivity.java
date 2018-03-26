package com.example.emree.thebeautifulapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;
import android.content.Intent;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, EditText.OnEditorActionListener {

    TextView tv_heroName;
    TextView tv_power;
    TextView tv_stamina;
    TextView tv_health;
    TextView tv_message;
    Button attack;
    Button create;
    hero fuskar=new hero("Fuskar");
    Button heal;
    Button go;
    EditText editTextAttack;
    int attack_ammount;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_heroName=(TextView) findViewById(R.id.tv_heroName);
        tv_power=(TextView) findViewById(R.id.tv_power);
        tv_stamina=(TextView) findViewById(R.id.tv_stamina);
        tv_health=(TextView) findViewById(R.id.tv_health);
        tv_message=(TextView) findViewById(R.id.tv_message) ;
        editTextAttack=(EditText) findViewById(R.id.editTextAttack);
        attack=(Button) findViewById(R.id.attack);
        create=(Button) findViewById(R.id.create);
        heal=(Button) findViewById(R.id.heal);
        go=(Button) findViewById(R.id.go);
        attack.setOnClickListener(this);
        create.setOnClickListener(this);
        heal.setOnClickListener(this);
        go.setOnClickListener(this);
        editTextAttack.setOnEditorActionListener(this);



    }

    @Override
    public void onClick(View v) {



        if (v.getId()==create.getId())
        {

            tv_heroName.setText(fuskar.getName());
            tv_health.setText(Integer.toString(fuskar.getHealth()));
            tv_power.setText(Integer.toString(fuskar.getPower()));
            tv_stamina.setText(Integer.toString(fuskar.getStamina()));
        }

        if (v.getId()==attack.getId())
        {
            fuskar.healthDecrease(10);
            tv_health.setText(Integer.toString(fuskar.getHealth()));
        }

        if(v.getId()==heal.getId())
        {
            fuskar.healtIncrease(10);
            tv_health.setText(Integer.toString(fuskar.getHealth()));
        }

        if (v.getId()==go.getId())
        {
            tv_health.setText("Clicked Go.");
            Intent i = new Intent(MainActivity.this,side.class);
            i.putExtra("Message",tv_health.getText().toString());
            startActivity(i);
        }
    }

    @Override
    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {

        fuskar.healthDecrease(Integer.parseInt(editTextAttack.getText().toString()));
        tv_health.setText(Integer.toString(fuskar.getHealth()));
        tv_message.setText("Attack "+editTextAttack.getText().toString());

        return false;
    }
}
