package com.prajwal;

import java.util.ArrayList;

public class Multiplication {
    ArrayList<Double>numbers=new ArrayList<Double>();
    public Multiplication(ArrayList<Double>values){
        numbers=values;
    }
    public double multiply(){
        double temp=1;
        for(int i=0;i<numbers.size();i++){
            temp*= numbers.get(i);
        }
        return temp;
    }
}
