import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int n;
		int sum = 0;

		n = scanner.nextInt();

		for(int i = 1 ; i <= n ; i++) {
			sum += i;
		}

		System.out.println(sum);
	}
}