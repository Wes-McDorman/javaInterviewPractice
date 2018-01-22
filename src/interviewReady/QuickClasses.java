package interviewReady;

import java.util.ArrayList;

import java.util.Iterator;

public class QuickClasses {

    public boolean isOdd(String str) {
		if (str.length() % 2 == 0) {
			return false;
		} else {
			return true;
		}
		
	}
    
    
    //Overload!
    public boolean isOdd(int num) {
		if (num % 2 == 0) {
			return false;
		} else {
			return true;
		}
		
	}
    
    public int factorial(int num) {
    	int returnInt = num;
    	
    	for(int i = 1; i < num; i++) {
    		returnInt *= num - i;
    	}
    	
    	return returnInt;
    }
    
    public String reverseStr(String str) {
    	String rts = "";
    
    	for(int i = str.length()-1; i >= 0; i--) {
    		rts += str.charAt(i);
    	}
  
    	return rts;		
    }
    
    public boolean isPal(String str) {
    	QuickClasses qc = new QuickClasses();
    	String rts = qc.reverseStr(str);
    	
    	if(str.equals(rts)) {
    		return true;
    	} else {
    		return false;
    	}
    }
    
    
    public void printArray() {
    	ArrayList<String> aL = new ArrayList<String>();
    	aL.add("First String");
    	aL.add("Second String");
    	aL.add("Last String?");
    	Iterator<String> it = aL.iterator();
    	
    	while(it.hasNext()) {
    		System.out.print(it.next() + " ");
    	}
    	
    }
    
    public char firstRepeatedChar(String str) {
    	ArrayList<Character> chars = new ArrayList<Character>(); 
    	
    	for(int i = 0; i <= str.length(); i++ ) {
    		chars.add(str.charAt(i));
    		
    		for(char ch : chars) {
    			if(str.charAt(i) == ch) {
    				return str.charAt(i);
    			}
    		}
    	}
    	
    	return 0;
    }
    
    
    
    public static void main(String[] args) {
    	
    	//Always instantiate 
    	QuickClasses qc = new QuickClasses();
    	
    	System.out.println(qc.isOdd("12345"));
    	System.out.println(qc.isOdd(204));
    	int factorialInt = 4;
    	System.out.println("Factorial of " + factorialInt + ": "+ qc.factorial(factorialInt));
    	System.out.println("Reversed String: " +qc.reverseStr("STring!"));
    	System.out.println("Is a pal: " + qc.isPal("tacocat"));
    	
    	System.out.println("Repeated character: " + qc.firstRepeatedChar("qwertyWe"));
    	
    	qc.printArray();
    	
    	System.out.println("Binary? " + Integer.toString(5, 2));
    	System.out.println(" ");
    	
    }


}
