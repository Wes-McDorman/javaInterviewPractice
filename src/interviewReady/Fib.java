package interviewReady;

public class Fib {
	public static void main(String[] args) {
		int first = 0;
		int second = 1;
		int third = 1;
		
		for(int i = 0; i <= 10; i++) {
			System.out.println(first);
			third = first + second;
			first = second;
			second = third;
			
		}
	}
	


}
