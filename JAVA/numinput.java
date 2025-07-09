import java.util.Scanner;;

class Demo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1 : ");
        int num1 = sc.nextInt();
        System.out.println("Num1 is "+num1);

        System.out.println("Enter num2 : ");
        int num2 = sc.nextInt();
        System.out.println("Num2 is "+num2);

        int num3 = num1+num2;
        System.out.println("Addition of Both is "+num3);

        System.out.println(num1+num2);



    }
}