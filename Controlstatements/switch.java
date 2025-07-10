package Controlstatements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class SwitchDemo{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        switch(num){
            case 1 :
            System.out.println("One");
            break;

            case 2 : 
            System.out.println("Two");
            break;

            case 3 :
            System.out.println("Three");
            break;

            default: 
            System.out.println("In default state");

        }
    }
}