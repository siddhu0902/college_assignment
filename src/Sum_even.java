import java.util.Scanner;

public class Sum_even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, sum = 0;

        System.out.print("Enter number of terms: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int even = 2 * i;
            System.out.print(even + " ");
            sum = sum + even;
        }
        System.out.println(", Sum: " + sum);
    }
}
