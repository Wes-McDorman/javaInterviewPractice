package salesfusionPlatform;

import java.util.ArrayList;

public class Contact extends Contacts{
	
	private int contactID;
	private String rating;
	private int normalizedScore;
	
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
