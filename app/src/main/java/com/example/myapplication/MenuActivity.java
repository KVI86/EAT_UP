package com.example.myapplication;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class MenuActivity extends AppCompatActivity {
    private ImageButton breakfast,lunch,dinner;
    public double prom1,prom2,prom3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);

        prom1 = (double) getIntent().getExtras().get("valueBRF");
        prom2 = (double) getIntent().getExtras().get("valueLNH");
        prom3 = (double) getIntent().getExtras().get("valueDNR");
        addListenerOnButton();
    }

    public void addListenerOnButton() {
        breakfast = (ImageButton) findViewById(R.id.breakfast_btn);
        lunch = (ImageButton) findViewById(R.id.lunch_btn);
        dinner = (ImageButton) findViewById(R.id.dinner_btn);
        breakfast.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent brk = new Intent(".breakfast_recipes");
                        brk.putExtra("value",prom1);
                        startActivity(brk);
                    }
                }
        );
        lunch.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent lnh = new Intent(".lunch_recipes");
                        lnh.putExtra("value",prom2);
                        startActivity(lnh);
                    }
                }
        );
        dinner.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent dnr = new Intent(".dinner_recipes");
                        dnr.putExtra("value",prom3);
                        startActivity(dnr);
                    }
                }
        );
    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(MenuActivity.this);
        builder.setTitle("Хотите выйти на начальный экран и изменить сумму?");
        builder.setPositiveButton("Да", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent back = new Intent(".MainActivity");
                startActivity(back);
            }
        });
        builder.setNegativeButton("Нет",null);
        AlertDialog alert = builder.create();
        alert.show();
    }
}
