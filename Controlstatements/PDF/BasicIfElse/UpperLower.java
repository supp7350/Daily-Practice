package Controlstatements.PDF.BasicIfElse;

import java.util.Scanner;

public class UpperLower {
    public static void main(String[] args){
        //Scanner sc = new Scanner(System.in);
        //int ch = sc.nextInt();
        //ch = char(ch);
        char ch = 'A';

        if(ch>= 'A' && ch<='Z'){
            System.out.println(ch + " is in the UPPERCASE");

        }
        else if(ch>= 'a' && ch<='z'){
            System.out.println(ch + " is in the LOWECASE");


        }
        else{
            System.out.println("Invalid Input");

        }
    }
}