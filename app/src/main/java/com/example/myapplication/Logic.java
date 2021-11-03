package com.example.myapplication;


import com.example.myapplication.Brekfast.RecipeActivity_B;
import com.example.myapplication.Dinner.RecipeActivity_D;
import com.example.myapplication.Lunch.RecipeActivity_L;

import java.util.ArrayList;

public class Logic {
    public double BRF_recipe_1,BRF_recipe_2,BRF_recipe_3,BRF_recipe_4,BRF_recipe_5,BRF_recipe_6,BRF_recipe_7,BRF_recipe_8,BRF_recipe_9,BRF_recipe_10;
    public double LNH_recipe_1,LNH_recipe_2,LNH_recipe_3,LNH_recipe_4,LNH_recipe_5,LNH_recipe_6,LNH_recipe_7,LNH_recipe_8,LNH_recipe_9,LNH_recipe_10;
    public double DNR_recipe_1,DNR_recipe_2,DNR_recipe_3,DNR_recipe_4,DNR_recipe_5,DNR_recipe_6,DNR_recipe_7,DNR_recipe_8,DNR_recipe_9,DNR_recipe_10;
    public void get_coast(String a) {
        if (a=="BRF"){
            RecipeActivity_B getter = new RecipeActivity_B();
            BRF_recipe_1 = Double.parseDouble(getter.BRF_T_1[10]);
            BRF_recipe_2 = Double.parseDouble(getter.BRF_T_2[16]);
            BRF_recipe_3 = Double.parseDouble(getter.BRF_T_3[17]);
            BRF_recipe_4 = Double.parseDouble(getter.BRF_T_4[13]);
            BRF_recipe_5 = Double.parseDouble(getter.BRF_T_5[16]);
            BRF_recipe_6 = Double.parseDouble(getter.BRF_T_6[9]);
            BRF_recipe_7 = Double.parseDouble(getter.BRF_T_7[9]);
            BRF_recipe_8 = Double.parseDouble(getter.BRF_T_8[20]);
            BRF_recipe_9 = Double.parseDouble(getter.BRF_T_9[8]);
            BRF_recipe_10 = Double.parseDouble(getter.BRF_T_10[8]);
        }else if (a=="LNH"){
            RecipeActivity_L getter = new RecipeActivity_L();
            LNH_recipe_1 = Double.parseDouble(getter.LNH_T_1[16]);
            LNH_recipe_2 = Double.parseDouble(getter.LNH_T_2[20]);
            LNH_recipe_3 = Double.parseDouble(getter.LNH_T_3[14]);
            LNH_recipe_4 = Double.parseDouble(getter.LNH_T_4[22]);
            LNH_recipe_5 = Double.parseDouble(getter.LNH_T_5[13]);
            LNH_recipe_6 = Double.parseDouble(getter.LNH_T_6[16]);
            LNH_recipe_7 = Double.parseDouble(getter.LNH_T_7[14]);
            LNH_recipe_8 = Double.parseDouble(getter.LNH_T_8[8]);
            LNH_recipe_9 = Double.parseDouble(getter.LNH_T_9[13]);
            LNH_recipe_10 = Double.parseDouble(getter.LNH_T_10[13]);
        }else if (a=="DNR"){
            RecipeActivity_D getter = new RecipeActivity_D();
            DNR_recipe_1 = Double.parseDouble(getter.DNR_T_1[8]);
            DNR_recipe_2 = Double.parseDouble(getter.DNR_T_2[13]);
            DNR_recipe_3 = Double.parseDouble(getter.DNR_T_3[13]);
            DNR_recipe_4 = Double.parseDouble(getter.DNR_T_4[12]);
            DNR_recipe_5 = Double.parseDouble(getter.DNR_T_5[8]);
            DNR_recipe_6 = Double.parseDouble(getter.DNR_T_6[11]);
            DNR_recipe_7 = Double.parseDouble(getter.DNR_T_7[11]);
            DNR_recipe_8 = Double.parseDouble(getter.DNR_T_8[9]);
            DNR_recipe_9 = Double.parseDouble(getter.DNR_T_9[12]);
            DNR_recipe_10 = Double.parseDouble(getter.DNR_T_10[10]);
        }

    }
    public ArrayList<Double> set_list(int a){
        ArrayList<Double> list = new ArrayList<Double>();
        if (a==1){
            get_coast("BRF");
            list.add(BRF_recipe_1);
            list.add(BRF_recipe_2);
            list.add(BRF_recipe_3);
            list.add(BRF_recipe_4);
            list.add(BRF_recipe_5);
            list.add(BRF_recipe_6);
            list.add(BRF_recipe_7);
            list.add(BRF_recipe_8);
            list.add(BRF_recipe_9);
            list.add(BRF_recipe_10);
        }else if (a==2){
            get_coast("LNH");
            list.add(LNH_recipe_1);
            list.add(LNH_recipe_2);
            list.add(LNH_recipe_3);
            list.add(LNH_recipe_4);
            list.add(LNH_recipe_5);
            list.add(LNH_recipe_6);
            list.add(LNH_recipe_7);
            list.add(LNH_recipe_8);
            list.add(LNH_recipe_9);
            list.add(LNH_recipe_10);
        }else if (a==3){
            get_coast("DNR");
            list.add(DNR_recipe_1);
            list.add(DNR_recipe_2);
            list.add(DNR_recipe_3);
            list.add(DNR_recipe_4);
            list.add(DNR_recipe_5);
            list.add(DNR_recipe_6);
            list.add(DNR_recipe_7);
            list.add(DNR_recipe_8);
            list.add(DNR_recipe_9);
            list.add(DNR_recipe_10);
        }
        return list;
    }
    public double get_max(ArrayList<Double> a ){
        double max = 0;
        for (int i = 0;i<a.size();i++){
            if (a.get(i) > max){
                max = a.get(i);
            }
        }
        return max;
    }
    /*public double sum(int c){
        double b = 0;
        if (c==1){
            for (int i = 0;i<set_list(1).size();i++){
                b = b + (double) set_list(1).get(i);
            }
            return b;
        }else if (c==2){
            for (int i = 0;i<set_list(2).size();i++){
                b = b + (double) set_list(2).get(i);
            }
            return b;
        }

        return b;
    }*/
    public double sum (int c){
        double b = 0;
        switch (c){
            case 1:
                for (int i = 0;i<set_list(1).size();i++){
                b += (double) set_list(1).get(i);
                }
                break;
            case 2:
                for (int i = 0;i<set_list(2).size();i++){
                    b += (double) set_list(2).get(i);
                }
                break;
            case 3:
                for(int i = 0;i<set_list(3).size();i++){
                    b += (double) set_list(3).get(i);
                }
        }
        return b;
    }

}
