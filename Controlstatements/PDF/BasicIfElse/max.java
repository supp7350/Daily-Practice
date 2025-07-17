package Controlstatements.PDF.BasicIfElse;

import java.util.Scanner;

public class max {
    public static void main(String[] args){
       
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number1");
        int num1 = sc.nextInt();

        System.out.println("Enter the number2");
        int num2 = sc.nextInt();
        if(num1>num2){
            System.out.println(num1 + " Is greater than " + num2);
            System.out.println("The Difference Between them Is :");
            System.out.println(num1-num2);
        }
        else if(num1<num2){
             System.out.println(num1 + " Is less than " + num2);
             System.out.println("The Difference Between them Is :");
            System.out.println(num2-num1);
        }
        else if(num1 == num2){
            System.out.println(num1 + " Is equal to " + num2);
            System.out.println("The Difference Between them Is :");
            System.out.println(0);
        }
        else{
            System.out.println("Invalid Input");
        }
        }
    }

