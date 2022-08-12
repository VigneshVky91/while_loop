import java.util.Scanner;

public class WhileLoopExample {
	public static void main(String[] args) {
		int num_of_times;
		String name;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of times to print and your name:");
		num_of_times = scan.nextInt();
		name = scan.next();

		// intialization
		int i = num_of_times;
		while (i > 0) {
			System.out.println(i + name);
			i--;
		}
	}
}
