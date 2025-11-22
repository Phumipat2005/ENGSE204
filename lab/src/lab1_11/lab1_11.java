package lab1_11;
import java.util.Scanner;

public class lab1_11 {
	public static int sumArray(int [] allarray , int maxarray) {
		int sum = 0;
		for (int i = 0; i < maxarray; i++) {
			sum += allarray[i];
		}	// End For Loop
		return sum;	//	ส่งค่าของ sum กลับ
	}	//	End sumArray
	
	public static void main(String[] args) {
		System.out.print("Enter number : ");
		Scanner input = new Scanner (System.in);
		int maxarray = input.nextInt();
		int [] allarray = new int [maxarray];
		
		for (int i = 0; i < maxarray; i++) {
			int numarray = input.nextInt();
			allarray[i] = numarray;
		}	// End For Loop
		
		int outputArray = sumArray(allarray , maxarray);
		System.out.println(outputArray);	//	เเสดงค่าของ outputArray
		input.close();	//	ปิดการรับค่าจากผู้ใช้
	}	//	End main
}	// End class lab1_11