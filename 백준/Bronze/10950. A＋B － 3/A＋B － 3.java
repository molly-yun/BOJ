import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t, a = 0, b = 0;
        int[] s_array;

        t = scanner.nextInt();
        s_array = new int[t];

        for (int i = 0; i < t; i++) {
            a = scanner.nextInt();
            b = scanner.nextInt();
            s_array[i] = a + b;
        }

        for (int j = 0; j < t; j++) {
            System.out.println(s_array[j]);
        }
    }
}