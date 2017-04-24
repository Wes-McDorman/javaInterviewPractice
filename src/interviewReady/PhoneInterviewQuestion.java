package interviewReady;

import java.util.Arrays;

public class PhoneInterviewQuestion {
	
	public String replaceChar(String str, char ch) {
		String newStr = "";
		
		for(int i = 0; i <  str.length(); i++) {
			if(str.charAt(i) == ch) {
				newStr += '!'; 
			} else {
				newStr += str.charAt(i);
			}
		}
		
		return newStr;
	}
	
	
	
	
	
   public static void main(String[] args) {
	   
	   int num = 0;
	   num++;
	   int[][] ints = new int[2][4];
	   
	   for(int i = 0; i < 4; i++) {
		   ints[0][i] = num;
	   }
	   for(int[] row : ints){
		   System.out.println(Arrays.toString(row));
	   }
	   
	   PhoneInterviewQuestion pIQ = new PhoneInterviewQuestion();
	   
	   System.out.println(pIQ.replaceChar("Strandddgggg!", 'd'));
   }

}
