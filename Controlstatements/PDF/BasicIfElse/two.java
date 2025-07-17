package Controlstatements.PDF.BasicIfElse;

import java.util.Scanner;

public class two {
    public static void main(String[] args){
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        if(num% 2 == 0){
            System.out.println("The number is even");
            if(num>10){
                System.out.println("Greater than 10");

            }

            else if(num<10){
              System.out.println("less than 10");  
            }

            else{
                System.out.println("Is 10");  
            }

        }
        //else if(num<0){
            //System.out.println("The number is negative");

       // }
        else{
            System.out.println("The number is Odd");
            if(num>10){
                System.out.println("Greater than 10");

            }

            else if(num<10){
              System.out.println("less than 10");  
            }

            else{
                System.out.println("Is 10");  
            }

        }
    }
}
