import java.util.Scanner;

public class SumOfAPSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, n, d;
        int sum = 0;

        System.out.print("Enter first term (a): ");
        a = sc.nextInt();

        System.out.print("Enter number of terms (n): ");
        n = sc.nextInt();

        System.out.print("Enter common difference (d): ");
        d = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int term = a + (i - 1) * d;   // A.P. term
            sum = sum + term;
        }

        System.out.println("Sum: " + sum);
    }
}
