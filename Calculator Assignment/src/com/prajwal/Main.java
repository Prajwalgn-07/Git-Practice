package com.prajwal;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to Calculate in Calculator");
        while(true) {
            System.out.println("enter your choice");
            System.out.println("1.Addition" + "\n" + "2.Subtraction" + "\n" + "3.Multiplication" + "\n" + "4.Division"
                                +"\n"+"5.Exit");
            Scanner input = new Scanner(System.in);
            int choice= input.nextInt();
            if(choice==1){
                System.out.println("enter how many numbers you want to add: ");
                int number= input.nextInt();
                ArrayList<Double>values=new ArrayList<>();
                System.out.println("Enter the values");
                for(int i=0;i<number;i++){
                    values.add(input.nextDouble());
                }
                Addition addition=new Addition(values);
                System.out.println("The sum is: "+addition.add());
            }
            else if(choice==2){
                System.out.println("Enter the two numbers you want to subtract");
                double firstNumber= input.nextDouble();
                double secondNumber= input.nextDouble();
                Subtraction subtraction=new Subtraction(firstNumber,secondNumber);
                System.out.println("The difference is:"+subtraction.Subtract());
            }
            else if(choice==3){
                System.out.println("Enter the number of numbers you want to multiply");
                int count= input.nextInt();
                ArrayList<Double>values=new ArrayList<>();
                System.out.println("Enter the values");
                for(int i=0;i<count;i++){
                    values.add(input.nextDouble());
                }
                Multiplication multiplication=new Multiplication(values);
                System.out.println("The product is:"+multiplication.multiply());
            }
            else if(choice==4){
                System.out.println("Enter the dividend");
                double dividend= input.nextInt();
                System.out.println("Enter the divisor");
                double divisor= input.nextInt();
                Division division=new Division(dividend,divisor);
                ArrayList<Double>result=division.divide();
                System.out.println("The quotient is:"+result.get(0)+"\n"+"The remainder is:"+result.get(1));
            }
            else if(choice==5)
                break;
        }
    }
}
