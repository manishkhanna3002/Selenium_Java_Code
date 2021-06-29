package SeleniumGroup.SeleniumProject;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
	
public class Alert {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			System.setProperty("webdriver.chrome.driver", "C:/chromedriver/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
				
			driver.get("https://formy-project.herokuapp.com/switch-window");
			WebElement alertbutton = driver.findElement(By.id("alert-button"));
			alertbutton.click();
			
			org.openqa.selenium.Alert alert = driver.switchTo().alert();
			alert.accept();
			
			driver.quit();
	}

}
