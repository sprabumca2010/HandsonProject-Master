package org.gt.ho.selenium.taskset4;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amzfirstvalueamt {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prabu_s\\Desktop\\dardencodebase\\Handson\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		String baseurl = "https://www.amazon.in/";
		driver.get(baseurl);
		//driver.manage().window().maximize();

		WebElement txtname = driver.findElement(By.id("twotabsearchtextbox"));
		txtname.sendKeys("IPHONE X");
		txtname.sendKeys(Keys.ENTER);
		
		
	}
}
