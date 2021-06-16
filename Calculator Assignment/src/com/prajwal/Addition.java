package com.prajwal;

import java.util.ArrayList;

public class Addition {
    ArrayList<Integer>numbers=new ArrayList<>();

    public Addition(ArrayList<Integer>values){
        numbers=values;
    }
    public int add(){
        int temp=0;
        for(int i=0;i<numbers.size();i++){
            temp+= numbers.get(i);
        }
        return temp;
    }
}
