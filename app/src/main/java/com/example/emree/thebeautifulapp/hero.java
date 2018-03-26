package com.example.emree.thebeautifulapp;

import android.util.Log;

/**
 * Created by emree on 25.02.2018.
 */

public class hero {

    static int count;
    String name;
    int health;
    int power;
    int stamina;
    String type;


    public hero(String name) {
        this.name = name;
        this.health = 100;
        this.power = 20;
        this.stamina = 100;
        this.type = "Ateş";
    }


    public int getHealth() {
        return health;
    }

    public int getPower() {
        return power;
    }

    public int getStamina() {
        return stamina;
    }

    public String getName() {
        return name;
    }

    public void attack()
    {
        this.stamina--;
    }

    public void healthDecrease(int power)
    {
        this.health=this.health-power;
    }

    public void healtIncrease(int power)
    {
        Log.d("mesaj","Can artıyor.");
        if(this.health<100) {
            this.health = this.health + power;
        }
    }

    public void rest()
    {
        this.health++;
    }


}
