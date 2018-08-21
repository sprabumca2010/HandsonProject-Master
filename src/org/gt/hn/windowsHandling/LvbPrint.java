package org.gt.hn.windowsHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LvbPrint {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prabu_s\\Desktop\\dardencodebase\\Handson\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();


		String baseurl = "https://www.lvbankonline.in/lvbretail/RetailLogin.html";
		driver.get(baseurl);

		WebElement resetclick = driver.findElement(By.xpath("//*[@id=\"Table10\"]/tbody/tr[2]/td/a"));
		resetclick.click();

		String RSET = driver.getWindowHandle();
		System.out.println(RSET);

		driver.switchTo().window(RSET);	

		WebElement resetclick2 = driver.findElement(By.xpath("//td[@class='Instruction']/div/h4/a"));
		resetclick2.click();







	}

}
