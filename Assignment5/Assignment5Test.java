import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

public class Assignment5Test {

	@Test
	public void testWriteChars() {
		Assignment5 test = new Assignment5();
		
		//instantiate outContent and set it to the console output with printstream
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(outContent));
	    
	    //Calling the writeChars method
	    test.writeChars(5);
		
		
		// set the expected output for the method while running n=5
		String expOutput = "<<*>>";
		
		//using assertEquals to compare expected expOutput and the result of outContent of writeChars through PrintStream
		assertEquals(outContent.toString(),expOutput);
	}
	
	@Test
	public void testWriteChars2() {
		Assignment5 test = new Assignment5();
		
		//instantiate outContent and set it to the console output with printstream
	    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(outContent));
	    
		// set the expected output for the method while running n=8
		test.writeChars(8);
		
		
		// get expected output
		String expOutput = "<<<**>>>";
		
		
		//using assertEquals to compare expected expOutput and the result of outContent of writeChars through PrintStream
		assertEquals(outContent.toString(),expOutput);
	}
	
	@Test
	public void testWriteChars3() {
		Assignment5 test = new Assignment5();
		
		//instantiate outContent and set it to the console output with printstream
	    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(outContent));
	    
	    //Calling the writeChars method
		test.writeChars(1);
		
		
		// set the expected output for the method while running n=1
		String expOutput = "*";
		
		
		//using assertEquals to compare expected expOutput and the result of outContent of writeChars through PrintStream
		assertEquals(outContent.toString(),expOutput);
	}
	
	
	
	


}
