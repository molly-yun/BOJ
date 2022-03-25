import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;

        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        scanner.close();

        if ((b + c) >= 60) {
            a += ((b + c)/60);
            if(a >= 24) {
                a = a % 24;
            }
            if (((b + c) % 60) == 0) {
                System.out.print(a + " " + 0);
            } else {
                b = ((b + c) % 60);
                System.out.print(a + " " + b);
            }
        } else {
            System.out.print(a + " " + (b+c));
        }
    }
}