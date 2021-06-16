package com.prajwal;

import java.util.ArrayList;

public class Multiplication {
    ArrayList<Integer>numbers=new ArrayList<Integer>();
    public Multiplication(ArrayList<Integer>values){
        numbers=values;
    }
    public int multiply(){
        int temp=1;
        for(int i=0;i<numbers.size();i++){
            temp*= numbers.get(i);
        }
        return temp;
    }
}
