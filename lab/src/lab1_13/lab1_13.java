package lab1_13;
import java.util.Scanner;

public class lab1_13 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        int num001 = input.nextInt();
        int num002 = input.nextInt();
        int[][] grid = new int[num001][num002];
        
        for (int i = 0; i < num001; i++) {
            for (int j = 0; j < num002; j++) {
                grid[i][j] = input.nextInt();
            }
        }
        
        int Dashboard = 0;
        for (int i = 0; i < num001; i++) {
            for (int j = 0; j < num002; j++) {
                if (grid[i][j] == 1) {
                	Dashboard++;
                }
            }
        }
        System.out.println(Dashboard);
        input.close();
    }
}