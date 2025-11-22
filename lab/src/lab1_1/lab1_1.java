package lab1_1;
import java.util.Scanner;

public class lab1_1 {

	public static void main(String[] args) {
		System.out.println("Enter number : ");
		Scanner input = new Scanner(System.in);
		int number001 = input.nextInt();
		int number002 = input.nextInt();
		System.out.println(number001 + number002);
		input.close();
	}
}