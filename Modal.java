package SeleniumGroup.SeleniumProject;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class Modal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://formy-project.herokuapp.com/modal");
		WebElement button = driver.findElement(By.id("modal-button"));
		button.click();
		
		//WebElement closebutton = driver.findElement(By.id("close-button"));
		
		WebElement closebutton = driver.findElement(By.xpath("/html/body/div[2]/form/div/div/div/div[3]/button[1]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", closebutton);
		
		//driver.quit();
	}

}
