import java.util.*;

class Demo3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number :");
        int num1 = sc.nextInt();

        if(num1 % 8 == 0){
            System.out.println("The number is divisible by 8");

        }else{
            System.out.println("The number is not divisible by 8");
        }
        }
    }