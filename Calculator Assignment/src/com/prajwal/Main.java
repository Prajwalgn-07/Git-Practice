package com.prajwal;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to Calculate in Calculator");
        while(true) {
            System.out.println("enter your choice");
            System.out.println("1.Addition" + "\n" + "2.Subtraction" + "\n" + "3.Multiplication" + "\n" + "4.Division"
                                +"5.Exit");
            Scanner input = new Scanner(System.in);
            int choice= input.nextInt();
            if(choice==1){
                System.out.println("enter how many numbers you want to add: ");
                int number= input.nextInt();
                ArrayList<Integer>values=new ArrayList<>();
                for(int i=0;i<number;i++){
                    System.out.println("Enter the values"+"\n");
                    values.add(input.nextInt());
                }
                Addition addition=new addition(values);
                System.out.println("the sum is"+addition.add());
            }
            else if(choice==2){
                System.out.println("Enter the two numbers you want to subtract"+"\n");
                int firstNumber= input.nextInt();
                int secondNumber= input.nextInt();
                Subtraction subtraction=new Subtraction(firstNumber,secondNumber);
                System.out.println("The difference is:"+subtraction.Subtract());
            }
            else if(choice==3){
                System.out.println("Enter the number of numbers you want to multiply");
                int count= input.nextInt();
                ArrayList<Integer>values=new ArrayList<>();
                for(int i=0;i<count;i++){
                    values.add(input.nextInt());
                }
                Multiplication multiplication=new Multiplication(values);
                System.out.println("The product is:"+multiplication.multiply());
            }
            else if(choice==4){
                System.out.println("Enter the dividend"+"\n");
                int dividend= input.nextInt();
                System.out.println("Enter the divisor"+"\n");
                int divisor= input.nextInt();
                Division division=new Division(dividend,divisor);
                ArrayList<Integer>result=division.divide();
                System.out.println("The quotient is:"+result.get(0)+"\n"+"The remainder is:"+result.get(1));
            }
            else if(choice==5)
                break;
        }
    }
}
