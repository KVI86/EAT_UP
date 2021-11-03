package com.example.myapplication.Dinner;

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


public class DinnerActivity extends AppCompatActivity {
    public ImageButton recipe1,recipe2,recipe3,recipe4,recipe5,recipe6,recipe7,recipe8,recipe9,recipe10;
    public RelativeLayout dr1,dr2,dr3,dr4,dr5,dr6,dr7,dr8,dr9,dr10;
    public double valueDNR,v1,v2,v3,v4,v5,v6,v7,v8,v9,v10;
    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dinner_recipes);
        init();
        valueDNR = (double) getIntent().getExtras().get("value");
        Logic page = new Logic();
        ArrayList<Double> new_list = page.set_list(3);
        double sum_from_recipes = page.sum(3);
        if (sum_from_recipes > valueDNR){
            while (sum_from_recipes > valueDNR){
                double max_value = page.get_max(new_list);
                sum_from_recipes = sum_from_recipes - max_value;
                new_list.removeIf(n->(n == max_value));
                if (max_value == v1){
                    dr1.setVisibility(View.GONE);
                }
                else  if (max_value == v2){
                    dr2.setVisibility(View.GONE);
                }
                else  if (max_value == v3){
                    dr3.setVisibility(View.GONE);
                }
                else if (max_value == v4){
                    dr4.setVisibility(View.GONE);
                }
                else if (max_value == v5){
                    dr5.setVisibility(View.GONE);
                }
                else if (max_value == v6){
                    dr6.setVisibility(View.GONE);
                }
                else if (max_value == v7){
                    dr7.setVisibility(View.GONE);
                }
                else if (max_value == v8){
                    dr8.setVisibility(View.GONE);
                }
                else  if (max_value == v9){
                    dr9.setVisibility(View.GONE);
                }
                else  if (max_value == v10){
                    dr10.setVisibility(View.GONE);
                }
            }
        }
        addListenerOnButton();
    }
    public void addListenerOnButton() {
        dr1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rec = new Intent(".D_recipes");
                rec.putExtra("d_recipe","d_1");
                startActivity(rec);
            }
        });
        recipe1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rec = new Intent(".D_recipes");
                rec.putExtra("d_recipe","d_1");
                startActivity(rec);
            }
        });
        dr2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rec = new Intent(".D_recipes");
                rec.putExtra("d_recipe","d_2");
                startActivity(rec);
            }
        });
        recipe2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rec = new Intent(".D_recipes");
                rec.putExtra("d_recipe","d_2");
                startActivity(rec);
            }
        });
        dr3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rec = new Intent(".D_recipes");
                rec.putExtra("d_recipe","d_3");
                startActivity(rec);
            }
        });
        recipe3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rec = new Intent(".D_recipes");
                rec.putExtra("d_recipe","d_3");
                startActivity(rec);
            }
        });
        dr4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rec = new Intent(".D_recipes");
                rec.putExtra("d_recipe","d_4");
                startActivity(rec);
            }
        });
        recipe4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rec = new Intent(".D_recipes");
                rec.putExtra("d_recipe","d_4");
                startActivity(rec);
            }
        });
        dr5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rec = new Intent(".D_recipes");
                rec.putExtra("d_recipe","d_5");
                startActivity(rec);
            }
        });
        recipe5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rec = new Intent(".D_recipes");
                rec.putExtra("d_recipe","d_5");
                startActivity(rec);
            }
        });
        dr6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rec = new Intent(".D_recipes");
                rec.putExtra("d_recipe","d_6");
                startActivity(rec);
            }
        });
        recipe6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rec = new Intent(".D_recipes");
                rec.putExtra("d_recipe","d_6");
                startActivity(rec);
            }
        });
        dr7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rec = new Intent(".D_recipes");
                rec.putExtra("d_recipe","d_7");
                startActivity(rec);
            }
        });
        recipe7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rec = new Intent(".D_recipes");
                rec.putExtra("d_recipe","d_7");
                startActivity(rec);
            }
        });
        dr8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rec = new Intent(".D_recipes");
                rec.putExtra("d_recipe","d_8");
                startActivity(rec);
            }
        });
        recipe8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rec = new Intent(".D_recipes");
                rec.putExtra("d_recipe","d_8");
                startActivity(rec);
            }
        });
       dr9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rec = new Intent (".D_recipes");
                rec.putExtra("d_recipe","d_9");
                startActivity(rec);
            }
        });
        recipe9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rec = new Intent (".D_recipes");
                rec.putExtra("d_recipe","d_9");
                startActivity(rec);
            }
        });
        dr10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rec = new Intent (".D_recipes");
                rec.putExtra("d_recipe","d_10");
                startActivity(rec);
            }
        });
        recipe10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rec = new Intent (".D_recipes");
                rec.putExtra("d_recipe","d_10");
                startActivity(rec);
            }
        });
    }

    public void init(){
        recipe1 = (ImageButton) findViewById(R.id.d_recipe1);
        recipe2 = (ImageButton) findViewById(R.id.d_recipe2);
        recipe2 = (ImageButton) findViewById(R.id.d_recipe2);
        recipe3 = (ImageButton) findViewById(R.id.d_recipe3);
        recipe4 = (ImageButton) findViewById(R.id.d_recipe4);
        recipe5 = (ImageButton) findViewById(R.id.d_recipe5);
        recipe6 = (ImageButton) findViewById(R.id.d_recipe6);
        recipe7 = (ImageButton) findViewById(R.id.d_recipe7);
        recipe8 = (ImageButton) findViewById(R.id.d_recipe8);
        recipe9 = (ImageButton) findViewById(R.id.d_recipe9);
        recipe10 = (ImageButton) findViewById(R.id.d_recipe10);
        dr1 = (RelativeLayout) findViewById(R.id.d1);
        dr2 = (RelativeLayout) findViewById(R.id.d2);
        dr3 = (RelativeLayout) findViewById(R.id.d3);
        dr4 = (RelativeLayout) findViewById(R.id.d4);
        dr5 = (RelativeLayout) findViewById(R.id.d5);
        dr6 = (RelativeLayout) findViewById(R.id.d6);
        dr7 = (RelativeLayout) findViewById(R.id.d7);
        dr8 = (RelativeLayout) findViewById(R.id.d8);
        dr9 = (RelativeLayout) findViewById(R.id.d9);
        dr10 = (RelativeLayout) findViewById(R.id.d10);
        RecipeActivity_D get = new RecipeActivity_D();
        v1 = Double.parseDouble(get.DNR_T_1[8]);
        v2 = Double.parseDouble(get.DNR_T_2[13]);
        v3 = Double.parseDouble(get.DNR_T_3[13]);
        v4 = Double.parseDouble(get.DNR_T_4[12]);
        v5 = Double.parseDouble(get.DNR_T_5[8]);
        v6 = Double.parseDouble(get.DNR_T_6[11]);
        v7 = Double.parseDouble(get.DNR_T_7[11]);
        v8 = Double.parseDouble(get.DNR_T_8[9]);
        v9 = Double.parseDouble(get.DNR_T_9[12]);
        v10 = Double.parseDouble(get.DNR_T_10[10]);
    }
}