package lab1_4;
import java.util.Scanner;	// import รับค่าจากผู้ใช้งาน

public class lab1_4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number001 = input.nextInt();	//	ให้ number001 เท่ากับค่าที่กรอกเข้ามา
		input.close();	//	ปิดการรับค่าจากผู้ใช้
		
		if (number001 >= 80 ) {	// Start if เมื่อ number001 มากกว่าหรือเท่ากับ 80
			System.out.println("A");	//	ให้เเสดงค่าว่า A
		} else if (number001 >= 70) {	//	เมื่อ number001 มากกว่าหรือเท่ากับ 70
			System.out.println("B");	//	ให้เเสดงค่าว่า B
		} else if (number001 >= 60 ) {	//	เมื่อ number001 มากกว่าหรือเท่ากับ 60
			System.out.println("C");	//	ให้เเสดงค่าว่า C
		} else if (number001 >= 50 ) {	//	เมื่อ number001 มากกว่าหรือเท่ากับ 50
			System.out.println("D");	//	ให้เเสดงค่าว่า D
		} else if (number001 < 50 ) {	//	เมื่อ number001 น้อยกว่า 50
			System.out.println("F");	//	ให้เเสดงค่าว่า F
		}	//	End if
	}	// End main
}	//	End class