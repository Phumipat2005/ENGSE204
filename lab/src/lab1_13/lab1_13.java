package lab1_13;
import java.util.Scanner;	//	import การรับค่าจากผู้ใช้

public class lab1_13 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        int num001 = input.nextInt();
        int num002 = input.nextInt();
        int[][] grid = new int[num001][num002];
        
        for (int i = 0; i < num001; i++) {
            for (int j = 0; j < num002; j++) {
                grid[i][j] = input.nextInt();
            }	//	End For Loop
        }	//	End For Loop
        
        int Dashboard = 0;
        for (int i = 0; i < num001; i++) {
            for (int j = 0; j < num002; j++) {
                if (grid[i][j] == 1) {
                	Dashboard++;
                }	//	End if
            }	// End For Loop
        }	// End For Loop
        System.out.println(Dashboard);	//	แสดงค่าของ Dashboard
        input.close();	//	ปิดการรับค่าจากผู้ใช้งาน
    }	//	End main
}	// End class