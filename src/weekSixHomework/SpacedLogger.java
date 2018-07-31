package weekSixHomework;

public class SpacedLogger implements Logger {

	@Override
	public void log(String log) {
			
		//Another way is to loop the number of times of the 
		//length of the string that is passed in, and then 
		//create a StringBuilder and append each letter of 
		//the string followed by a space to the StringBuilder
		
		for (int i = 0; i < log.length(); i++) {
			StringBuilder sb = new StringBuilder();
			System.out.print(sb.append(log.charAt(i) + " "));
					
		}
	
		
	}

	@Override
	public void error(String error) {
		
		System.out.println("\n");
		System.out.print("Error: ");
		for (int i = 0; i < error.length(); i++) {
			StringBuilder sb = new StringBuilder();
			System.out.print(sb.append(error.charAt(i) + " "));
					
		}
		System.out.println("\nTHIS ONE WAS HARD!!! :) ");
		
	}

}
