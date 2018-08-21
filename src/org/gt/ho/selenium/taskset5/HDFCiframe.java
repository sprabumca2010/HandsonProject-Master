package org.gt.ho.selenium.taskset5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HDFCiframe {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prabu_s\\Desktop\\dardencodebase\\Handson\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();

		//Launch the site
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		WebElement usr =driver.findElement(By.id("fldLoginUserId"));
		usr.sendKeys("41691132");

	}

}