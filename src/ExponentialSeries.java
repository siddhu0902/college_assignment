import java.util.Scanner;

public class ExponentialSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        double x, sum = 1.0, term = 1.0;
        System.out.print("Enter value of x: ");
        x = sc.nextDouble();
        System.out.print("Enter number of terms: ");
        n = sc.nextInt();
        for (int i = 1; i < n; i++) {
            term = term * x / i;
            sum = sum + term;
        }
        System.out.printf("Sum: %.6f", sum);
    }
}
