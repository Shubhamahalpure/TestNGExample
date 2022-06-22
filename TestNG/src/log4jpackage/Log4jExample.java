package log4jpackage;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.Test;

public class Log4jExample {
     static Logger lgr;
	
	@Test(priority=1)
	public void setUp(){
		
		lgr=Logger.getLogger("log4jpackage");// provide test name/class name as a parameter
		PropertyConfigurator.configure("Log4j.properties");
		
		lgr.info("setup method is started");
		lgr.info("setup method is in progressing");
		
		//Add configuration steps
		System.out.println("This is setup method");
	}
	
	@Test(priority=2)
	public void login() {
		lgr.info("login method is started ");
		System.out.println("This is login test");
		lgr.info("login is progress");
		lgr.info("login is completed");
		lgr.info("login is passed");
	}
	
	@Test(priority=3)
	public void logout() {
		lgr.info("logout is completed");
		System.out.println("This is logout test");
	}
}
