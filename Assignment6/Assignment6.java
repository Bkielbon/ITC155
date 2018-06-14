//Bennett Kielbon 
//ITC 155 
//Assignment6
//May 15, 2018
//Chapter 13 	questions 4, 5, 6, 7.

import java.awt.List;
import java.util.*;


public class Assignment6q {
	//4. To which complexity class does the following algorithm belong? Consider N to be the length or size of the array or collection passed to the method. Explain your reasoning.
	
	   public static int[] mystery1(int[] list) {
	       int[] result = new int[2 * list.length];
	       for (int i = 0; i < list.length; i++) {
	           result[2 * i] = list[i] / 2 + list[i] % 2;
	           result[2 * i + 1] = list[i] / 2;
	       }
	 
	       return result;
	   }
	   
	   //This algorithm is O(N) because complexity grows in direct proportion to N 
	   
	   
	//5. To which complexity class does the following algorithm belong?
	   public static void mystery2(int[] list) {
	       for (int i = 0; i < list.length / 2; i++) {
	           int j = list.length - 1 - i;
	           int temp = list[i];
	           list[i] = list[j];
	           list[j] = temp;
	       } 
	   }
	   
	   //This algorithm is O(N) because complexity grows in direct proportion to N 

	   
	//6. To which complexity class does the following algorithm belong?
	   public static void mystery3(List<String> list) {
	       for (int i = 0; i < list.size() - 1; i += 2) {
	           String first = list.remove(i);
	           list.add(i + 1, first);
	       }
	}
	   //This algorithm is O(N2) because when things are stored and removed from the middle of the list it has to shift elements before or after causing significant complexity
	   
	   
	//7. To which complexity class does the following algorithm belong?
	   public static void mystery4(List<String> list) {
	       for (int i = 0; i < list.size() - 1; i += 2) {
	           String first = list.get(i);
	           list.set(i, list.get(i + 1));
	           list.set(i + 1, first);
	       }
	 }
	   ////This algorithm is O(N) becauase despite doing basically the same thing as mystery3 it swaps out items without removing them and having to shift the elements in the list 

}
