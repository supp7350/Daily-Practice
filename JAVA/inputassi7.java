import java.util.*;

class Demo7{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number :");
        int num1 = sc.nextInt();

        for(int i = 10; i>=1; i--){
            
            System.out.println(i*num1);
        }

        
    }
}