package Parallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverFactory {
	static WebDriver create(String type) throws IllegalAccessException {
		WebDriver driver;
		
		switch(type) {
		
		case "chrome":
			driver=new ChromeDriver();
			break;
			default:
				throw new IllegalAccessException();
		}
		
		return driver;
		
	}
}
