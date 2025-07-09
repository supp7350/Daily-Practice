import java.util.*;

class Demo2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age of the voter :");
        int age = sc.nextInt();

        if(age>0){
            System.out.println("Voter is eligible for voting");
        }
        else{
            System.out.println("Voter is not eligible for voting");

        }

        }
    }
