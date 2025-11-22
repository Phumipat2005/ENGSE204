package lab1_3;
import java.util.Scanner;

public class lab1_3 {

	public static void main(String[] args) {
		int number001;
		System.out.println("Enter number :");
		Scanner input = new Scanner(System.in);
		number001 = input.nextInt();
		if (number001 % 2 == 0) {
			System.out.println("Even");
		} else
			System.out.println("Odd");
	}
}