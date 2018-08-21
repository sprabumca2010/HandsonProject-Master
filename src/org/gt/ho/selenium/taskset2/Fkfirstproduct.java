package org.gt.ho.selenium.taskset2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fkfirstproduct {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prabu_s\\Desktop\\dardencodebase\\Handson\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		String baseurl = "https://www.flipkart.com/";
		driver.get(baseurl);
		//driver.manage().window().maximize();

		driver.findElement(By.className("_2AkmmA _29YdH8")).click();
		
				
	}
}