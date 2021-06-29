import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		//driver.get("http://www.yahoo.com");
		//driver.navigate().back();
		driver.get("http://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("manish");
		driver.findElement(By.name("pass")).sendKeys("Khnana");
		driver.findElement(By.linkText("Forgotten password?")).click();
		//driver.close();
	}

}
