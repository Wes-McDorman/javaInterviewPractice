package toilet_Logic;

public class WaterSquirt {
	
	
	private boolean jet = false;
	
	public boolean isSquirting() {
		if(this.jet == false) {
			System.out.println("The jet is off");
		} else {
			System.out.println("THE JET IS ON! GET WET");
		}
		
		return this.jet;
	}
	
	public void stop() {
		this.jet = false;
	}
}
