//Bennett Kielbon
//ITC 155 
//Assignment4 
//Write a method called writeSequence that accepts an integer n as a parameter and prints to the console a 
//symmetric sequence of n numbers composed of descending integers that ends in 1, followed by a sequence of 
//ascending integers that begins with 1. The following table indicates the output that should be produced for 
//various values of n: Notice that when n is odd the sequence has a single 1 in the middle, whereas for even 
//values it has two 1s in the middle. Your method should throw an IllegalArgumentException if it is passed a value less than 1.




public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		writeSequence(1);
		System.out.println();
		writeSequence(2);
		System.out.println();
		writeSequence(3);
		System.out.println();
		writeSequence(4);
		System.out.println();
		writeSequence(5);
		System.out.println();
		writeSequence(6);
		System.out.println();
		writeSequence(7);
		System.out.println();
		writeSequence(8);
		System.out.println();
		writeSequence(9);
		System.out.println();
		writeSequence(10);
		System.out.println();


	}
	
	public static void writeSequence(int n) {
		
		//Throws illegal argument exception if less than 1
	    if (n < 1) {
	        throw new IllegalArgumentException();
	        
	    }  

	    	//BASE CASE 1 : if n is reduced to 1 it prints 1 and a space
	    if (n == 1) {
	        System.out.print( 1 + " ");
	    } 
	    
	    // BASE CASE 2 if n is reduced to 2 it will print two 1's followed by a space
	    else if (n==2) {
    		System.out.print("1 1 ");
	    }
	    
	    //if n is even it will divide n by 2, print it followed by a space, call the method recursively passing in n-2 then print n/2 again
	    else if(n%2==0) {
	    		System.out.print((n/2) + " ");
	    		
	        writeSequence(n - 2);

	    		System.out.print((n/2) + " ");
	    		
	    		
	    }
	    
	    // otherwise, meaning if n is odd it will add one to n before dividing it by 2 print that, call the method recursively 
	    //passing in n-2 (reducing n by 2 next time) then it prints n+1 divided by 2 again
	    else {
	        System.out.print((n + 1) / 2 + " ");
	       
	            writeSequence(n - 2);
	        
	        
	       System.out.print((n + 1) / 2 + " ");
	    	}

	}

}
