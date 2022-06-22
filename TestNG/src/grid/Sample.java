package grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Sample {

	@Test
	public void test1() throws MalformedURLException {

		DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WIN10);

		WebDriver driver = new RemoteWebDriver(new URL(" http://192.168.1.13:4444/wd/hub"), cap);

		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		System.out.println("Title is : " + driver.getTitle());

	}

}
