package lab1_3;
import java.util.Scanner;	//	import รับค่าจากผู้ใช้งาน

public class lab1_3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number001 = input.nextInt();	//	ให้ number001 เท่ากับค่าที่กรอกเข้ามา
		if (number001 % 2 == 0) {	//	Start if
			System.out.println("Even");	//	เเสดงคำว่า Even
		} else
			System.out.println("Odd");	//	เเสดงค่าว่า Odd
	}	// 	End main
}	// End class