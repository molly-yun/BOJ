import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b,c,d,e;

        a = scanner.nextInt();
        b = scanner.nextInt();

        scanner.close();

        System.out.println(a * (b % 10));
        System.out.println(a * (b % 100 / 10));
        System.out.println(a * (b / 100));
        System.out.println(a * b);
    }
}