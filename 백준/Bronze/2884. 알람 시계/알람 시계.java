import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H, M;

        H = scanner.nextInt();
        M = scanner.nextInt();
        scanner.close();

        if(M < 45) {
            if(H == 0) {
                H = 23;
            } else {
                H--;
            }
            M = M + 60 - 45;
            System.out.print(H + " " + M);
        } else {
            M = M - 45;
            System.out.print(H + " " + M);
        }
    }
}
