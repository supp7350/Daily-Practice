package Controlstatements.PDF.BasicNestedFor;

public class five {
    public static void main(String[] args){
        char ch = 'A';
        for(int i = 1; i<=4; i++){
            for(int j = 1; j<=4; j++){
                System.out.print((ch+2) + " ");
                ch = ch+2;

            }
            System.out.println();
        }
    }
}
