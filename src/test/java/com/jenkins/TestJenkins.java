package com.jenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestJenkins
{
	@Test
	public void Check()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Geethanjali_Pasala\\Downloads\\chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.quit();  
	
	}
}