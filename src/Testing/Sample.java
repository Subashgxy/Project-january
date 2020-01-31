package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");
		WebDriver face = new ChromeDriver();
		face.get("https://www.facebook.com/");
		WebElement user = face.findElement(By.id("email"));
		user.sendKeys("subashgxy");
		WebElement pass = face.findElement(By.id("pass"));
		pass.sendKeys("12345");
		//sample
		// jujuju
		
	}

}
