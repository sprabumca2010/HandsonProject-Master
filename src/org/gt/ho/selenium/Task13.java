package org.gt.ho.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task13 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prabu_s\\Desktop\\dardencodebase\\Handson\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//Maximize the window
		driver.manage().window().maximize();

		//Launch the FB site
		String baseUrl = "http://www.greenstechnologys.com/selenium-course-content.html";
		driver.get(baseUrl);

		WebElement fbdnl = driver.findElement(By.linkText("Download Links click here"));
		fbdnl.click();
		/*
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement fbcls = driver.findElement(By.xpath("//*[@id='download']/div/div/div[3]/button"));
		//WebElement fbclo = driver.findElement(By.className("btn btn-default"));
*/
		//fbcls.click();




	}
}
