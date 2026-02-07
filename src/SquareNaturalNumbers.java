import java.util.Scanner;

public class SquareNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, sum = 0;

        System.out.print("Enter number of terms: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int square = i * i;
            System.out.print(square + " ");
            sum = sum + square;
        }
        System.out.println(", Sum: " + sum);
    }
}
