package salesfusionPlatform;

import java.util.ArrayList;

public class Contact extends Contacts implements ScoreCalculator{
	
	private int contactID;
	private String rating;
	private int normalizedScore;
	private int webScore;
	private int emailScore;
	private int socialScore;
	private int webinarScore;
	
	ArrayList<String> transactions = new ArrayList<String>();
	
	public void addTransactions(String transaction){
		transactions.add(transaction);
	}
	
	public String getTransactions() {
		String returnString = "";
		
		for(String t : transactions) {
			returnString +=   t + " ";
		}
		
		return returnString;
	}
	
	public double getRawScore() {
		//calculate raw score value
		double rawValue = 0;
		rawValue += webScore * 1;
		rawValue += emailScore * 1.2;
		rawValue += socialScore * 1.5;
		rawValue += webinarScore * 2.0;
		
		return rawValue;
	}
	
	public void setContactID(int ID) {
		this.contactID = ID;
	}
	
	public int getContactID() {
		return contactID;
	}
	
	public static Contact createContact(ArrayList<String> transaction) {
		return new Contact();
	}

	
	

}
