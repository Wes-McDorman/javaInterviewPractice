package salesfusionPlatform;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		//instantiate class for reading
		ReadCSV reader = new ReadCSV();
		
		//contact list
		List<Contact> contacts = new ArrayList<Contact>();
		
		ArrayList<String> CSVData;
		
		//read CSV file into ArrayList
		CSVData = reader.CSVreader("C:\\Users\\Wes\\workspace\\Testing\\src\\salesfusionPlatform\\contactInfo.csv");
		
		
		//check Array
		for(String t : CSVData) {
			System.out.println(t + " ");
		}
		
		
		
		//start processing data
		int currentContact = Integer.parseInt(CSVData.get(0));
    	
    	
		Contact contact = new Contact();
    	contact.setContactID(Integer.parseInt(CSVData.get(0)));
    	
    	
    	//loop through ArrayList to get individual contacts info in one place
    	for(int i = 0; i <= CSVData.size()-1; i++) {
    		
    		//currentContact = Integer.parseInt(infoArrList.get(i));
			//contact.setContactID(Integer.parseInt(infoArrList.get(i)));
    		
    		
			System.out.println((i) + " " + contact.getContactID() + " " + currentContact);
			
			if(Integer.parseInt(CSVData.get(i)) == currentContact) {
			contact.addTransactions(CSVData.get(i+1));
			contact.addTransactions(CSVData.get(i+2));
			
			} else {
				contacts.add(contact);
				
				currentContact++;
				contact.setContactID(Integer.parseInt(CSVData.get(i)));
				
				break;
			}
    		
			i += 2;
    	}
		
		
		System.out.println(contacts.size());
		
	}

}
