//Bennett Kielbon
//ITC 155
//Assignment 3


//Write a method isUnique that accepts a map whose keys and values are strings as a parameter and returns true if no two keys map to the 
//same value (and false if any two or more keys do map to the same value). For example, if
//the map contains the following key/value pairs,your method would return true:{Marty=Stepp, Stuart=Reges, Jessica=Miller, Amanda=Camp, Hal=Perkins}. 
//But calling it on the following map would return false, because of two mappings for Perkins and Reges: {Kendrick=Perkins, Stuart=Reges, Jessica=Miller, Bruce=Reges, Hal=Perkins}.


import java.util.*;


public class Assignment3 {

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
