package org.gt.ho.selenium.taskset3;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class greens {
	
	public static void main(String[] args) throws AWTException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\prabu_s\\Desktop\\dardencodebase\\Handson\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://www.greenstechnologys.com");
	
	WebElement cer = driver.findElement(By.xpath("//a[text() = 'Certifications']"));
	Actions activ = new Actions(driver);
	activ.moveToElement(cer).perform();
	activ.contextClick(cer).perform();
	
	Robot rob = new Robot();
	rob.keyPress(KeyEvent.VK_DOWN);
	rob.keyRelease(KeyEvent.VK_DOWN);
	rob.keyPress(KeyEvent.VK_DOWN);
	rob.keyRelease(KeyEvent.VK_DOWN);
	rob.keyPress(KeyEvent.VK_ENTER);
	rob.keyRelease(KeyEvent.VK_ENTER);
	
	
	
	
		
	}

}
