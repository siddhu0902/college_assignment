import java.util.Scanner;

public class AlternateSumSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int x;
        int sum = 0;
        int sign = 1;
        System.out.print("Enter value of x: ");
        x = sc.nextInt();
        System.out.print("Enter number of terms: ");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int power = 2 * i - 1;
            int term = (int) Math.pow(x, power);
            sum = sum + sign * term;
            sign = -sign;
        }
        System.out.println("Sum: " + sum);
    }
}
