import java.util.*;

class Demo5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number :");
        int num1 = sc.nextInt();

        if(num1 % 16 == 0){
            System.out.println("The number "+num1 + " is in the table of 16");

        }else{
            System.out.println("The number "+num1 + " is not in the table of 16");
        }
    }
}