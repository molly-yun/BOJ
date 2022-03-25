import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c, m;

        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        scanner.close();

        m = Math.max(a, b);
        m = Math.max(m, c);

        if (a == b && b == c) {
            System.out.print(10000 + (a * 1000));
        } else if (a == b && b != c) {
            System.out.print(1000 + (a * 100));
        } else if (a != b && b == c) {
            System.out.print(1000 + (b * 100));
        } else if (a != b && a == c) {
            System.out.print(1000 + (a * 100));
        } else if (a != b && b != c) {
            System.out.print(m * 100);
        }

    }
}