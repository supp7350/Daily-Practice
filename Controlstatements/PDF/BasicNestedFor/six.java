package Controlstatements.PDF.BasicNestedFor;

public class six {
    public static void main(String[] args){
        int num = 1;
        char ch = 'A';
        for(int i = 1; i<=3; i++){
            for(int j = 1; j<=3; j++){
                System.out.print(num*ch + " ");

            }
            num = num++;
            ch = ch+1;
            System.out.println();

        }
    }
}
