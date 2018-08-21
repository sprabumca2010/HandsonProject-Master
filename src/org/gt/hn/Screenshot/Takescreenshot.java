package org.gt.hn.Screenshot;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.host.file.File;

public class Takescreenshot {
	private static OutputType outputType;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prabu_s\\Desktop\\dardencodebase\\Handson\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();


		String baseurl = "https://www.amazon.in/";
		driver.get(baseurl);
		
		TakesScreenshot tk = (TakesScreenshot)driver;
		File f =tk.getScreenshotAs(outputType.FILE);
		System.out.println(f);
		FileUtils.copyFile(f, dest)
		
		
	}
}
