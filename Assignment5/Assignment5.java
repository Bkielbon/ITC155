//Bennett Kielbon
//ITC 155 
//Assignment5
//Write a recursive method called writeChars that accepts an integer parameter n and that prints out a total of n characters.
//The middle character of the output should always be an asterisk ("*"). If you are asked to write out an even number of characters,
//then there will be two asterisks in the middle ("**"). Before the asterisk(s) you should write out less-than characters ("<").
//After the asterisk(s) you should write out greater-than characters (">"). Your method should throw an IllegalArgumentException if 
//it is passed a value less than 1. For example, the following calls produce the following output:




public class Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		writeChars(1);
		System.out.println();
		writeChars(2);
		System.out.println();
		writeChars(3);
		System.out.println();
		writeChars(4);
		System.out.println();
		writeChars(5);
		System.out.println();
		writeChars(6);
		System.out.println();
		writeChars(7);
		System.out.println();
		writeChars(8);
		System.out.println();
	


	}
	
	public static void writeChars(int n) {
		
		//Throws illegal argument exception if less than 1
	    if (n < 1) {
	        throw new IllegalArgumentException();
	        
	    }  

	    	//BASE CASE 1 : if n is reduced to 1 it prints * --> odd numbers reduce to this base case 
	    if (n == 1) {
	        System.out.print( "*");
	    } 
	    
	    // BASE CASE 2 if n is reduced to 2 it will print two *'s --> even numbers reduce to this base case 
	    else if (n==2) {
    		System.out.print("**");
	    }
	    

	    // otherwise, if it doesn't meet either base case, Prints a "<", calls the method recursively passing in (n-2) then prints a ">" after
	    else {
	        System.out.print("<");
	       
	        		writeChars(n - 2);
	        
	        
	       System.out.print(">");
	       
	    	}

	}

}
