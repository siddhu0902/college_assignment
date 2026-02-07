import java.util.Scanner;

public class HarmonicSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        double sum = 0.0;
        System.out.print("Enter number of terms: ");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            double term = 1.0 / i;
            System.out.print("1/" + i + " ");
            sum = sum + term;
        }
        System.out.printf("\nSum: %.6f", sum);
    }
}
