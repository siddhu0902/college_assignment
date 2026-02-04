import java.util.Scanner;

public class Odd_asterisk {
    public static void main(String[] args){
        System.out.println("Asterisk");
        int s1=5;
        for(int i=0;i<=s1;i++) {
            System.out.println();
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
        }
    }
}