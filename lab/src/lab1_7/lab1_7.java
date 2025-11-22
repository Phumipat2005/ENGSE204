package lab1_7;
import java.util.Scanner;	//	เพิ่มฟังค์ชั่นรับค่าจากผู้ใช้เข้ามา

public class lab1_7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	// รับค่า input จากผู้ใช้งาน
		System.out.print("Enter number : ");	//	แสดงคำว่า Enter number :
		int number001 = input.nextInt();	// ให้ number001 = ค่าที่กรอกเข้าไป
		int sum = 0;	// ให้ค่าของ sum เท่ากับ 0
		
		for (int i = 1; i <= number001; i++) {	// เริ่ม For Loop โดยให้ i = 1 เเละให้วนไปเรื่อยๆจนกว่าค่าของ i จะเท่ากับ number001
			int number = input.nextInt();	// ให้ number เท่ากับค่าที่กรอกเข้ามา
			sum += number;	//	นำ sum += number
		}	// End For Loop
		System.out.println(sum);	//	แสดงค่าของ sum
		input.close();	// ปิดการรับค่า
	}
}