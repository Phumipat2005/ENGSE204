package lab1_10;
import java.util.Scanner;	//	import การรับค่าจากผู้ใช้งานเข้ามา

public class lab1_10 {
	public static double calculateArea(double weight , double height) {
		double result = weight * height;	//	นำค่า weight คููณกับ height
		return result;	//	ส่งค่า result กลับ
	}	//	End calculateArea

	public static void main(String[] args) {
		System.out.println("Enter number");	//	เเสดงคำว่า	Enter number
		Scanner input = new Scanner(System.in);	//	รับค่าจากผู้ใช้
		double weight = input.nextDouble();	//	ค่าที่รับมาตัวที่ 1 ให้เป็น weight
		double height = input.nextDouble();	//	ค่าที่รับมาตัวที่ 2 ให้เป็น height
		double sum = calculateArea(weight , height);	//	ให้ sum เท่ากับ calculateArea
		System.out.println(sum);	//	แสดงค่าของ sum ออกมา
		input.close();	//	ปิดการรับค่าจากผู้ใช้
	}	//	End main
}