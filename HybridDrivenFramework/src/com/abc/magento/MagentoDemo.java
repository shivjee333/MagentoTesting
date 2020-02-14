package com.abc.magento;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MagentoDemo {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\shiv\\workspace\\HybridDrivenFramework\\src\\com\\abc\\utilities\\hybriddrivenframework.properties");

		Properties p = new Properties();
		p.load(fis);
		
		String urldata = p.getProperty("url");
		String usernamedata = p.getProperty("username1");
		String passworddata = p.getProperty("password1");
		
		String myacctkey = p.getProperty("myacct");
		String usernamekey = p.getProperty("username");
		String passwordkey = p.getProperty("password");
		String loginkey = p.getProperty("login");
		String logoutkey = p.getProperty("logout");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(urldata);
		driver.findElement(By.xpath(myacctkey)).click();
		driver.findElement(By.xpath(usernamekey)).sendKeys(usernamedata);
		driver.findElement(By.xpath(passwordkey)).sendKeys(passworddata);
		driver.findElement(By.xpath(loginkey)).click();
		driver.findElement(By.xpath(logoutkey)).click();
		driver.quit();
		
	}

}
