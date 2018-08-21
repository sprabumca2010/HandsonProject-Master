package org.gt.ho.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handson {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\prabu_s\\Desktop\\dardencodebase\\Handson\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//launch Chrome and direct it to the Base URL
		String baseUrl = "http://demoqa.com/registration/";
		driver.get(baseUrl);
		
		// Maximize the Window
		driver.manage().window().maximize();
		
		// Find the locators
		WebElement txtfusrname = driver.findElement(By.id("name_3_firstname"));
		WebElement txtlusrname = driver.findElement(By.id("name_3_lastname"));
		WebElement Pnumber = driver.findElement(By.id("phone_9"));
		WebElement usr = driver.findElement(By.id("username"));
		WebElement email = driver.findElement(By.id("email_1"));
		
		
		//Insert the USRName
		txtfusrname.sendKeys("FirstName_Demo");
		txtlusrname.sendKeys("SecondName_Demo");
		Pnumber.sendKeys("9595959595");
		usr.sendKeys("Demo User");
		email.sendKeys("Testmail@mail.com");
		//Exit the screen
		//driver.quit();
		
		
	}

}
