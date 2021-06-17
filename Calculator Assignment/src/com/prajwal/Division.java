package com.prajwal;

import java.util.ArrayList;

public class Division {
    private double dividend;
    private double divisor;
    public Division(double dividend,double divisor){
        this.dividend=dividend;
        this.divisor=divisor;
    }
    public ArrayList<Double> divide(){
        ArrayList<Double>temp=new ArrayList<>();
        temp.add(this.dividend/this.divisor);
        temp.add(this.dividend%this.divisor);
        return temp;
    }
}
