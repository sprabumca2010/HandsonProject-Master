package org.gt.ho.selenium.taskset4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragdropmethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prabu_s\\Desktop\\dardencodebase\\Handson\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		String baseurl = "http://demo.guru99.com/test/drag_drop.html";
		driver.get(baseurl);
		driver.manage().window().maximize();
		
		WebElement bank = driver.findElement(By.id("credit2"));
		WebElement amount = driver.findElement(By.id("bank"));
		
		Actions drag = new Actions(driver);
		drag.dragAndDrop(bank, amount).perform();
		drag.dragAndDrop(amount, bank);
		
		WebElement frm2=driver.findElement(By.id("fourth"));
		WebElement to2=driver.findElement(By.id("amt7"));
		drag.dragAndDrop(frm2, to2).perform();
		
		WebElement frm3 = driver.findElement(By.id("credit1"));
		WebElement to3=driver.findElement(By.id("loan"));
		drag.dragAndDrop(frm3, to3).perform();
		
		WebElement frm4=driver.findElement(By.id("fourth"));
		WebElement to4=driver.findElement(By.id("amt8"));
		drag.dragAndDrop(frm4, to4).perform();
		
		WebElement over=driver.findElement(By.xpath("//a[text()='Perfect!']"));
		drag.moveToElement(over).perform();
		
		String name=over.getText();
		System.out.println(name);
		
		
		
		
	}
}