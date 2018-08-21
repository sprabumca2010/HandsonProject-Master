package org.gt.ho.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prabu_s\\Desktop\\dardencodebase\\Handson\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//Maximize the window
		driver.manage().window().maximize();

		//Launch the FB site
		String baseUrl = "https://www.facebook.com/";
		driver.get(baseUrl);
		/*		
		//Registration 
		WebElement fbfn = driver.findElement(By.id("u_0_j"));
		WebElement fbsn = driver.findElement(By.id("u_0_l"));
		WebElement fbeid = driver.findElement(By.id("u_0_o"));
		WebElement fbreid = driver.findElement(By.id("u_0_r"));
		WebElement fbnp = driver.findElement(By.id("u_0_v"));
		WebElement fbsu = driver.findElement(By.id("u_0_11"));


		//Drop Down Selection
		WebElement fbdd = driver.findElement(By.id("day"));
		WebElement fbm = driver.findElement(By.id("month"));
		WebElement fby = driver.findElement(By.id("year"));
		WebElement fbg = driver.findElement(By.id("u_0_a"));



		//Passing values
		fbfn.sendKeys("Test");
		fbsn.sendKeys("Testing");
		fbeid.sendKeys("testingreservation@gmail.com");
		fbreid.sendKeys("testingreservation@gmail.com");
		fbnp.sendKeys("Dardenuser12");

		//Passing Drop Down values
		fbdd.sendKeys("10");
		fbm.sendKeys("Jan");
		fby.sendKeys("1988");
		fbg.click();
		fbsu.click();
		 */

		//FB Login 

		WebElement fbemail =  driver.findElement(By.id("email"));
		WebElement fbpas =  driver.findElement(By.id("pass"));
		WebElement fbli =  driver.findElement(By.id("loginbutton"));

		// FB Passing values
		fbemail.sendKeys("testingreservation@gmail.com");
		fbpas.sendKeys("Dardenuser12");
		fbli.click();



	}
}
