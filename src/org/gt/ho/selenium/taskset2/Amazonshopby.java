package org.gt.ho.selenium.taskset2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazonshopby {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prabu_s\\Desktop\\dardencodebase\\Handson\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		String baseurl = "https://www.amazon.in/";
		driver.get(baseurl);
		//driver.manage().window().maximize();	

		//Select the shop by category
		WebElement amz = driver.findElement(By.id("nav-link-shopall"));
		amz.click();
		
		//Select the all Book category
		WebElement books = driver.findElement(By.xpath("//a[text() = 'All Books']"));
		books.click();
		
		
	}

}
