public class Increase_no {
    public static void main(String[] args) {
        int rows = 4;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i+j);
            }
            System.out.println();
        }
    }
}
