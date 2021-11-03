package com.example.myapplication.Brekfast;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import com.example.myapplication.Logic;
import com.example.myapplication.R;
import java.util.ArrayList;


public class BreakfastActivity extends AppCompatActivity {
    public ImageButton recipe1,recipe2,recipe3,recipe4,recipe5,recipe6,recipe7,recipe8,recipe9,recipe10;
    public RelativeLayout bl1,bl2,bl3,bl4,bl5,bl6,bl7,bl8,bl9,bl10;
    public double valueBRF,v1,v2,v3,v4,v5,v6,v7,v8,v9,v10;
    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.breakfast_recipes);
        init();
        valueBRF = (double) getIntent().getExtras().get("value");
        Logic page = new Logic();
        ArrayList<Double> new_list = page.set_list(1);
        double sum_from_recipes = page.sum(1);
        if (sum_from_recipes > valueBRF){
            while (sum_from_recipes > valueBRF){
                double max_value = page.get_max(new_list);
                sum_from_recipes = sum_from_recipes - max_value;
                new_list.removeIf(n->(n == max_value));
                if (max_value == v1){
                    bl1.setVisibility(View.GONE);
                }
                else  if (max_value == v2){
                    bl2.setVisibility(View.GONE);
                }
                else  if (max_value == v3){
                    bl3.setVisibility(View.GONE);
                }
                else if (max_value == v4){
                    bl4.setVisibility(View.GONE);
                }
                else if (max_value == v5){
                    bl5.setVisibility(View.GONE);
                }
                else if (max_value == v6){
                    bl6.setVisibility(View.GONE);
                }
                else if (max_value == v7){
                    bl7.setVisibility(View.GONE);
                }
                else if (max_value == v8){
                    bl8.setVisibility(View.GONE);
                }
                else  if (max_value == v9){
                    bl9.setVisibility(View.GONE);
                }
                else  if (max_value == v10){
                    bl10.setVisibility(View.GONE);
                }
            }
        }
        addListenerOnButton();
    }
    public void addListenerOnButton() {
        bl1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rec = new Intent(".B_recipes");
                rec.putExtra("b_recipe",1);
                startActivity(rec);
            }
        });
        recipe1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent rec = new Intent(".B_recipes");
                        rec.putExtra("b_recipe",1);
                        startActivity(rec);
                    }
                });
        bl2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rec = new Intent(".B_recipes");
                rec.putExtra("b_recipe",2);
                startActivity(rec);
            }
        });
        recipe2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent rec = new Intent(".B_recipes");
                        rec.putExtra("b_recipe",2);
                        startActivity(rec);
                    }
                });
        bl3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rec = new Intent(".B_recipes");
                rec.putExtra("b_recipe",3);
                startActivity(rec);
            }
        });
        recipe3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent rec = new Intent(".B_recipes");
                        rec.putExtra("b_recipe",3);
                        startActivity(rec);
                    }
                });
        bl4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rec = new Intent(".B_recipes");
                rec.putExtra("b_recipe",4);
                startActivity(rec);
            }
        });
        recipe4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent rec = new Intent(".B_recipes");
                        rec.putExtra("b_recipe",4);
                        startActivity(rec);
                    }
                });
        bl5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rec = new Intent(".B_recipes");
                rec.putExtra("b_recipe",5);
                startActivity(rec);
            }
        });
        recipe5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent rec = new Intent(".B_recipes");
                        rec.putExtra("b_recipe",5);
                        startActivity(rec);
                    }
                });
        bl6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rec = new Intent(".B_recipes");
                rec.putExtra("b_recipe",6);
                startActivity(rec);
            }
        });
        recipe6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent rec = new Intent(".B_recipes");
                        rec.putExtra("b_recipe",6);
                        startActivity(rec);
                    }
                });
        bl7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rec = new Intent(".B_recipes");
                rec.putExtra("b_recipe",7);
                startActivity(rec);
            }
        });
        recipe7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent rec = new Intent(".B_recipes");
                        rec.putExtra("b_recipe",7);
                        startActivity(rec);
                    }
                });
        bl8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rec = new Intent(".B_recipes");
                rec.putExtra("b_recipe",8);
                startActivity(rec);
            }
        });
        recipe8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent rec = new Intent(".B_recipes");
                        rec.putExtra("b_recipe",8);
                        startActivity(rec);
                    }
                });
        bl9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rec = new Intent (".B_recipes");
                rec.putExtra("b_recipe",9);
                startActivity(rec);
            }
        });
        recipe9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rec = new Intent (".B_recipes");
                rec.putExtra("b_recipe",9);
                startActivity(rec);
            }
        });
        bl10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rec = new Intent (".B_recipes");
                rec.putExtra("b_recipe",10);
                startActivity(rec);
            }
        });
        recipe10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rec = new Intent (".B_recipes");
                rec.putExtra("b_recipe",10);
                startActivity(rec);
            }
        });

    }
    public void init(){
        recipe1 = (ImageButton) findViewById(R.id.b_recipe1);
        recipe2 = (ImageButton) findViewById(R.id.b_recipe2);
        recipe3 = (ImageButton) findViewById(R.id.b_recipe3);
        recipe4 = (ImageButton) findViewById(R.id.b_recipe4);
        recipe5 = (ImageButton) findViewById(R.id.b_recipe5);
        recipe6 = (ImageButton) findViewById(R.id.b_recipe6);
        recipe7 = (ImageButton) findViewById(R.id.b_recipe7);
        recipe8 = (ImageButton) findViewById(R.id.b_recipe8);
        recipe9 = (ImageButton) findViewById(R.id.b_recipe9);
        recipe10 = (ImageButton) findViewById(R.id.b_recipe10);
        bl1 = (RelativeLayout) findViewById(R.id.b1);
        bl2 = (RelativeLayout) findViewById(R.id.b2);
        bl3 = (RelativeLayout) findViewById(R.id.b3);
        bl4 = (RelativeLayout) findViewById(R.id.b4);
        bl5 = (RelativeLayout) findViewById(R.id.b5);
        bl6 = (RelativeLayout) findViewById(R.id.b6);
        bl7 = (RelativeLayout) findViewById(R.id.b7);
        bl8 = (RelativeLayout) findViewById(R.id.b8);
        bl9 = (RelativeLayout) findViewById(R.id.b9);
        bl10 = (RelativeLayout) findViewById(R.id.b10);
        RecipeActivity_B get = new RecipeActivity_B();
        v1 = Double.parseDouble(get.BRF_T_1[10]);
        v2 = Double.parseDouble(get.BRF_T_2[16]);
        v3 = Double.parseDouble(get.BRF_T_3[17]);
        v4 = Double.parseDouble(get.BRF_T_4[13]);
        v5 = Double.parseDouble(get.BRF_T_5[16]);
        v6 = Double.parseDouble(get.BRF_T_6[9]);
        v7 = Double.parseDouble(get.BRF_T_7[9]);
        v8 = Double.parseDouble(get.BRF_T_8[20]);
        v9 = Double.parseDouble(get.BRF_T_9[8]);
        v10 = Double.parseDouble(get.BRF_T_10[8]);
    }
}