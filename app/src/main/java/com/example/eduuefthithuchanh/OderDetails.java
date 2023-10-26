package com.example.eduuefthithuchanh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class OderDetails extends AppCompatActivity {


    TextView listview = findViewById(R.id.listview),pricesview = findViewById(R.id.pricesview);
    String list_choices;
    Double price_vnd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Bundle bundle= getIntent().getExtras();
        list_choices =bundle.getString("choices");
        price_vnd = bundle.getDouble("price");

        listview.setText(list_choices);
        pricesview.setText(price_vnd.toString());


    }

}