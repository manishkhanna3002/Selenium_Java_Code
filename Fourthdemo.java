import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fourthdemo {

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
		driver.get("http://login.salesforce.com");
		driver.findElement(By.name("username")).sendKeys("manish");
		driver.findElement(By.name("pw")).sendKeys("Khnana");
		driver.findElement(By.xpath("//*[@id='Login']")).click();;
		System.out.println(driver.findElement(By.cssSelector("#error")).getText());
		//driver.findElement(By.linkText("Forgotten password?")).click();
		//driver.close();
	}

}
