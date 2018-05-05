//Test file for assignment 3 testing both true and false boolean. Replaced because i finally figured out how to properly run jUnit tests 

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class assignment3test {
	Assignment3 test = new Assignment3();

	
	

	@Test
	public void testIsUniqueFalse() {
		Map<String, String> uniqueMap = new HashMap<String, String>();
		
		//put entries of values and keys into the map with two keys mapping to the same value which should produce a false boolean
		uniqueMap.put("Jessica", "Miller");
		uniqueMap.put("Marty", "Stepp");
		uniqueMap.put("James", "Stepp");


		//test runs if boolean comes back as false 
		assertFalse(test.isUnique(uniqueMap));
		
			}

	@Test
	public void testIsUniqueTrue() {
		Map<String, String> uniqueMap = new HashMap<String, String>();
		
		//put entries of values and keys into the map with no overlapping keys which should produce a true boolean  
		uniqueMap.put("Jessica", "Miller");
		uniqueMap.put("Marty", "Stepp");
		
		//test runs true if boolean comes back true
		assertTrue(test.isUnique(uniqueMap));

		
		

	}

}
