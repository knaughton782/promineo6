package weekSixPractice;

public class Notes {
		 
	/* 
	 * Interfaces
	 * 		use abstract class when you know what you want some functionality to be
	 *  	you can use an interface to get around the problem of inheritance from only one class	
	 *  	interface only defines method signatures, you know what you want to happen but not how
	 *  	interface = contract
	 *  	Must have methods defined in the interface
	 *  	No code in the interface, just method signatures
	 *  	Implementing an interface obligates you to create the body for each method in the interface
	 *   	
	 *  
	 *  
	 *  Unit Testing
	 *  	Run application to make sure it runs as expected
	 *  	TDD test driven development
	 *  	
	 *  Homework Hint
	 *  	asterisk video	
	 *  
	 *  Debugging
	 *  	Run when something still compiles but is broken logic
	 *  	Step over still runs the code but doesn't shine the microscope on the method details
	 *  
	 */
	static StringBuilder sb = new StringBuilder();
	static String str = "";
	 
		public static void main(String[] args) {
		
		/*Write a method named createStringCount that takes an int and returns a String that counts from zero to the
		 * 		value of the int passed in. For example, if you call `createStringCount(5);` you should get back: "012345".
		 * 		 Use a StringBuilder in the method. 
		 */
		System.out.println(createStringCount(6));
		
	}

	public static StringBuilder createStringCount(int numberPassedIn) {
		
		for (int i = 0; i <= numberPassedIn + 1; i++) {
			sb.append(str);
			str = "" + i;
							
		}
		return sb;
		
	}
	

}
