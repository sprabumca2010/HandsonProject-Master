package org.gt.ho.selenium.taskset2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseaction2 {


	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prabu_s\\Desktop\\dardencodebase\\Handson\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		String baseurl = "http://www.greenstechnologys.com/";
		driver.get(baseurl);
		//driver.manage().window().maximize();

		// select the course
		WebElement courser = driver.findElement(By.xpath("//a[text() = 'COURSES']"));
		Actions AC = new Actions(driver);
		AC.moveToElement(courser).perform();

		// select the FLAnguage
		WebElement courser1 = driver.findElement(By.xpath("//span[text()= 'Foreign Languages']"));
		Actions AC1 = new Actions(driver);
		AC1.moveToElement(courser1).perform();

		//select the German Language
		WebElement courser2 = driver.findElement(By.xpath("//span[text()= 'German']"));
		Actions AC2 = new Actions(driver);
		AC2.moveToElement(courser2).perform();
		courser2.click();


	}
}
