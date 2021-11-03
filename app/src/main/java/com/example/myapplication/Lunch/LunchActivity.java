package com.example.myapplication.Lunch;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RelativeLayout;

import com.example.myapplication.Brekfast.RecipeActivity_B;
import com.example.myapplication.Logic;
import com.example.myapplication.R;

import java.util.ArrayList;


public class LunchActivity extends AppCompatActivity {
    public ImageButton recipe1,recipe2,recipe3,recipe4,recipe5,recipe6,recipe7,recipe8,recipe9,recipe10;
    public RelativeLayout lr1,lr2,lr3,lr4,lr5,lr6,lr7,lr8,lr9,lr10;
    public double valueLNH,v1,v2,v3,v4,v5,v6,v7,v8,v9,v10;
    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lunch_recipes);
        init();
        valueLNH = (double) getIntent().getExtras().get("value");
        Logic page = new Logic();
        ArrayList<Double> new_list = page.set_list(2);
        double sum_from_recipes = page.sum(2);
        if (sum_from_recipes > valueLNH){
            while (sum_from_recipes > valueLNH){
                double max_value = page.get_max(new_list);
                sum_from_recipes = sum_from_recipes - max_value;
                new_list.removeIf(n->(n == max_value));
                if (max_value == v1){
                    lr1.setVisibility(View.GONE);
                }
                else  if (max_value == v2){
                    lr2.setVisibility(View.GONE);
                }
                else  if (max_value == v3){
                    lr3.setVisibility(View.GONE);
                }
                else if (max_value == v4){
                    lr4.setVisibility(View.GONE);
                }
                else if (max_value == v5){
                    lr5.setVisibility(View.GONE);
                }
                else if (max_value == v6){
                    lr6.setVisibility(View.GONE);
                }
                else if (max_value == v7){
                    lr7.setVisibility(View.GONE);
                }
                else if (max_value == v8){
                    lr8.setVisibility(View.GONE);
                }
                else  if (max_value == v9){
                    lr9.setVisibility(View.GONE);
                }
                else  if (max_value == v10){
                    lr10.setVisibility(View.GONE);
                }
            }
        }
        addListenerOnButton();
    }
    public void addListenerOnButton() {
        lr1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rec = new Intent(".L_recipes");
                rec.putExtra("l_recipe","l_1");
                startActivity(rec);
            }
        });
        recipe1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rec = new Intent(".L_recipes");
                rec.putExtra("l_recipe","l_1");
                startActivity(rec);
            }
        });
        lr2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rec = new Intent(".L_recipes");
                rec.putExtra("l_recipe","l_2");
                startActivity(rec);
            }
        });
        recipe2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rec = new Intent(".L_recipes");
                rec.putExtra("l_recipe","l_2");
                startActivity(rec);
            }
        });
        lr3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rec = new Intent(".L_recipes");
                rec.putExtra("l_recipe","l_3");
                startActivity(rec);
            }
        });
        recipe3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rec = new Intent(".L_recipes");
                rec.putExtra("l_recipe","l_3");
                startActivity(rec);
            }
        });
        lr4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rec = new Intent(".L_recipes");
                rec.putExtra("l_recipe","l_4");
                startActivity(rec);
            }
        });
        recipe4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rec = new Intent(".L_recipes");
                rec.putExtra("l_recipe","l_4");
                startActivity(rec);
            }
        });
        lr5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rec = new Intent(".L_recipes");
                rec.putExtra("l_recipe","l_5");
                startActivity(rec);
            }
        });
        recipe5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rec = new Intent(".L_recipes");
                rec.putExtra("l_recipe","l_5");
                startActivity(rec);
            }
        });
        lr6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rec = new Intent(".L_recipes");
                rec.putExtra("l_recipe","l_6");
                startActivity(rec);
            }
        });
        recipe6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rec = new Intent(".L_recipes");
                rec.putExtra("l_recipe","l_6");
                startActivity(rec);
            }
        });
        lr7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rec = new Intent(".L_recipes");
                rec.putExtra("l_recipe","l_7");
                startActivity(rec);
            }
        });
        recipe7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rec = new Intent(".L_recipes");
                rec.putExtra("l_recipe","l_7");
                startActivity(rec);
            }
        });
        lr8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rec = new Intent(".L_recipes");
                rec.putExtra("l_recipe","l_8");
                startActivity(rec);
            }
        });
        recipe8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rec = new Intent(".L_recipes");
                rec.putExtra("l_recipe","l_8");
                startActivity(rec);
            }
        });
        lr9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rec = new Intent (".L_recipes");
                rec.putExtra("l_recipe","l_9");
                startActivity(rec);
            }
        });
        recipe9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rec = new Intent (".L_recipes");
                rec.putExtra("l_recipe","l_9");
                startActivity(rec);
            }
        });
        lr10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rec = new Intent (".L_recipes");
                rec.putExtra("l_recipe","l_10");
                startActivity(rec);
            }
        });
        recipe10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rec = new Intent (".L_recipes");
                rec.putExtra("l_recipe","l_10");
                startActivity(rec);
            }
        });
    }

    public void init(){
        recipe1 = (ImageButton) findViewById(R.id.l_recipe1);
        recipe2 = (ImageButton) findViewById(R.id.l_recipe2);
        recipe3 = (ImageButton) findViewById(R.id.l_recipe3);
        recipe4 = (ImageButton) findViewById(R.id.l_recipe4);
        recipe5 = (ImageButton) findViewById(R.id.l_recipe5);
        recipe6 = (ImageButton) findViewById(R.id.l_recipe6);
        recipe7 = (ImageButton) findViewById(R.id.l_recipe7);
        recipe8 = (ImageButton) findViewById(R.id.l_recipe8);
        recipe9 = (ImageButton) findViewById(R.id.l_recipe9);
        recipe10 = (ImageButton) findViewById(R.id.l_recipe10);
        lr1 = (RelativeLayout) findViewById(R.id.l1);
        lr2 = (RelativeLayout) findViewById(R.id.l2);
        lr3 = (RelativeLayout) findViewById(R.id.l3);
        lr4 = (RelativeLayout) findViewById(R.id.l4);
        lr5 = (RelativeLayout) findViewById(R.id.l5);
        lr6 = (RelativeLayout) findViewById(R.id.l6);
        lr7 = (RelativeLayout) findViewById(R.id.l7);
        lr8 = (RelativeLayout) findViewById(R.id.l8);
        lr9 = (RelativeLayout) findViewById(R.id.l9);
        lr10 = (RelativeLayout) findViewById(R.id.l10);
        RecipeActivity_L get = new RecipeActivity_L();
        v1 = Double.parseDouble(get.LNH_T_1[16]);
        v2 = Double.parseDouble(get.LNH_T_2[20]);
        v3 = Double.parseDouble(get.LNH_T_3[14]);
        v4 = Double.parseDouble(get.LNH_T_4[22]);
        v5 = Double.parseDouble(get.LNH_T_5[13]);
        v6 = Double.parseDouble(get.LNH_T_6[16]);
        v7 = Double.parseDouble(get.LNH_T_7[14]);
        v8 = Double.parseDouble(get.LNH_T_8[8]);
        v9 = Double.parseDouble(get.LNH_T_9[13]);
        v10 = Double.parseDouble(get.LNH_T_10[13]);
    }
}
