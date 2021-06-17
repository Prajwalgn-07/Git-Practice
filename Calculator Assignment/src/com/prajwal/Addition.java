package com.prajwal;

import java.util.ArrayList;

public class Addition {
    ArrayList<Double>numbers=new ArrayList<>();

    public Addition(ArrayList<Double>values){
        numbers=values;
    }
    public double add(){
        double temp=0;
        for(int i=0;i<numbers.size();i++){
            temp+= numbers.get(i);
        }
        return temp;
    }
}
