package com.icici.loans.homeloans;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest 
{
	public static WebDriver driver;
	public static String projectPath=System.getProperty("user.dir");
	public static Properties p;
	
	public static FileInputStream fis;
	public static Properties envprop;
	public static Properties prop;
	
	public static void init() throws Exception
	{
		fis=new FileInputStream(projectPath+"//data.properties");
		p=new Properties();
		p.load(fis);
		
		prop=new Properties();
		envprop=new Properties();
		
		fis=new FileInputStream(projectPath+"//environment.properties");
		prop.load(fis);
		String env=prop.getProperty("env");
		System.out.println(env);
		
		fis=new FileInputStream(projectPath+"//"+env+".properties");
		envprop.load(fis);
		
		System.out.println(envprop.getProperty("zohourl"));
	}
	
	public static void launchBrowser(String browser)
	{
		if(p.getProperty(browser).equals("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver", projectPath+"//drivers//chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(p.getProperty(browser).equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", projectPath+"//drivers//geckodriver.exe");
			driver=new FirefoxDriver();
		}
		
	}
	
	public static void launchUrl(String url)
	{
		//driver.get(p.getProperty(url));
		//driver.navigate().to(p.getProperty(url));
		driver.navigate().to(envprop.getProperty(url));
	}

}
