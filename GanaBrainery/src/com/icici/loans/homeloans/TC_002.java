package com.icici.loans.homeloans;

import org.openqa.selenium.By;

public class TC_002 extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
		init();
		
		launchBrowser("chromebrowser");
		
		launchUrl("hdfcurl");
		
		driver.manage().window().maximize();
		
		/*
		 * String title = driver.getTitle(); System.out.println(title);
		 * 
		 * String url = driver.getCurrentUrl(); System.out.println(url);
		 * 
		 * driver.manage().deleteAllCookies();
		 * 
		 * driver.navigate().back();
		 * 
		 * Thread.sleep(4000);
		 * 
		 * driver.navigate().forward();
		 * 
		 * Thread.sleep(4000);
		 * 
		 * driver.navigate().refresh();
		 */
		
		//driver.close();
		
		driver.findElement(By.linkText("REFER NOW")).click();
		
		driver.close();
		
		
	}

}
