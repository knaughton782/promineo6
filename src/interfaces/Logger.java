package interfaces;

public interface Logger {
	
	//signatures of any class that implements the interface
	//these are different levels of logging
	
	public void  info(String info);
	public void warning(String warning);
	public void error(String error);
	public void fatal(String fatal);
	
	
	
}
