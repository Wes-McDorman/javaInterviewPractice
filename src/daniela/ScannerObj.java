package daniela;

import java.util.Scanner;


public class ScannerObj {
	
	public static void main(String args[]){  
		
		
		Scanner elScano = new Scanner(System.in);
		
		System.out.println("Enter your first number:");
		int intUno = elScano.nextInt();
		System.out.println("Enter your second number:");
		int intDos = elScano.nextInt();
		System.out.println("Enter your third number:");
		int intTres = elScano.nextInt();
		
		int avg = (intUno + intDos + intTres)/3;
		int herro = GettersAndSetters.getSnekyWithIt();
		GettersAndSetters.setSnekyWithIt(69);
		System.out.println(avg);
		elScano.close();
	}
}
