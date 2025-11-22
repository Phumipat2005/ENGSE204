package lab1_9;
import java.util.Scanner;	//	เพิ่มฟังค์ชั่นรับค่าจากผู้ใช้เข้ามา

public class lab1_9 {
	public static void main(String[] args) {
		System.out.print("Enter number : ");
		Scanner input = new Scanner(System.in);
		int array = input.nextInt();
		int [] allarray = new int [array];
		
		for (int i = 0; i < allarray.length; i++) {
			int arraynum = input.nextInt();
			allarray[i] = arraynum;
		}	//	End For Loop

		int sum = 0;
        for (int i = 0; i < allarray.length; i++) {
        	sum += allarray[i];
        }	//	End For Loop
        
        double average = (double) sum / allarray.length;
        System.out.println(average);
        input.close();	// ปิดการรับค่าจากผู้ใช้
	}
}