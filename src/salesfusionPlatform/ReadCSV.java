package salesfusionPlatform;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadCSV {
	 public ArrayList<String> CSVreader(String filePath){

		 Scanner scan = null;
		 ArrayList<String> infoArrList = null;

	        try {
	        	//scan CSV file
	        	scan = new Scanner(new File(filePath));
	        	
	     
	        	//set to an int if needed
	        	//int contactNumber = Integer.parseInt(contactNum);
	        	
	        	infoArrList = new ArrayList<String>();
	        	
	        	while(scan.hasNext()) {
	        		
	        		infoArrList.add(scan.next());
	        		
	        	}
	        	
	        	
	        	
	        	

	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } finally {
	        	scan.close();
	            
	        	
	        }
	        return infoArrList;

	    }
	 
	

}
