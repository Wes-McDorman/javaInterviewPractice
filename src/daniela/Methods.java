package daniela;

public class Methods {
	
	//method that adds two integers together
	public static int addDis(int a, int b) {
		int c = a+b;
		return c;
	}
	
	//hello method
	public static void hello() {
		System.out.println("HELLO!");
	}
	
	//method that returns the lower of the two numbers (min)
	public static int returnMin(int a, int b) {
		if(a<b) {
			return a;
		} else {
			return b;
		}
		
	}
	
	
	//same method but takes in a String
	public static int returnMin(int a, int b, String f) {
		System.out.print(f + " ");
		if(a<b) {
			return a;
		} else {
			return b;
		}
		
	}
	
	//cheating on returnMax. lol.
	public static int returnMax(int a, int b) {
		int c = Math.max(a,b);
		return c;
	}
	//method that returns the last char of a String
	public static char returnLastChar(String whatever){
		char c = whatever.charAt(whatever.length()-1);
		return c;
	}
	

	//the main method that executes all the commands
	public static void main(String[] args) {
		hello();
		System.out.println(returnMin(1,3));
		System.out.println(returnMin(1,3, "Lolcats"));
		System.out.println(returnLastChar("Wes"));
		
		//create a person named "Daniela"
		person Daniela = new person();
		//set that person's stuff
		Daniela.age = 26;
		Daniela.car = "Ford";
		Daniela.BloodAlcoholContent = 0.00;
		Daniela.isDriving = true;
		Daniela.getsArrested = false;
		
		System.out.println("This person is " + Daniela.age + " years old.");
		
		//Creates a person named Wes
		person Wes = new person();
		//Set this persons parameters
		Wes.BloodAlcoholContent = 0.15;
		Wes.car = "KIA";
		
		//check if Wes is drunk
		if(Wes.BloodAlcoholContent > 0.02) {
			Wes.getsArrested = true;
		} else {
			Wes.getsArrested = false;
		}
		
		//print out if he was arrested or not 
		if(Wes.getsArrested == true) {
			System.out.println("Wes was arrested");
		} else {
			System.out.println("Wes was not arrested");
		}
		
	}
}


class person {
	String car; //person has a car
	int age; //person has an age
	double BloodAlcoholContent; //how drunk this person is
	boolean isDriving; //if the person is driving
	boolean getsArrested; //if the person goes to jail
}
