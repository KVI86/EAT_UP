package com.example.myapplication;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.constraintlayout.widget.ConstraintLayout;


import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    static {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
    }
    private Button to_menu_page;
    public EditText editText;
    public double BRF,LNH,DNR;
    @RequiresApi(api = Build.VERSION_CODES.N)
    @SuppressLint("WrongConstant")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_page);
        addListenerOnButton();
    }
    public void addListenerOnButton() {
        to_menu_page = (Button) findViewById(R.id.get_value);
        editText = (EditText) findViewById(R.id.editTextNumber);

        to_menu_page.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String text = editText.getText().toString();
                        if ((text.length() == 0) || (Integer.parseInt(text)==0)||(Integer.parseInt(text)<0)){
                            Toast toast = Toast.makeText(getApplicationContext(),"Введите сумму",Toast.LENGTH_SHORT);
                            toast.show();
                        }else if(text.length() != 0){
                            int from_user = Integer.parseInt(text);
                            BRF = round((from_user/5));
                            LNH = round((from_user/5*2));
                            DNR = round((from_user/5*2));
                            Intent menu = new Intent(".menu");
                            menu.putExtra("valueBRF",BRF);
                            menu.putExtra("valueLNH",LNH);
                            menu.putExtra("valueDNR",DNR);
                            editText.getText().clear();
                            startActivity(menu);
                        }
                    }
                }
        );
    }
    public double round (double value){
        double scale = Math.pow(10,2);
        value = Math.ceil(value * scale)/scale;
        return value;
    }
    /*адаптивность фона*/
    /*public void get_size(){
        int Screen_width,Screen_height;
        RelativeLayout breakfast_recipes,dinner_recipes,layout_for_all_recipes,lunch_recipes;
        ConstraintLayout menu_page,start_page;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        WindowManager windowmanager = (WindowManager)getApplicationContext().getSystemService(Context.WINDOW_SERVICE);
        windowmanager.getDefaultDisplay().getMetrics(displayMetrics);
        int deviceWidth = displayMetrics.widthPixels;
        int deviceHeight = displayMetrics.heightPixels;
        System.out.println(deviceWidth+"x"+deviceHeight);

    }*/
}