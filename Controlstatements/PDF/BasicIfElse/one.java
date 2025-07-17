package Controlstatements.PDF.BasicIfElse;

import java.util.Scanner;

public class one {
    public static void main(String[] args){
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        if(num>0){
            System.out.println("The number is Positive");

        }else if(num<0){
            System.out.println("The number is negative");

        }
        else{
            System.out.println("The number is zero");

        }
    }
}
