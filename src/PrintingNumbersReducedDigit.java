import java.util.Scanner;

public class PrintingNumbersReducedDigit {
	public static void main(String[] args) {
		int num = 0;
		Scanner scan = new Scanner(System.in);

		System.out.println("Input number of times to print:");
		num = scan.nextInt();
		// num = 123
		int i = 0;
		int sum = 0;
		while (num > 0) {
			i = num % 10;
			System.out.println(num);
			num = num / 10;
		}
	}
}
