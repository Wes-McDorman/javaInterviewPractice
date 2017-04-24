package interviewReady;

public class StringBuildVsBuff {
	
	public static void main(String[] args) {
		//Create objects
		String str = new String("Hello"); 
		StringBuilder builder = new StringBuilder("Hello");
		StringBuffer buffer = new StringBuffer("Hello");
		
		//Concat or Append
		str.concat(" Hi!");
		builder.append(" Hi!");
		buffer.append(" Hi!");
		
		//print
		System.out.println(str); //IMMUTABLE!
		System.out.println(builder); //MUTABLE
		System.out.println(buffer); //MUTABLE
		
		
	}

}
