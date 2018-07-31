package interfaces;

public class Application {

	public static void main(String[] args) {
		
		Logger logger = new FileLogger();
		
		logger.info("Hello");
		logger.warning("Warning");
		logger.error("Error");
		logger.fatal("Fatal");
		
		logger.close();
	}

}
