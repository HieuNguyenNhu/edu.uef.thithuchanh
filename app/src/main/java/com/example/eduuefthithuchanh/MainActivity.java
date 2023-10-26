package com.example.eduuefthithuchanh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    Button Hamburger, Bread, CherryCheeseCake, GingerbreadHouse,SunnySideUpEggs;

    String choices = "";
    double prices=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bread = (Button) findViewById(R.id.Bread);
        Hamburger = (Button) findViewById(R.id.Hamburger);
        CherryCheeseCake = (Button) findViewById(R.id.CherryCheeseCake);
        GingerbreadHouse = (Button) findViewById(R.id.GingerbreadHouse);
        SunnySideUpEggs = (Button) findViewById(R.id.SunnySideUpEggs);

    }
    public void add_to_list(View view){
        if (view == findViewById(R.id.Bread))
        {
            choices = choices+"Bread"+"\n";
            prices = prices+10.000;
        }

        if (view == findViewById(R.id.Hamburger))
        {
            choices = choices+"Hamburger"+"\n";
            prices = prices+20.000;
        }
        if (view == findViewById(R.id.CherryCheeseCake))
        {
            choices = choices+"CherryCheeseCake"+"\n";
            prices = prices+150.000;
        }
        if (view == findViewById(R.id.GingerbreadHouse))
        {
            choices = choices+"GingerbreadHouse"+"\n";
            prices = prices+200.000;
        }
        if (view == findViewById(R.id.SunnySideUpEggs))
        {
            choices = choices+"SunnySideUpEggs"+"\n";
            prices = prices+5.000;
        }

    }
    public void Order(View view){
        Intent i = new Intent(MainActivity.this,OderDetails.class);
        Bundle bundle = new Bundle();
        bundle.putString("choices",choices);
        bundle.putDouble("prices",prices);
        i.putExtras(bundle);
        startActivity(i);

    }
}