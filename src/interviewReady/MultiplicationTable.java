package interviewReady;

import java.util.Arrays;

public class MultiplicationTable {

	public static void main(String[] Args) {
		
		int[][] table = new int[13][13];
		table[0][0] = 0;
		
		for(int i = 0; i <= 12; i++){
			
			table[i][0] = i; 
			table[0][i] = i;
			
			//populate inner table
			for(int j = 1; j <= 12; j++) {
				//populate bottom left of table
				table[i][j] = table[i][0] * table[0][j];
				//populate bottom right of table
				table[j][i] = table[0][i] * table[j][0];
			}
			
		}
		
		
		//Print 2d array
		for(int[] row : table) {
			System.out.println(Arrays.toString(row));
		}
		
			
	}
}
