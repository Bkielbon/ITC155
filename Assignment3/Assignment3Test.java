import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import org.junit.Test;

public class Assignment3Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create a map
		Map<String, String> uniqueMap = new HashMap<String, String>();
		
		//put entries of values and keys into the map 
		uniqueMap.put("Jessica", "Miller");
		uniqueMap.put("Marty", "Stepp");
		uniqueMap.put("James", "Stepp");


		//print out the output and run method using the code inserted in the map in main
		
		System.out.println(isUnique(uniqueMap));
		
		
	

	}

	
	public static boolean isUnique(Map<String, String> inputMap) {
		
		 //creating a hashset 
		 HashSet<String> hashsetValues = new HashSet<String>();
		  
		 //checking if the values in the map already exist or not
		  for (String value : inputMap.values()) {
		   
			  //if the value exists already exists it returns false
			  if (hashsetValues.contains(value)) {
		      return false;
		    }
			  //otherwise if it doesn't exist it adds the value
			  else { 
		    hashsetValues.add(value);
			  }
		  }
		  //print out the values in the hash set and return true, put this value lower to make boolean happy
		  System.out.println(hashsetValues);
		 
		  return true;
		}

}
