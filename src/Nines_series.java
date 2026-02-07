import java.util.Scanner;

public class Nines_series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        long t = 0, sum = 0;
        System.out.print("Enter number of terms: ");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            t = (t * 10) + 9;
            sum = sum + t;
        }
        System.out.println("Sum: " + sum);
    }
}
