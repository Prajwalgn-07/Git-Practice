package com.prajwal;

import java.util.ArrayList;

public class Division {
    public int dividend;
    public int divisor;
    public Division(int dividend,int divisor){
        this.dividend=dividend;
        this.divisor=divisor;
    }
    public ArrayList<Integer> divide(){
        ArrayList<Integer>temp=new ArrayList<>();
        temp.add(this.dividend/this.divisor);
        temp.add(this.dividend%this.divisor);
        return temp;
    }
}
