package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Hotel {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\ELCOT\\\\eclipse-workspace\\\\Selenium1\\\\Driver\\\\chromedriver.exe");
		WebDriver hotel = new ChromeDriver();
		hotel.get("https://www.adactin.com/HotelApp/");
		WebElement user = hotel.findElement(By.id("username"));
		user.sendKeys("subashgxy");
		WebElement pwd = hotel.findElement(By.id("password"));
		pwd.sendKeys("Subash19$");
		WebElement login = hotel.findElement(By.id("login"));
		login.click();
		WebElement month = hotel.findElement(By.name("location"));
		Select a = new Select(month);
		a.selectByValue("London");
		WebElement hot = hotel.findElement(By.name("hotels"));
		Select b = new Select(hot);
		b.selectByValue("Hotel Sunshine");
		WebElement room = hotel.findElement(By.name("room_type"));
		Select c = new Select(room);
		c.selectByValue("Double");
		WebElement numb = hotel.findElement(By.name("room_nos"));
		Select d = new Select(numb);
		d.selectByValue("2");
		//WebElement date = hotel.findElement(By.name("datepick_in"));
		//Select e = new Select(date);
		//e.selectByIndex(01/01/2020);
		//WebElement chekout = hotel.findElement(By.name("datepick_out"));
		//Select f = new Select(chekout);
		//f.selectByIndex(02/01/2020);
		WebElement adults = hotel.findElement(By.name("adult_room"));
		Select g = new Select(adults);
		g.selectByIndex(3);
		WebElement child = hotel.findElement(By.name("child_room"));
		Select h = new Select(child);
		h.selectByIndex(3);
		WebElement search = hotel.findElement(By.id("Submit"));
		search.click();
		WebElement icon = hotel.findElement(By.id("radiobutton_0"));
		icon.click();
		WebElement cont = hotel.findElement(By.id("continue"));
		cont.click();
		WebElement fname = hotel.findElement(By.id("first_name"));
		fname.sendKeys("subash");
		WebElement lstname = hotel.findElement(By.id("last_name"));
		lstname.sendKeys("murthy");
		WebElement address = hotel.findElement(By.id("address"));
		address.sendKeys("No 34 ashok nagar vellore");
		WebElement card = hotel.findElement(By.id("cc_num"));
		card.sendKeys("23452345586950965");
		WebElement type = hotel.findElement(By.name("cc_type"));
		Select i = new Select(type);
		i.selectByValue("VISA");
		WebElement edate = hotel.findElement(By.name("cc_exp_month"));
		Select j = new Select(edate);
		j.selectByIndex(3);
		WebElement eyear = hotel.findElement(By.name("cc_exp_year"));
		Select k = new Select(eyear);
		k.selectByValue("2021");
		WebElement cvv = hotel.findElement(By.id("cc_cvv"));
		cvv.sendKeys("343");
		WebElement book = hotel.findElement(By.id("book_now"));
		book.click();
	
		}
}
