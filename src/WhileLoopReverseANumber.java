import java.util.Scanner;

public class WhileLoopReverseANumber {
	public static void main(String[] args) {
		int num = 0;
		Scanner scan = new Scanner(System.in);

		System.out.println("Input number of times to print:");
		num = scan.nextInt();
		// num = 123
		int i = 0;
		while (num > 0) {
			i = num % 10;
			System.out.print(i);
			num = num / 10;
		}

	}
}
