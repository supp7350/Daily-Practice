import java.util.*;

class Demo6{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1 :");
        int num1 = sc.nextInt();

        System.out.println("Enter num2 :");
        int num2 = sc.nextInt();

        if(num1<num2){
            for(int i = num1 + 1; i<num2; i++){
                System.out.println(i);

            }
        
        }else if(num1>num2){
            for(int i = num2 - 1; i>num1; i--){
              System.out.println(i); 
            }
            
        }else{
            System.out.println("No numbers between num1 and num2");

        }
        
    }
}