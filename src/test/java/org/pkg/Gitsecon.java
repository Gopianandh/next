package org.pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gitsecon {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dorai\\eclipse-workspace\\Gitsecondd\\div\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	     driver.get("https://www.youtube.com/");
	     driver.findElement(By.xpath("(//a[@id='video-title-link'])[2]")).click();
	}

}
