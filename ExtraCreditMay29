//Bennett Kielbon
//ITC 155 
//Extra Credit May29

//only managed to do bubble sort, couldn't figure out code for BOGO sort


//25 Extra credit points available for correct and complete assignments turned in on time.

//1. Research additional sorting algorithms to the ones we implemented in class, select two sorting algorithms and code the implementation( e.g. bubble sort and bogo sort).

//2. Comment each sorting algorithm to clearly outline the steps of the algorithm as well as the complexity class.

//3. Add tests for each algorithm. jUnit use is optional.

//bubble sort will have a big oh of O(n^2) because it runs nested for for loops 
//
import java.util.Arrays;

public class BubbleSort {

//main for test
    public static void main(String[] args) { 

        int[] array = {5,4,3,2,1, 22, 33, 5, 18, 45};
        
        //print unsorted
        System.out.println(Arrays.toString(array));
        
        //run bubble sort method
        bubbleSortMethod(array);
        
        //print sorted
        System.out.println(Arrays.toString(array));

    }
    
    

    public static void bubbleSortMethod(int[] input) {

    		//outer loop than runs from the start of the list to the length-1
        for (int i = 0; i <input.length - 1; i++) {   

            int temp = 0;
            //the inner loop will the the length-1 -i so it doesn't have to sort the already sorted part of the list
            for (int j = 0; j < input.length-1-i; j++) {
            	//compares the items in the list and swaps them if item on the left is greater
                if (input[j] > input[j+1]) {	            
                		temp=input[j];
                		input[j]=input[j+1];
                		input[j+1]=temp;
                		
                    
                }
            }


        }

    }
    
    

}
