package weekSixHomework;

public class AsteriskLogger implements Logger {

	@Override
	public void log(String log) {
		System.out.println("***" + log + "***");
		System.out.println("           ");
		
	}

	@Override
	public void error(String error) {
		int boxLength  = error.length() + 13;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < boxLength; i++) {
			sb.append("*");
				
			} System.out.println(sb.toString());
			  System.out.println("***ERROR: " + error + "***");
			  System.out.println(sb.toString());
			  System.out.println("           ");
			
		}
		

}
