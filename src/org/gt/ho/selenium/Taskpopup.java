package org.gt.ho.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Taskpopup {

	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\prabu_s\\\\Desktop\\\\dardencodebase\\\\Handson\\\\drivers\\\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.greenstechnologys.com/selenium-course-content.html");
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/div[2]/div[9]/ul/li")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[127]/div/div/div[1]/button")).click();
}
}
