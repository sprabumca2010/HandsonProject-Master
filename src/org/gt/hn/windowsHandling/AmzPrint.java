package org.gt.hn.windowsHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmzPrint {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prabu_s\\Desktop\\dardencodebase\\Handson\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();


		String baseurl = "https://www.amazon.com/";
		driver.get(baseurl);

		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("Iphone 7");
		search.sendKeys(Keys.ENTER);
		
		
		
	}
}
