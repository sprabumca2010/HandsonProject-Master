package org.gt.ho.selenium.taskset2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amzstarthere {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prabu_s\\Desktop\\dardencodebase\\Handson\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		//Launch the site
		String baseusrl = "https://www.amazon.in/";
		driver.get(baseusrl);
		driver.navigate().refresh();
		Thread.sleep(5000);

		Actions ac1 = new Actions(driver);

		// select the start here link
		WebElement sign = driver.findElement(By.id("nav-link-yourAccount"));
		ac1.moveToElement(sign).perform();
		Thread.sleep(5000);

		ac1.moveToElement(sign).perform();
		WebElement start = driver.findElement(By.xpath("//*[@id=\"nav-flyout-ya-newCust\"]/a"));
		start.click();
		
		//Sign In
		driver.findElement(By.className("a-link-emphasis")).click();
		driver.findElement(By.id("ap_email")).sendKeys("testingreservation@gmail.com");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("Dardenuser12");
		driver.findElement(By.id("signInSubmit")).click();
		
		
		
	}

}
