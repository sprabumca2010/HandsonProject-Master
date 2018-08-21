package org.gt.ho.selenium.taskset3;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AdactinClick {

	public static void main(String[] args) throws AWTException {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prabu_s\\Desktop\\dardencodebase\\Handson\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();

		//Launch the site
		driver.get("http://www.adactin.com/HotelApp/index.php");
		WebElement usr =driver.findElement(By.id("username"));
		usr.sendKeys("Username");
		
			Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_A);
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);
		
		WebElement pass=driver.findElement(By.id("password"));
		pass.click();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V); 
	}
}

